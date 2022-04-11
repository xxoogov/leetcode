//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
//
// 实现 MinStack 类: 
//
// 
// MinStack() 初始化堆栈对象。 
// void push(int val) 将元素val推入堆栈。 
// void pop() 删除堆栈顶部的元素。 
// int top() 获取堆栈顶部的元素。 
// int getMin() 获取堆栈中的最小元素。 
// 
//
// 
//
// 示例 1: 
//
// 
//输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= val <= 2³¹ - 1 
// pop、top 和 getMin 操作总是在 非空栈 上调用 
// push, pop, top, and getMin最多被调用 3 * 10⁴ 次 
// 
// Related Topics 栈 设计 👍 1267 👎 0


package com.example.demo.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class MinStack2 {
    public static void main(String[] args) {
        MinStack solution = new MinStack();
        solution.push(-2);
        solution.push(0);
        solution.push(-3);
        System.out.println("solution.getMin() = " + solution.getMin());
        solution.pop();
        solution.pop();
        System.out.println("solution.getMin() = " + solution.getMin());
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    static class MinStack {


        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min_stack = new Stack<>();

        public MinStack() {

        }

        /**
         * 将元素val推入堆栈。
         *
         * @param val
         */
        public void push(int val) {
            stack.push(val);
            if (min_stack.isEmpty() || val <= min_stack.peek()) {
                min_stack.push(val);
            }
        }

        /**
         * 出栈
         */
        public void pop() {
            if (stack.isEmpty()) {
                return;
            }
            Integer pop = stack.pop();
            if (!min_stack.isEmpty() && pop.equals(min_stack.peek())) {
                min_stack.pop();
            }
        }

        /**
         * 获取堆栈顶部的元素。
         *
         * @return
         */
        public int top() {
            if (stack.isEmpty()) {
                return 0;
            }
            return stack.peek();
        }

        /**
         * 获取最小的元素
         *
         * @return
         */
        public int getMin() {
            if (stack.isEmpty()) {
                return 0;
            }
            return min_stack.peek();
        }
    }


//    class MinStack {
//
//        /**
//         * 初始化堆栈对象。
//         * 栈-先入后出
//         * 由于不知道栈多大，使用动态数组实现
//         *
//         * 官方使用2个栈实现本题。一个主栈-一个辅助栈（里面存储最小的元素）
//         */
//        private List<Integer> stack;
//        //栈顶指针
//        private int top;
//        /**
//         * 栈中的最小值
//         */
//        private Integer min;
//
//        public MinStack() {
//            stack = new ArrayList<>();
//            top = -1;
//        }
//
//        /**
//         * 将元素val推入堆栈。
//         *
//         * @param val
//         */
//        public void push(int val) {
//            stack.add(val);
//            top++;
//
//
//        }
//
//        /**
//         * 出栈
//         */
//        public void pop() {
//            //没有元素出栈
//            if (stack.size() == 0) {
//                return;
//            }
//            Integer remove = stack.remove(top);
//            top--;
//        }
//
//        /**
//         * 获取堆栈顶部的元素。
//         *
//         * @return
//         */
//        public int top() {
//            if (stack.size() == 0) {
//                return 0;
//            }
//            return stack.get(top);
//        }
//
//        /**
//         * 获取最小的元素
//         *
//         * @return
//         */
//        public int getMin() {
//            if (stack.size() == 0) {
//                return 0;
//            }
//            min = stack.get(top);
//            for (Integer item : stack) {
//                min = Math.min(min, item);
//            }
//            return min;
//        }
//    }
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}