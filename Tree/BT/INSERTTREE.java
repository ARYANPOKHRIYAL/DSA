import java.util.LinkedList;
import java.util.Queue;

class binaryNode{

  String value;
  binaryNode left;
  binaryNode right;
}

class binaryTree{
  static binaryNode root;

  binaryTree(){
    this.root=null;
  }

  //insert method
  static void insertNode(String value){
    binaryNode NewNode= new binaryNode();  //------->O(1)
    NewNode.value= value;  //------->O(1)

    if(root==null){  //------->O(1)
      root=NewNode;  //------->O(1)
      System.out.println("Inserted new node at the root.");  //------->O(1)
      return;  //------->O(1)
    }

    Queue<binaryNode> Q= new LinkedList<binaryNode>();  //------->O(1)
    Q.add(root);  //------->O(1)

    while(!Q.isEmpty()){  //------->O(N)
      binaryNode currentNode= Q.remove(); //------->O(1)
      if(currentNode.left==null)  { //------->O(1)
        currentNode.left=NewNode;  //------->O(1)
        System.out.println("Successfully inserted new node at "+currentNode.value);  //------->O(1)
        break;  //------->O(1)
      }
      else if(currentNode.right==null){  //------->O(1)
        currentNode.right=NewNode;  //------->O(1)
        System.out.println("Successfully inserted new node at "+currentNode.value);  //------->O(1)
        break;  //------->O(1)
      }
      else{  //------->O(1)
        Q.add(currentNode.left);  //------->O(1)
        Q.add(currentNode.right);  //------->O(1)
      }
    }
    //Time Complexity: O(N)
    //Space Complexity: O(N)
  }

  //Level-Order Traversal method
  static void levelOrder(){
    Queue<binaryNode> Q= new LinkedList<binaryNode>(); //------->O(1)
    Q.add(root); //------->O(1)

    while(!Q.isEmpty()){  //------->O(N)
      binaryNode currentNode= Q.remove(); //------->O(1)
      System.out.print(currentNode.value+" "); //------->O(1)

      if(currentNode.left!=null) //------->O(1)
        Q.add(currentNode.left);
      if(currentNode.right!=null) //------->O(1)
        Q.add(currentNode.right);
    }
    //Time Complexity: O(N)
    //Space Complexity: O(N)
  }
}

public class INSERTTREE{
  public static void main(String[] args) {
    binaryTree BT= new binaryTree();
    binaryTree.insertNode("N1");
    binaryTree.insertNode("N2");
    binaryTree.insertNode("N3");
    binaryTree.insertNode("N4");
    binaryTree.insertNode("N5");
    binaryTree.insertNode("N6");
    binaryTree.levelOrder();
  }
}
