package BFS;

public class countGood {
     public class TreeNode {
          int val;
          int root;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.left = left;
               this.right = right;
               this.root = root;
               this.val = val;
          }
     }

     int count = 0;

     public int goodNode(TreeNode root) {
          return preOrder(root, Integer.MIN_VALUE);
     }

     int preOrder(TreeNode root, int max) {
          if (root == null)
               return 0;
          int count = root.val > max ? 1 : 0;
          count += preOrder(root.left, Math.max(max, root.val));
          count += preOrder(root.right, Math.max(max, root.val));
          return count;
     }

     public static void main(String[] args) {

     }
}
