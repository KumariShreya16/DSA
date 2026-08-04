/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);

        return 1 + Math.max(lheight, rheight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftd = diameterOfBinaryTree(root.left);
        int rightd = diameterOfBinaryTree(root.right);

        int currd = height(root.left) + height(root.right);

        return Math.max(currd, Math.max(leftd, rightd));
    }
}