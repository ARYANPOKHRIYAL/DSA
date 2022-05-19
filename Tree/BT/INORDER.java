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
  static void inOrder(binaryNode node){
    if(node==null) //--------> O(1)
      return;  //--------> O(1)
    inOrder(node.Left); //--------> O(N/2)
    System.out.println(node.value+" ");  //--------> O(1)
    inOrder(node.Right);  //--------> O(N/2)
  }
  //Time Complexity: O(N)
  //Space Complexity: O(N)
}

public class INORDER{
  public static void main(String[] args) {
    binaryTree BT= new binaryTree();
    binaryNode N1= new binaryNode();
    N1.value= "N1";
    binaryNode N2= new binaryNode();
    N2.value= "N2";
    binaryNode N3= new binaryNode();
    N3.value= "N3";
    binaryNode N4= new binaryNode();
    N4.value= "N4";
    binaryNode N5= new binaryNode();
    N5.value= "N5";
    binaryNode N6= new binaryNode();
    N6.value= "N6";
    binaryNode N7= new binaryNode();
    N7.value= "N7";
    binaryNode N8= new binaryNode();
    N8.value= "N8";
    binaryNode N9= new binaryNode();
    N9.value= "N9";

    N1.Left= N2;
    N1.Right= N3;
    N2.Left= N4;
    N2.Right= N5;
    N4.Left= N8;
    N4.Right= N9;
    N3.Left= N6;
    N3.Right= N7;
    binaryTree.root= N1;

    binaryTree.inOrder(binaryTree.root);
  }
}
