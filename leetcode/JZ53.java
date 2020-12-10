//        一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
//        在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
//
//        示例 1:
//
//        输入: [0,1,3]
//        输出: 2

//        示例 2:
//
//        输入: [0,1,2,3,4,5,6,7,9]
//        输出: 8

public class JZ53 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[] {0};
        System.out.println(s.missingNumber(nums));
    }

    static class Solution {
        int index = 0;
        public int missingNumber(int[] nums) {
            int lens = nums.length;
            if (lens == 1){
                if (nums[0] == 0){
                    return 1;
                }else {
                    return 0;
                }
            }
            getmixx(nums,0,lens-1);
            return index;
        }
        public int getmixx(int[] nums,int start,int end){

            int mid = (start+end) / 2;
            if (end == start){
                index = start;
                return 0;
            }
            if (mid == start || mid == end){
                if (nums[start] == start && nums[end] == end){
                    index = end + 1;
                    return 0;
                }
                if (nums[start] == start && nums[end] != end){
                    index = end;
                    return 0;
                }
                index = start;
                return 0;
            }

            if (nums[mid] > mid){
                end = mid;
                getmixx(nums,start,end);
            }else {
                start = mid;
                getmixx(nums,start,end);
            }
            return index;
        }
    }
}
