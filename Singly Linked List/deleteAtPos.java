class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class deleteAtEnd{
  static Node Head;

  //to count the no. of nodes in list
  public static int count(){
    Node temp=Head;
    int c=0;

    while(temp!=null){
      c++;
      temp=temp.Next;
    }
    return c;
  }

  public static void insertAtEnd(int x){
    Node n= new Node(x);

    if(Head==null){ //if head is null, make the new node 'Head'
      Head=n;
    }
    else{
      Node temp= Head;

      while(temp.Next!=null){
        temp=temp.Next;
      }
      temp.Next=n;
    }
  }

  public static void deleteAtPos(int pos){
    if(Head==null){
      return;
    }

    else{ //if head is not null
      if(Head.Next==null){ //if there is a node present?
        if(pos!=1){ //if there is a node present, is the position correct?
          System.out.println("Invalid Position!");
        }
        else{ //if the position is correct, then delete the node
          Head=null;
        }
      }

      else{ //if there are more than one node?
        int c=1;
        if(pos>count()){ //is the position correct?
          System.out.println("Invalid Position!");
        }
        else{ //if the position is correct?
          Node temp=Head;
          while(temp!=null){ //traverse the list
            if(c==pos-1){
              break;
            }
            c++;
            temp=temp.Next;
          }
          temp.Next=temp.Next.Next;// if the position is found,
          //then the temp will contain reference of the next to the next node
        }
      }
    }
  }

  public static void main(String[] args) {

    insertAtEnd(10);
    insertAtEnd(20);
    insertAtEnd(30);
    insertAtEnd(40);
    deleteAtPos(3);
  }
}
