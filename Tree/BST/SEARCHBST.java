class binaryNode{
  int value;
  binaryNode left;
  binaryNode right;
}

class binarySearchTree{
  static binaryNode root;

  binarySearchTree(){
    root=null;
  }

  binaryNode insertNode(binaryNode currentNode, int value){
    if(currentNode==null){
      binaryNode newNode= new binaryNode();
      newNode.value= value;
      System.out.println("Insertion successful!");
      return newNode;
    }
    else if(value<=currentNode.value){
      currentNode.left= insertNode(currentNode.left, value);
      return currentNode;
    }
    else{
      currentNode.right= insertNode(currentNode.right, value);
      return currentNode;
    }
  }

  void insert(int value){
    insertNode(root,value);
  }
//SEARCH METHOD
  binaryNode searchNode(binaryNode currentNode, int value){
    if(currentNode==null){
      System.out.println("Value not found!");
      return null;
    }
    else if(currentNode.value==value){
      System.out.println("Value: "+value+" is found in BST.");
      return currentNode;
    }
    else if(value<currentNode.value){
      return searchNode(currentNode.left, value);
    }
    else{
      return searchNode(currentNode.right,value);
    }
  }
  //Time complexity: O(LogN)
  //Space complexity: O(LogN)
}

public class SEARCHBST{
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
    BST.searchNode(BST.root,60);
  }
}
