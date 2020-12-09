package io;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Serializablele {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
            output.writeInt(12345);
            output.writeUTF("你的");
            output.writeObject(123.45);
            System.out.println(Arrays.toString(buffer.toByteArray()));
            System.out.println(buffer.toString());
        }
    }
}
