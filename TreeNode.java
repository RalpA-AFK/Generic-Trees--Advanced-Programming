public class TreeNode<E extends Comparable<E>>{
    E data;
    TreeNode<E> leftChild, rightChild;
    TreeNode(E data) {
        this.data = data;
    }
    public TreeNode<E> getLeftChild(){return leftChild;}
    public TreeNode<E> getRightChild(){return rightChild;}
    public void setLeftChild(TreeNode<E> leftChild) {this.leftChild = leftChild;}
    public void setRightChild(TreeNode<E> rightChild){this.rightChild = rightChild;}

}

