class Node{
  int data;
  Node Next;

  Node(int data){
    this.data=data;
  }
}

public class test3{
  static Node Head;

  public static int count(){
    Node temp= Head;
    int c=0;
    while(temp!=null){
      c++;
      temp=temp.Next;
    }
    return c;
  }

  public static void insertAtPos(int pos, int x){
    Node n= new Node(x);

    if(Head==null){
      if(pos>1){
        System.out.println("Invalid Position!");
      }
      else{
        Head=n;
      }
    }

    else if(pos>count()+1){
      System.out.println("Invalid Position!");
    }
    else{
      Node temp= head;
      int c=1;
      while(temp.Next!=null){
        if(c==pos-1){
          break;
        }
        c++;
        temp=temp.Next;
      }
      n.Next= temp.Next;
      temp.Next= n;
    }
  }
  public static void main(String[] args) {

    Node N1= new Node(10);
    Head= N1;  // Head contains the reference to N1
    Node N2= new Node(20);
    N1.Next= N2;  //N1 will contain the reference to N2
    Node N3= new Node(30);
    N2.Next= N3;  //N2 will  contain the reference to N3
    insertAtPos(3,50);
  }
}
