package io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathpath {
    public static void main(String[] args) {
        // src/io/Filefile.java
        Path p1 = Paths.get("src","io","Filefile.java");
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath();
        System.out.println(p2);
        Path p3 = p1.normalize();
        System.out.println(p3);
        File f = p3.toFile();
        System.out.println(f);
        System.out.println("遍历路径" + p2);
        for (  Path p : p2){
            System.out.println(p);
        }
    }
}
