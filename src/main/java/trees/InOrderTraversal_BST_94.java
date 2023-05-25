package trees;

public class InOrderTraversal_BST_94 {

                        /** NEEDS TO BE FINISHED :: TRAVERSAL NOT WORKING **/

   static void inOrderTraversal(TreeNode root){

        if (root==null) return;

        inOrderTraversal(root.left);
        System.out.print(root.val +", ");
        inOrderTraversal(root.right);

    }


    public static void main(String[] args) {

        int[] intArray = {1,0,2,3};

        MyTree tree = new MyTree();

        for (int i = 0; i < intArray.length; i++) {
            tree.insert(intArray[i]);

        }

        inOrderTraversal(tree.root);


    }

}
