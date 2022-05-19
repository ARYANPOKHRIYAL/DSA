class Node{
  String Name;
  Node Next;

  Node(String Name){
    this.Name= Name;
    this.Next= null;
  }
}

public class example2{
  static Node Head;

  void insertAtEnd(String x){
    Node New= new Node(x);
    Node temp= Head;

    if(Head==null){
      Head= New;
    }
    else{
      while(temp.Next!=null){
        temp= temp.Next;
      }
      temp.Next= New;
    }
  }

  public static void main(String[] args) {
    example2 obj= new example2();
    obj.insertAtEnd("Shantanu");
    obj.insertAtEnd("Anshu");
    obj.insertAtEnd("Avinash");
  }
}
