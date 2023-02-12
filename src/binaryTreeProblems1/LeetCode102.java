package binaryTreeProblems1;
import java.util.*;
public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>>ans = new ArrayList<List<Integer>>();
        if(root==null)return ans;
        Queue<TreeNode>q = new LinkedList<TreeNode>();
        q.add(root);
        q.offer(null);

        ArrayList<Integer>list = new ArrayList<>();
        while(!q.isEmpty()){

            TreeNode cur = q.poll();
            if(cur==null){
                ans.add(list);
                if(q.isEmpty())return ans;
                q.offer(null);
                list = new ArrayList<>();
            }
            else{
                list.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

}
}
 class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
 TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
  }