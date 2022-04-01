//给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
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
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1353 👎 0


package com.example.demo.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeInorderTraversal().new Solution();
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


        /**
         * 迭代法
         *
         * @param root
         * @return
         */
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            //二叉树的中序遍历   左根右
            if (root == null) {
                return list;
            }
            //可以用递归实现的均可以利用栈来实现
            Stack<TreeNode> stack = new Stack<>();
            while (root != null || !stack.isEmpty()) {
                //中序遍历，先开始左子树-一直遍历到左边为null
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                //上面将所有的左子树的左节点都添加到了栈里面
                //从栈中将左子树取出
                TreeNode pop = stack.pop();
                list.add(pop.val);
                root=pop.right;
            }
            return list;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}