class Node{
  int data;
  Node Next;
  Node(int data){
    this.data=data;
  }
}

public class deleteAtBeg{
  static Node Head;

  public static void insertAtEnd(int x){
    Node n= new Node(x);

    if(Head==null){ //if head is null
      Head=n;
    }
    else{ //if the head is not null
      Node temp= Head;
      while(temp.Next!=null){
        temp=temp.Next;
      }
      temp.Next=n;
    }
  }

  public static void deleteAtBeg(){
    if(Head==null){ //if the head is null
      return;
    }
    else{ //if head is not null, head contains the reference of the 2nd node
      Head= Head.Next;
    }
  }

  public static void main(String[] args) {

    insertAtEnd(10);
    insertAtEnd(20);
    insertAtEnd(30);
    insertAtEnd(40);
    deleteAtBeg();
  }
}
