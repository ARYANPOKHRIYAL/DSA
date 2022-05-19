class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class insertBeg{
  // Head is static because we are calling the variable in the static function 'Main'
  static Node Head;
  //To add a node at the top of the list:-
  public static void insertAtBeg(int k){
    Node New= new Node(k); //we create a new node add it at the begginning
    New.Next=Head; //newNode contains the address of the previous top(N1)
    Head=New; //Head will be now the new node.
  }

  //To print the list one by one:-
  public static void print(){
    Node temp=Head;
    while(temp!=null){ //while temp is not null
      System.out.print(temp.data+" "); //print the data
      temp=temp.Next; //temp contains the address of the next node
    }
  }

  //Main driver method:-
  public static void main(String[] args) {

    Node N1= new Node(5);
    Head=N1;
    Node N2= new Node(20);
    N1.Next=N2;
    Node N3= new Node(30);
    N2.Next=N3;
    print();
    insertAtBeg(50);
    print();
  }
}
