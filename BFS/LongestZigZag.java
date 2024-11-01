package BFS;

public class LongestZigZag {
     public static class TreeNode {
          int root;
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.val = val;
               this.left = left;
               this.right = right;
               this.root = root;
          }
     }

     int ans = 0;

     public int LongestZigZag(TreeNode root) {
          int ans = 0;
          dfs(root.left, true, 1);
          dfs(root.right, false, 1);
          return ans;
     }

     public void dfs(TreeNode root, boolean left, int count) {
          if (root == null)
               return;
          ans = Math.max(count, ans);
          dfs(root.left, true, left ? 1 : count + 1);
          dfs(root.right, false, left ? count + 1 : 1);
     }

     public static void main(String[] args) {

     }
}
