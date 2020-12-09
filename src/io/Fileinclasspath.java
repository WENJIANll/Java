package io;

import java.io.IOException;
import java.io.InputStream;

public class Fileinclasspath {
    public static void main(String[] args) {
//        System.out.println(Fileinclasspath.class.getResourceAsStream("/default.properties"));

//        try(InputStream f = Fileinclasspath.class.getResourceAsStream("/")){
//            int n;
//            StringBuilder sb = new StringBuilder();
//            while ((n = f.read()) != -1) {
//                sb.append((char) n);
//            }
//            System.out.println(sb);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(InputStream f = Fileinclasspath.class.getResourceAsStream("/setting.properties")){
            int n;
            StringBuilder sb = new StringBuilder();
            while ((n = f.read()) != -1) {
                sb.append((char) n);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
