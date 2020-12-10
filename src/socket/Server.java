package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Server extends Thread {

    ServerSocket server = null;
    Socket sock = null;

    public static void main(String[] args) {
        Server serversocket = new Server(6666);
        serversocket.start();
    }
    public Server(int port) {
        try {
            server = new ServerSocket(port);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        super.run();
        try{
            System.out.println("等待连接...");
            while (true){
                sock = server.accept();
                Thread t = new Sendmsgtocli();
                t.start();
                handle();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void handle() throws IOException {
        System.out.println(sock.getRemoteSocketAddress() + "链接成功");
//        var writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), StandardCharsets.UTF_8));
        try(var reader = new BufferedReader(new InputStreamReader(sock.getInputStream(), StandardCharsets.UTF_8))){
            while (true){
                String fromclimsg = reader.readLine();
                System.out.println("来自客户端的信息" + fromclimsg);
            }
        }
    }

    class Sendmsgtocli extends Thread{
        @Override
        public void run() {
            super.run();
            try {
                try(var writer = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream(), StandardCharsets.UTF_8))){
                    for (;;) {
                        System.out.print("请输入发送给客户端的信息 "); // 打印提示
                        Scanner scanner = new Scanner(System.in);
                        String stringtocli = scanner.nextLine(); // 读取一行输入
                        writer.write(stringtocli);
                        writer.newLine();
                        writer.flush();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}