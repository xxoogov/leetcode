//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
//
// 
//输入：root = [1,2]
//输出：[1,2]
// 
//
// 示例 5： 
//
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 👍 780 👎 0


package com.example.demo.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePreorderTraversal().new Solution();
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            //二叉树的前序遍历-根左右
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            while (root != null || !stack.isEmpty()) {

                while (root != null) {
                    list.add(root.val);
                    if (root.right != null) {
                        stack.push(root.right);
                    }
                    root = root.left;
                }
                if (!stack.isEmpty()) {
                    TreeNode pop = stack.pop();
                    list.add(pop.val);
                    if (pop.right != null) {
                        stack.push(pop.right);
                    }
                    root = pop.left;
                }

            }

            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}