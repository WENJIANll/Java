package io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Filefile {
    public static void main(String[] args) throws IOException {
        File f = new File("src/");
        System.out.println(f);
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        System.out.println(File.separator);
        System.out.println(f.length());
        // 当且仅当文件不存在的时候创建f只当名称的文件
        // f.createNewFile();

        File[] fs1 = f.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        // 仅列出.exe文件
        File[] fs2 = f.listFiles((dir, name) -> {
            return name.endsWith(".java"); // 返回true表示接受该文件
        });
//        new FilenameFilter() { // 仅列出.exe文件
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".java"); // 返回true表示接受该文件
//            }
//        }
        printFiles(fs2);
    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
