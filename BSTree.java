public class BSTree <E extends Comparable<E>> {
    TreeNode<E> root;
    int size;

    TreeNode<E> insertHelper(TreeNode<E> curr, TreeNode<E> n) {
        if (curr == null) {
            return n;
        } else if (curr.data.compareTo(n.data) < 0) {
            curr.rightChild = insertHelper(curr.rightChild, n);
            return curr;
        } else {
            curr.leftChild = insertHelper(curr.leftChild, n);
            return curr;
        }

    }

    void insert(TreeNode<E> n) {
        if (root == null) {
            root = n;
        } else {

            {
                insertHelper(root, n);
            }
        }

    }
    TreeNode<E> inOrder(){
        while()
    }
}
