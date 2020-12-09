package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Readfile {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1000];
        try (InputStream input = new FileInputStream("src/setting.properties")) {
            for (int n = input.read(buffer); n != -1; n = input.read(buffer)) {
                System.out.println(n);
            }
        }
    }
//    public static void main(String[] args) throws IOException {
//        InputStream input = null;
//        try {
//            input = new FileInputStream("src/setting.properties");
//            if (input != null) {
//                for (int n = input.read(); n != -1; n = input.read()) {
//                    System.out.println(n);
//                }
//            }
//        } finally {
//            if (input != null) {
//                input.close();
//            }
//        }
//    }
}
