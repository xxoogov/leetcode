  //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：[2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//
// 进阶： 
//
// 
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
// 
// Related Topics 数组 哈希表 分治 计数 排序 👍 1397 👎 0


  package com.example.demo.leetcode.editor.cn;

  import java.util.Arrays;
  import java.util.Collections;
  import java.util.Map;
  import java.util.stream.Collectors;

  class MajorityElement{
      public static void main(String[] args) {
           Solution solution = new MajorityElement().new Solution();
           int[] a={1,2,3,4,5,6,7,8,9,1};
          solution.majorityElement(a);
      }


      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int majorityElement(int[] nums) {
            int mid=nums.length/2;
            //最多的元素要大于mid

        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
            if (entry.getValue()>mid){
                return entry.getKey();
            }
        }

        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }