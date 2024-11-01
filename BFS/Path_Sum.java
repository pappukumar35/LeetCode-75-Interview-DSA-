package BFS;

public class Path_Sum {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val) {
               this.val = val;
               this.left = null;
               this.right = null;
          }
     }

     int count = 0;

     public int pathSum(TreeNode root, int sum) {
          if (root == null)
               return 0;

          // Check paths starting from the current node
          pathSumHelper(root, sum, 0);

          // Continue with the left and right subtree
          pathSum(root.left, sum);
          pathSum(root.right, sum);

          return count;
     }

     private void pathSumHelper(TreeNode root, int targetSum, long currentSum) {
          if (root == null) {
               return;
          }

          // Update current sum
          currentSum += root.val;

          // If the current path sum equals the target sum, increment count
          if (currentSum == targetSum) {
               count++;
          }

          // Recurse on left and right children
          pathSumHelper(root.left, targetSum, currentSum);
          pathSumHelper(root.right, targetSum, currentSum);
     }

     public static void main(String[] args) {
          Path_Sum tree = new Path_Sum();
          TreeNode root = new TreeNode(10);
          root.left = new TreeNode(5);
          root.right = new TreeNode(-3);
          root.left.left = new TreeNode(3);
          root.left.right = new TreeNode(2);
          root.right.right = new TreeNode(11);
          root.left.left.left = new TreeNode(3);
          root.left.left.right = new TreeNode(-2);
          root.left.right.right = new TreeNode(1);

          int result = tree.pathSum(root, 8);
          System.out.println("Number of paths with sum 8: " + result);
     }
}
