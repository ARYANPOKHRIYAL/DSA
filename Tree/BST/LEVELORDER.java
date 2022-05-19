import java.util.Queue;
import java.util.LinkedList;

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
    insertNode(root,value);
  }

//LEVELORDER TRAVERSAL METHOD
  static void levelOrder(){
    Queue<binaryNode> Q= new LinkedList<binaryNode>();
    Q.add(root);

    while(!Q.isEmpty()){
      binaryNode currentNode= Q.remove();
      System.out.print(currentNode.value+" ");

      if(currentNode.left!= null)
        Q.add(currentNode.left);
      if(currentNode.right!= null)
        Q.add(currentNode.right);
    }
    //Time Complexity: O(N)
    //Space Complexity: O(N)
  }
}

public class LEVELORDER{
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
    BST.levelOrder();
  }
}
