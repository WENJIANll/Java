package set;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PackProperties {
    public static void main(String[] args) throws IOException {
        String f = "src/setting.properties";
        Properties props = new Properties();
        props.load(new java.io.FileInputStream(f));

        String filepath = props.getProperty("last_open_file");
        String interval = props.getProperty("auto_save_interval", "120");
        System.out.println(filepath + "\n" +interval);
        props.setProperty("url", "http://www.liaoxuefeng.com");
        props.setProperty("language", "Java");
        props.store(new FileOutputStream("src/setting.properties"), "woshizhushi");
    }
}
