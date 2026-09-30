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
    public static void inorder(TreeNode root , List<Integer> nodes){
        if(root==null){return;}
        inorder(root.left,nodes);
        nodes.add(root.val);
        inorder(root.right,nodes);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if(root==null){return nodes;}
        inorder(root,nodes);
        return nodes;
    }
}