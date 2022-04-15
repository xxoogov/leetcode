  //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
// Related Topics 数组 双指针 👍 1544 👎 0

  
  package com.example.demo.leetcode.editor.cn;

  import java.util.Arrays;

  class MoveZeroes{
      public static void main(String[] args) {
           Solution solution = new MoveZeroes().new Solution();
           int[] aa={0,0,1};
           solution.moveZeroes(aa);
//          System.out.println(Arrays.toString(nums));
      }
      
      
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        //2个指针-一个头一个尾
        int pre=0;
        int last=nums.length-1;
        while (pre<=last){
            int num = nums[pre];
            if (num==0){
                System.out.println("-----------"+pre);
                //移动数组，将pre+1到last的数组往前移动
                for (int i = pre+1; i <=last; i++) {
                    nums[i-1]=nums[i];
                }
                nums[last]=0;
                last--;
            }else {
                pre++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }