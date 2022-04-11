//给你一个二叉树的根节点 root ， 检查它是否轴对称。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：root = [1,2,2,null,3,null,3]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 1000] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：你可以运用递归和迭代两种方法解决这个问题吗？ 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1854 👎 0


package com.example.demo.leetcode.editor.cn;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class SymmetricTree {
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(4)));
        System.out.println("solution.isSymmetric(root) = " + solution.isSymmetric(root));
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
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public boolean isSymmetric22(TreeNode root) {
            //如果一个二叉树轴对称，就说明，左节点等于右节点
            if (root == null) {
                return true;
            }
            return aaa(root.left, root.right);
        }

        public boolean aaa(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null) {
                return false;
            }
            if (right == null) {
                return false;
            }
            return left.val == right.val && aaa(left.left, right.right) && aaa(left.right, right.left);
//
        }


        /**
         * 迭代实现-能递归的，
         *
         * @param root
         * @return
         */
        public boolean isSymmetric(TreeNode root) {
            //如果一个二叉树轴对称，就说明，左节点等于右节点
            if (root == null) {
                return true;
            }
            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root.left);
            queue.add(root.right);
            while (!queue.isEmpty()) {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }

            return true;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}