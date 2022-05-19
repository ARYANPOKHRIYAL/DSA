class binaryNode{
  int value;
  binaryNode left;
  binaryNode right;
  int height;
}

class AVL{
  binaryNode root;

  AVL(){
    root=null;
  }
//PREORDER TRAVERSAL
  void PreOrder(binaryNode node){
    if(node==null)
      return;
    System.out.print(node.value+" ");
    PreOrder(node.left);
    PreOrder(node.right);
  }
//INORDER TRAVERSAL
  void InOrder(binaryNode node){
    if(node==null)
      return;
    PreOrder(node.left);
    System.out.print(node.value+" ");
    PreOrder(node.right);
  }
//POSTORDER TRAVERSAL
  void PostOrder(binaryNode node){
    if(node==null)
      return;
    PostOrder(node.left);
    PostOrder(node.right);
    System.out.print(node.value+" ");
  }
//SEARCH METHOD
  binaryNode search(binaryNode node, int value){
    if(node==null){
      System.out.print("Value: "+value+" not found in AVL tree.");
      return;
    }
    else if(node.value==value){
      System.out.print("Value: "+value+" found in AVL tree.");
      return node;
    }
    else if(value<node.value){
      return search(node.left,value);
    }
    else{
      return search(node.right,value);
    }
  }
}

public class AVLTREE{
  public static void main(String[] args) {
    AVL newAVL= new AVL();
  }
}
