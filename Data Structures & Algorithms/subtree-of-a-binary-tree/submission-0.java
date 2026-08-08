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
    List<Integer> treefill;
    List<Integer> subtreefill;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        treefill = new ArrayList<>();
        subtreefill = new ArrayList<>();

        fill(treefill,root);
        fill(subtreefill,subRoot);

        return Collections.indexOfSubList(treefill, subtreefill) != -1;
    }

    private void fill(List<Integer> res, TreeNode node) {
        if(node == null) {
            res.add(null);
            return;
        }
        res.add(node.val);
        fill(res,node.left);
        fill(res,node.right);
    }
}
