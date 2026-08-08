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
    List<Integer> res;
    List<Integer> res2;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        res = new ArrayList<>();
        res2 = new ArrayList<>();

        fill(res,p);
        fill(res2,q);

        return res.equals(res2);
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
