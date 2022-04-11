//给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
//
// 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。 
//
// 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。 
//
// 
//
// 示例 1： 
//
// 
//输入：[7,1,5,3,6,4]
//输出：5
//解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
// 
//
// 示例 2： 
//
// 
//输入：prices = [7,6,4,3,1]
//输出：0
//解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= prices.length <= 10⁵ 
// 0 <= prices[i] <= 10⁴ 
// 
// Related Topics 数组 动态规划 👍 2273 👎 0


package com.example.demo.leetcode.editor.cn;

class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new BestTimeToBuyAndSellStock().new Solution();
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println("solution.maxProfit(a) = " + solution.maxProfit(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        public int maxProfit(int[] prices) {
            //暴力算法[7,1,5,3,6,4]------超时
            //假设是最低的那天买入。往后的每一天，如果是当前价格比之前价格低，那么当前价格就是最低价，否则，就计算当前价格-最低的价格，是否大学最大利润，如果大于则替换

            int min = prices[0];
            int max = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                } else if (prices[i] - min > max) {
                    max = prices[i] - min;
                }
            }
            return max;
        }





        public int maxProfit1(int[] prices) {
            //暴力算法[7,1,5,3,6,4]------超时
            int max = 0;
            for (int i = 0; i < prices.length; i++) {

                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] < prices[i]) {
                        continue;
                    }
                    max = Math.max(max, prices[j] - prices[i]);
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}