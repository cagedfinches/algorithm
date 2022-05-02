package leetcode.test.tree.leetcode0104;
import leetcode.test.tree.TreeNode;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(8);
        TreeNode e = new TreeNode(1,a,b);
        TreeNode f = new TreeNode(3,null, c);
        TreeNode g = new TreeNode(-1,null, d);
        TreeNode h = new TreeNode(2,e,null);
        TreeNode i = new TreeNode(4, f, g);
        TreeNode root = new TreeNode(0, h, i);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        int a = 0;
        int res = 0;
        TreeNode realRoot = root;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
                a = a + 1;
                if (a >= res){
                    res = a;
                }
            }
            root = stack.pop();
            //if (root == realRoot){
            //    a = a - 1;
            //}
            a = a - 1;
            root = root.right;
            if (root != null && root != realRoot.right){
                a = a + 1;
            }
        }
        return res;
    }
}
