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
    
        int ans=0;
        int height(TreeNode root) {
           if (root == null) {
            return 0;
        }

        int lheight = height(root.left);
        int rheight = height(root.right);

        ans=Math.max(ans,lheight+rheight);
        return Math.max(lheight,rheight)+1;
        }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
}
}
