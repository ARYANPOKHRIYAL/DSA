public class Main{
  Node head;

  class Node{
    Node Prev;
    int data;
    Node Next;

    Node(int data){
      this.data= data;
    }
  }

  public void push(int x){
    Node NewNode= new Node(x);

    NewNode.Next= head;
    NewNode.Prev= null;

    if(head!=null)
      head.Prev= NewNode;

    head= NewNode;
  }

  public void insertAfter(Node Prev_Node, int data){
    if(Prev_Node==null){ //if the prev node is not null
      System.out.println("Given previous node cant be null.");
      return;
    }
    Node NewNode= new Node(data); //make a new-node and enter its data

    NewNode.Next= Prev_Node.Next; //store the next of prev-node into next of new-node

    Prev_Node.Next= NewNode; //store the reference of new-node into the next of prev-node

    NewNode.Prev= Prev_Node; //store the reference of prev-node into prev of new-node

    if(NewNode.Next!=null){ //if the prev of the new node not null
      NewNode.Next.Prev= NewNode; //store the referece of the new node
                                  //into the prev of the node next to new node
    }
  }

  public void printL(Node node){
    Node last= null;
    System.out.println("Traversal in forward direction");
    while(node!=null){
      System.out.print(node.data+" ");
      last= node;
      node= node.Next;
    }
    System.out.println();
    System.out.println("Traversal in reverse direction");
    while(last!=null){
      System.out.print(last.data+" ");
      last= last.Prev;
    }
  }

  public static void main(String[] args) { //driver method
    Main DLL= new Main();

    DLL.push(7); //insert 7 as the first node
    DLL.push(8); //8 as second Node
    DLL.push(9); //9 as the third node
    DLL.insertAfter(DLL.head.Next, 1); //insert 1 after head node(7)
    DLL.insertAfter(DLL.head.Next.Next, 2); //insert 2 after 1

    System.out.println("Created DLL is: ");
    DLL.printL(DLL.head); //print the resultant list
  }
}
