//给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,2,1]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：head = [1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围[1, 10⁵] 内 
// 0 <= Node.val <= 9 
// 
//
// 
//
// 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 👍 1344 👎 0


package com.example.demo.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
        System.out.println(solution.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1)))));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return false;
            }
            if (head.next==null){
                return true;
            }
            //利用栈来实现。先把所有的元素放到栈里面，然后出栈，出栈的元素放到另外一个栈里面，
//            Stack<ListNode> stack = new Stack<>();
            List<Integer> list=new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int size = list.size()-1;
            int front=0;
            while (front<size){
                Integer integer = list.get(front);
                Integer integer1 = list.get(size);
                if (!integer.equals(integer1)){
                    return false;
                }
                front++;
                size--;
            }
            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}