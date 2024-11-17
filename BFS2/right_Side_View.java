package BFS2;

import java.util.ArrayList;
import java.util.*;

public class right_Side_View {
     public static class TreeNode {
          int root;
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.left = left;
               this.right = right;
               this.root = root;
               this.val = val;
          }
     }

     public List<Integer> rightsideview(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
          helper(root, ans, 0);
          return ans;
     }

     public void helper(TreeNode root, List<Integer> ans, int level) {
          if (root == null) {
               return;
          }
          if (ans.size() == level) {
               ans.add(root.val);
          }
          helper(root.left, ans, level + 1);
          helper(root.right, ans, level + 1);
     }

     public static void main(String[] args) {

     }
}
