package BFS2;

import java.util.*;

public class MaximumSumLevel {
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

     public int maximumSumLevel(TreeNode root) {
          if (root == null)
               return 0; // Return -1 if the tree is empty

          Queue<TreeNode> queue = new LinkedList<>();
          queue.add(root);
          int level = 0;
          int minLevel = 0;
          int maxSum = Integer.MIN_VALUE;

          while (!queue.isEmpty()) {
               int size = queue.size();
               int levelSum = 0;

               for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    levelSum += node.val;

                    if (node.left != null)
                         queue.add(node.left);
                    if (node.right != null)
                         queue.add(node.right);
               }

               if (levelSum > maxSum) {
                    maxSum = levelSum;
                    minLevel = level;
               }
               level++;
          }

          return minLevel;
     }

     public static void main(String[] args) {
          MaximumSumLevel tree = new MaximumSumLevel();
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.right = new TreeNode(8);
          root.right.right.left = new TreeNode(6);
          root.right.right.right = new TreeNode(7);

          int maxLevel = tree.maximumSumLevel(root);
          System.out.println("Level with maximum sum is: " + maxLevel);
     }
}
