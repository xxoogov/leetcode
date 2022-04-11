  //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 数组 👍 2361 👎 0

  
  package com.example.demo.leetcode.editor.cn;
  class SingleNumber{
      public static void main(String[] args) {
           Solution solution = new SingleNumber().new Solution();
          System.out.println(46^46^28);
      }
      
      
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        //常规方法-hashmap
        //本题位运算
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res=res^nums[i];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }