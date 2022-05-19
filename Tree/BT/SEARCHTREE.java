import java.util.LinkedList;
import java.util.Queue;

class binaryNode{

  public String value;
  public binaryNode Left;
  public binaryNode Right;
  //public int head;
}

class binaryTree{
  static binaryNode root;

  public binaryTree(){
    this.root=null;
  }

  // Searching Method
  static void search(String value){
    Queue<binaryNode> Q= new LinkedList<binaryNode>(); //------->O(1)
    Q.add(root); //------->O(1)

    while(!Q.isEmpty()){  //------->O(N)
      binaryNode currentNode= Q.remove(); //------->O(1)
      if(currentNode.value==value){ //------->O(1)
        System.out.print("The value "+value+" is present in the Tree at "+ currentNode); //------->O(1)
        return;
      }
      else{
        if(currentNode.Left!=null) //------->O(1)
          Q.add(currentNode.Left);
        if(currentNode.Right!=null) //------->O(1)
          Q.add(currentNode.Right);
        System.out.println("-1");
      }
    }
    //Time Complexity: O(N)
    //Space Complexity: O(N)
  }

}

public class SEARCHTREE{
  public static void main(String[] args) {
    binaryTree BT= new binaryTree();
    binaryNode N1= new binaryNode();
    N1.value= "Node1";
    binaryNode N2= new binaryNode();
    N2.value= "Node2";
    binaryNode N3= new binaryNode();
    N3.value= "Node3";
    binaryNode N4= new binaryNode();
    N4.value= "Node4";
    binaryNode N5= new binaryNode();
    N5.value= "Node5";
    binaryNode N6= new binaryNode();
    N6.value= "Node6";
    binaryNode N7= new binaryNode();
    N7.value= "Node7";
    binaryNode N8= new binaryNode();
    N8.value= "Node8";
    binaryNode N9= new binaryNode();
    N9.value= "Node9";

    N1.Left= N2;
    N1.Right= N3;
    N2.Left= N4;
    N2.Right= N5;
    N4.Left= N8;
    N4.Right= N9;
    N3.Left= N6;
    N3.Right= N7;
    binaryTree.root= N1;

    binaryTree.search("Node6");
  }
}
