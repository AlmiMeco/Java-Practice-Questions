package trees;

public class RangeSumOfBST_938 {


     /**
        Given the root node of a binary search tree and two integers low and high,
        return the sum of values of all nodes with a value in the inclusive range [low, high].
     **/


     public static int sumOfBSTRange(TreeNode root, int low, int high) {

         int sum = 0;

         if (root == null) return 0;

         if (root.val >= low && root.val <= high) sum += root.val;

         if (root.val > low) sum += sumOfBSTRange(root.left, low, high);

         if (root.val < high) sum += sumOfBSTRange(root.right, low, high);

         return sum;
     }




    public static void main(String[] args) {


         TreeNode treeNode = new TreeNode(10);

         treeNode.left = new TreeNode(5);
         treeNode.left.left = new TreeNode(3);
         treeNode.left.right = new TreeNode(7);

         treeNode.right = new TreeNode(15);
         treeNode.right.right = new TreeNode(18);


        System.out.println(sumOfBSTRange(treeNode, 7, 15));


    }

}
