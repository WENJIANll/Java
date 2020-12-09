package io;

import java.io.*;

public class Writefile {
    public static void main(String[] args) throws IOException {
        try(InputStream input = new FileInputStream("src/setting.properties");OutputStream output = new FileOutputStream("src/test")){
            output.write(72); // H
            output.write(101); // e
            output.write(108); // l
            output.write(108); // l
            output.write(111); // o
            output.write("\n你好".getBytes("UTF-8")); // Hello
            input.transferTo(output);
            // 直接覆盖了
        }
    }
}
