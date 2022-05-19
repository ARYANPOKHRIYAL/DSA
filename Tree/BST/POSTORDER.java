class binaryNode{
  int value;
  binaryNode left;
  binaryNode right;
}

class binarySearchTree{
  binaryNode root;

  binarySearchTree(){
    root=null;
  }

  //INSERTION METHODS
  binaryNode insertNode(binaryNode currentNode, int value){
    if(currentNode==null){
      binaryNode newNode= new binaryNode();
      newNode.value= value;
      System.out.println("Node successfully inserted.");
      return newNode;
    }
    else if(value<= currentNode.value){
      currentNode.left= insertNode(currentNode.left, value);
      return currentNode;
    }
    else{
      currentNode.right= insertNode(currentNode.right, value);
      return currentNode;
    }
  }

  void insert(int value){
    root= insertNode(root, value);
  }

  //POST-ORDER METHOD
  void postOrder(binaryNode node){
    if(node==null){
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value+" ");
  }
}
public class POSTORDER{
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
    System.out.println();
    BST.postOrder(BST.root);
  }
}
