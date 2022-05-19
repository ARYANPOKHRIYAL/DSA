class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class insertAtPos{
  Node Head;

  public int count(){ //to count the noumber of nodes in the list
    int c=0;
    Node temp= Head;
    while(temp!=null){
      c++;
      temp=temp.Next;
    }
    return c;
  }

  public void insertAtPos(int pos, int x){
    Node n= new Node(x); //to create a new node

    if(Head==null){ //if the list is empty...
      if(pos>1)
        System.out.println("Invalid position!");
      else
        Head=n;
    }
    else{ //when if the list is not empty....
      if(pos==1){
        n.Next=Head;
        Head= n;
      }
       else if(pos>count()+1){ //if the position is greater than the (no.of nodes+1)...
         System.out.println("Invalid position!");
       }
       else{ //if the position id valid
         Node temp= Head;
         int c=1;
         while(temp.Next!=null){
           if(c==pos-1){
             break;
           }
           c++;
           temp=temp.Next;
          }
          n.Next=temp.Next;// new node will contain the reference of the node after it
          temp.Next=n; // the reference of the new node is in the node before it
         }
       }
    }

    public static void main(String[] args) {

      insertAtPos Obj= new insertAtPos();
      Node N1= new Node(10);
      Obj.Head= N1;  // Head contains the reference to N1
      Node N2= new Node(20);
      N1.Next= N2;  //N1 will contain the reference to N2
      Node N3= new Node(30);
      N2.Next= N3;  //N2 will  contain the reference to N3
      Obj.insertAtPos(3,50);
    }
  }
