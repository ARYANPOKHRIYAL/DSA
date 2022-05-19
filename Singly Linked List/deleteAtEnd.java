class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class deleteAtEnd{
  static Node Head;

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

  public static void deleteAtEnd(){
   if(Head==null){ //if the head is null
     return;
   }
   else{ //if the head is not null
     Node temp= Head;
     if(temp.Next==null){ //if only one node is in the list
       Head=null;
     }
     else{
       while(temp.Next.Next!=null){ // if there are more nodes
         temp=temp.Next;
       }
       temp.Next=null; //the last node will be deleted
                      //and the new last node will contain a null reference
     }
   }
  }

  public static void main(String[] args) {

    insertAtEnd();
    insertAtEnd();
    insertAtEnd();
    insertAtEnd();
    deleteAtEnd();
  }
}
