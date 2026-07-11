// Last updated: 11/07/2026, 12:38:59
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return li;
        int x=0;
        q.add(root);
        while(q.size()>0){
            int m =q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=1;i<=m;i++){
                TreeNode curr = q.poll();
                temp.add(curr.val);

                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(x%2!=0) Collections.reverse(temp);
            li.add(temp);
            x++;
        }
        return li;
    }
}