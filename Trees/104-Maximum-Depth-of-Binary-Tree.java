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
    private int solve(TreeNode root){
        if(root==null){return 0;}
        int l = solve(root.left);
        int r = solve(root.right);
        return 1+Math.max(l,r);
    }
    public int maxDepth(TreeNode root) {
        int max = solve(root);
        return max;
    }
}