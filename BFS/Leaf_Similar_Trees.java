package BFS;

import java.util.*;

public class Leaf_Similar_Trees {
     public class TreeNode {
          int val;
          int root;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.left = left;
               this.right = right;
          }

     }

     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
          ArrayList<Integer> list1 = new ArrayList<>();
          ArrayList<Integer> list2 = new ArrayList<>();
          postOrderUtil(root1, list1);
          postOrderUtil(root2, list2);
          return list1.equals(list2);
     }

     private void postOrderUtil(TreeNode root, ArrayList<Integer> list) {
          if (root == null) {
               return;
          }
          postOrderUtil(root.left, list);
          postOrderUtil(root.right, list);
          if (root.left == null && root.right == null) {
               list.add(root.val);
          }
     }

     public static void main(String[] args) {

     }
}
