//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 👍 2311 👎 0


package com.example.demo.leetcode.editor.cn;

class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)

    public class ListNode {
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

    class Solution {
        /**
         * 迭代解法，指针
         *
         * @param list1
         * @param list2
         * @return
         */
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            //合并2个有序链表，使用指针，定义一个head节点。
            ListNode head = new ListNode();
            //当前节点
            ListNode cur = head;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    ListNode next = list1.next;
                    cur.next = list1;
                    list1 = next;
                } else {
                    ListNode next = list2.next;
                    cur.next = list2;
                    list2 = next;
                }
                //后移
                cur = cur.next;
            }
            //结束了循环，说明list1或者list2必然出现了一个或都为为null
            cur.next = list1 == null ? list2 : list1;
            return head.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}