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
    public boolean solve(TreeNode root, int targetSum,int[] sum){
        if(root==null){return false;}
        sum[0]+=root.val;
        if(targetSum == sum[0] && root.left==null && root.right==null){
            return true;
        }
        if(root.left!=null){
            if(solve(root.left,targetSum,sum)) return true;
            }
        if(root.right!=null){
            if(solve(root.right,targetSum,sum)) return true;
        }
        sum[0]-=root.val;
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int curr[] = new int[]{0};
        return solve(root,targetSum,curr);
    }
}