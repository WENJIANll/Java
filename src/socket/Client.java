package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client extends Thread {
    Socket sock = null;

    public static void main(String[] args) {
        Client client = new Client("localhost",6666);
        client.start();
    }

    public Client(String ip,int port){
        try {
            sock = new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        try(var writer = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream(), StandardCharsets.UTF_8))){
            for (;;) {
                Thread t = new readmsg();
                t.start();
                System.out.print("请输入发送给服务端的信息 "); // 打印提示
                Scanner scanner = new Scanner(System.in);
                String stringtocli = scanner.nextLine(); // 读取一行输入
                writer.write(stringtocli);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class readmsg extends Thread{
        @Override
        public void run() {
            super.run();
            try(var reader = new BufferedReader(new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8))){
                while (true){
                    String fromclimsg = reader.readLine();
                    System.out.println("来自服务端的信息" + fromclimsg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}