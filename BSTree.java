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
    TreeNode<E> searchHelper(TreeNode<E> curr, TreeNode<E> d) {
        if (curr == null) {
            return null;
        } else if (curr.data.compareTo(d.data) == 0) {
            return curr;
        } else if (curr.data.compareTo(d.data) < 0) {
            return searchHelper(curr.rightChild, d);
        } else {
            return searchHelper(curr.leftChild, d);
        }
    }
    void inOrderHelper(TreeNode<E> curr){
        if(curr == null){
            return;
        }
        inOrderHelper(curr.rightChild);
        System.out.println(curr.data + " ");
        inOrderHelper(curr.leftChild);
    }

    void insert(TreeNode<E> n) {
        if (root == null) {root = n;}
        else {root = insertHelper(root, n);}

    }
    TreeNode<E> search(TreeNode<E> d) {
        if (root == null) {return null;}
        else{return searchHelper(root, d);}
    }
    void inOrder(){
        inOrderHelper(root);
    }
}
