import java.util.ArrayList;

class treeNode{
  String data;
  ArrayList<treeNode> child
  ;
  //method to create a node or child
  public treeNode(String data){
    this.data= data;
    this.child= new ArrayList<treeNode>();
  }

  //method to add a child to the tree
  public void addChild(treeNode node){
    this.child.add(node);
  }

  //method to print the children by calling the method recursively
  public String print(int level){
    String ret;
    ret= "  ".repeat(level)+data+"\n";  //to give suitable space between children at the correponding level
    for(treeNode node: this.child)
      ret+=node.print(level+1);  // recursive call

    return ret;
  }
}

//main driver method
public class Drinks{
  public static void main(String[] args) {
    treeNode Drinks= new treeNode("Drinks");
    treeNode Hot= new treeNode("Hot");
    treeNode Cold= new treeNode("Cold");
    treeNode Tea= new treeNode("Tea");
    treeNode Coffee= new treeNode("Coffee");
    treeNode Wine= new treeNode("Wine");
    treeNode Beer= new treeNode("Beer");
    Drinks.addChild(Hot);
    Drinks.addChild(Cold);
    Hot.addChild(Tea);
    Hot.addChild(Coffee);
    Cold.addChild(Wine);
    Cold.addChild(Beer);

    System.out.println(Drinks.print(0));
  }
}
