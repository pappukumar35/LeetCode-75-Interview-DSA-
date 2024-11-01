package BST3;

public class searchBST {
     public static class TreeNode {
          int root;
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int root) {
               this.root = root;
               this.left = left;
               this.right = right;
          }
     }

     public TreeNode searchBST(TreeNode root, int val) {
          TreeNode temp = root;
          while (temp != null) {
               if (temp.val == val) {
                    break;
               } else if (temp.val > val) {
                    temp = temp.left;
               } else {
                    temp = temp.right;
               }
          }
          return temp;
     }

     public static void main(String[] args) {

     }
}