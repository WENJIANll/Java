//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//
//
//        示例 1：
//
//        输入：s = "We are happy."
//        输出："We%20are%20happy."


public class JZ05 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.replaceSpace("hello world "));
    }
}

class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int lens = s.length();
        for (int i = 0; i < lens ; i++){
            char curchar = s.charAt(i);
            if (curchar == ' '){
                sb.append("%20");
            }else {
                sb.append(curchar);
            }
        }
        return sb.toString();
    }
}
