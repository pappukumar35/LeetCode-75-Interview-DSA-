package BST3;

public class deleteNode {
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

     public TreeNode deleteNode(TreeNode root, int key) {
          if (root == null)
               return null;

          if (key < root.val) {
               root.left = deleteNode(root.left, key);
          } else if (key > root.val) {
               root.right = deleteNode(root.right, key);
          } else {
               // Node to be deleted is found
               if (root.left == null)
                    return root.right;
               if (root.right == null)
                    return root.left;

               // Find the inorder successor (smallest in the right subtree)
               TreeNode minNode = findMin(root.right);
               root.val = minNode.val;
               root.right = deleteNode(root.right, minNode.val);
          }
          return root;
     }

     // Helper method to find the minimum node in a subtree
     public TreeNode findMin(TreeNode root) {
          while (root.left != null) {
               root = root.left;
          }
          return root;
     }

     public static void main(String[] args) {
          deleteNode tree = new deleteNode();
          TreeNode root = new TreeNode(5);
          root.left = new TreeNode(3);
          root.right = new TreeNode(6);
          root.left.left = new TreeNode(2);
          root.left.right = new TreeNode(4);
          root.right.right = new TreeNode(7);

          root = tree.deleteNode(root, 3);
          System.out.println("Node with value 3 deleted from the tree.");
     }
}
