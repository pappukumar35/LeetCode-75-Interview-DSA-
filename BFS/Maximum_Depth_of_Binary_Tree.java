package BFS;

public class Maximum_Depth_of_Binary_Tree {
     public static class TreeNode {
          int root;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.left = left;
               this.right = right;
          }
     }

     public int maxDepth(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int left = maxDepth(root.left);
          int right = maxDepth(root.right);
          return left > right ? left + 1 : right + 1;

     }

     public static void main(String[] args) {

     }
}