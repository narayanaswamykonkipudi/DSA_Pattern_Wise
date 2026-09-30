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
    private static void solve(TreeNode root,int l,int h,int[] sum){
        if(root==null){return;}
        solve(root.left,l,h,sum);
        if(root.val>=l && root.val<=h){
            sum[0]+=root.val;
        }
        solve(root.right,l,h,sum);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum[] = new int[1];
        solve(root,low,high,sum);
        return sum[0];
    }
}