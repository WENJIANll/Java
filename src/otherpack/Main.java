package otherpack;

import set.Hello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numWays(6));
//        List arrayList = new ArrayList();
//        arrayList.add("aaaa");
//        arrayList.add(100);
//
//        for(int i = 0; i< arrayList.size();i++){
//            String item = (String)arrayList.get(i);
//            System.out.println("泛型测试item = " + item);
//        }
    }
}
class Solution {
    public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int pre = 1, cur = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = (pre + cur) % 1000000007;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
