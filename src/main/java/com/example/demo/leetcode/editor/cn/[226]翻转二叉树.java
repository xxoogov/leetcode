//给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root = [2,1,3]
//输出：[2,3,1]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目范围在 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1250 👎 0


package com.example.demo.leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

class InvertBinaryTree {
    public static void main(String[] args) {
        Solution solution = new InvertBinaryTree().new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null,null), null);
        TreeNode treeNode = solution.invertTree(root);
        System.out.println(treeNode);
    }

    public static class TreeNode {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)


    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            //广度优先。，一层一层的来交换。
            //先根节点。将根节点左右进行交换。然后放入队列。，然后继续下次循环，交换左右
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size > 0) {
                    TreeNode poll = queue.poll();
                    size--;
                    if (poll.left != null && poll.right != null) {
                        TreeNode left = poll.left;
                        TreeNode right = poll.right;
                        poll.left = right;
                        poll.right = left;
                        queue.add(poll.left);
                        queue.add(poll.right);
                    } else if (poll.left == null && poll.right != null) {
                        poll.left = poll.right;
                        poll.right=null;
                        queue.add(poll.left);
                    } else if (poll.right == null && poll.left != null) {
                        poll.right = poll.left;
                        poll.left=null;
                        queue.add(poll.right);
                    }
                }
            }
            return root;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}