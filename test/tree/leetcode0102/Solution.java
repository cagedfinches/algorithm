package leetcode.test.tree.leetcode0102;
import com.sun.source.tree.Tree;
import leetcode.test.tree.TreeNode;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(15);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(9);
        TreeNode d = new TreeNode(20,a,b);
        TreeNode root = new TreeNode(3,c,d);
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> subres = new ArrayList<Integer>();
            int countsize = q.size();
            for (int i = 1; i <= countsize; i++){
                TreeNode node = q.poll();
                subres.add(node.val);
                if (node.left != null){
                    q.offer(node.left);
                }
                if (node.right != null){
                    q.offer(node.right);
                }
            }
            res.add(subres);
        }
        return res;

    }
}
