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

//INSERT METHOD
  binaryNode insertNode(binaryNode currentNode, int value){
    if(currentNode==null){
      binaryNode newNode= new binaryNode(); //-----------> O(1)
      newNode.value= value;  //-----------> O(1)
      System.out.println("Node successfully inserted in the BSTree.");  //-----------> O(1)
      return newNode;  //-----------> O(1)
    }
    else if(value<= currentNode.value){  //-----------> O(1)
      currentNode.left= insertNode(currentNode.left, value);  //-----------> O(N/2)
      return currentNode;  //-----------> O(1)
    }
    else{
      currentNode.right= insertNode(currentNode.right, value);  //-----------> O(N/2)
      return currentNode;  //-----------> O(1)
    }
    //Time complexity: O(LogN)
    //Space complexity: O(LogN)
  }
  void insert(int value){
    insertNode(root, value);
  }
}

public class INSERTNODE{
  public static void main(String[] args) {
    binarySearchTree BST= new binarySearchTree();
    BST.insert(70);
    BST.insert(50);
    BST.insert(90);
    BST.insert(30);
    BST.insert(60);
    BST.insert(80);
    BST.insert(100);
    BST.insert(20);
    BST.insert(40);
  }
}
