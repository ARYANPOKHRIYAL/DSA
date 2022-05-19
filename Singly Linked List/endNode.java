//java program to add a node at the end of a linked list

class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class endNode{
  static Node Head;

  public void InsertAtEnd(int x){  //function to add node at the end
    Node n= new Node(x);
    Node temp=Head;
    while(temp.Next!=null){  //traverse through the list till temp.Next is not equal to null
      temp=temp.Next;
    }
    temp.Next=n;
  }

  public static void print(){
    Node temp= Head;  //temp contains the value of head

    while(temp!= null){ // till the temp is not null.....
      System.out.println(temp.data+" ");
      temp=temp.Next;
    }
  }

  public static void main(String[] args) {

    endNode Obj= new endNode();
    Node N1= new Node(10);
    Obj.Head= N1;  // Head contains the reference to N1
    Node N2= new Node(20);
    N1.Next= N2;  //N1 will contain the reference to N2
    Node N3= new Node(30);
    N2.Next= N3;  //N2 will  contain the reference to N3
    print();
    Obj.InsertAtEnd(50);
    print();
  }
}
