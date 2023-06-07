package trees;

public class MyTree {

    TreeNode root;


    void insert(int val) {
        TreeNode newNode = new TreeNode(val);

        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        while (true) {
            if (val <= current.val) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }
}
