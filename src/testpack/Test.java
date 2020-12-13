package testpack;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wenjian");
        list.add("qinken");
        list.add("fennu");

        String[] strarray = new String[list.size()];
        list.toArray(strarray);
        System.out.println(strarray[0]);
    }
}
