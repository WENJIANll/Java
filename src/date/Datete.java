package date;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Datete {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newFixedThreadPool(5);


        BigInteger bi = new BigInteger("1234567890");

        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印

        // 自定义格式化:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("自定义格式输出" + dtf.format(LocalDateTime.now()));

        // 用自定义格式解析:
        LocalDateTime dt2 = LocalDateTime.parse("2019/11/30 15:16:17", dtf);
        System.out.println(dt2);

        // 获取当前时间:
        Date date = new Date();
//        System.out.println(date.getYear() + 1900); // 必须加上1900
//        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
//        System.out.println(date.getDate()); // 1~31，不能加1
        // 转换为String:
        System.out.println(date.toString());
//        // 转换为GMT时区:
//        System.out.println(date.toGMTString());
//        // 转换为本地时区:
//        System.out.println(date.toLocaleString());
        System.out.println(System.currentTimeMillis());
    }
}
