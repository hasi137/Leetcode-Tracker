// Last updated: 11/07/2026, 12:37:33
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root == null) return li;
        q.add(root);
        while(q.size() > 0){
            int m = q.size();
            for(int i =1;i<=m;i++){
                TreeNode curr = q.poll();
                if(i==m){
                    li.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return li;
    }
}