class binaryNode{
  int value;
  binaryNode height;
  binaryNode left;
  binaryNode right;
}

class binarySearchTree{
  binaryNode root;  //-------> O(1)

  binarySearchTree(){
    root= null;  //-------> O(1)
  }
}

public class BST{
  public static void main(String[] args) {
    binarySearchTree BST= new binarySearchTree();
  }
}
