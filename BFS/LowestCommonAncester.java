package BFS;

public class LowestCommonAncester {
     public static class TreeNode {
          int root;
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.root = root;
               this.left = left;
               this.right = right;
               this.val = val;
          }
     }

     public TreeNode lowestCommonAnster(TreeNode root, TreeNode p, TreeNode q) {
          if (root == null || root == p || root == q)
               return root;

          TreeNode left = lowestCommonAnster(root.left, p, q);
          TreeNode right = lowestCommonAnster(root.right, p, q);
          if (left == null)
               return right;
          else if (right == null)
               return left;
          else
               return root;

     }

     public static void main(String[] args) {

     }
}
