//java program to implement stack using linked list

class Node{
  String Name;
  Node Next;

  Node(String Name){
    this.Name= Name;
    Next= null;
  }
}

public class stack{

  static Node Top;
  boolean isEmpty(){
    if(Top==null){
      return true;
    }
    else{
      return false;
    }
  }

  void push(String x){
    Node New= new Node(x);
    if(isEmpty()){
      Top= New;
    }
    else{
      New.Next= Top;
      Top= New;
    }
  }

  String pop(){
    if(isEmpty()){
      System.out.println("Stack is empty.");
    }
    else{
      int x= top.data;
      Top= Top.Next;
      return x;
    }
    return -1;  //mandatory to write
  }

  String peek(){
    if(isEmpty()){
      System.out.println("Stack is empty.");
    }
    else{
      int x= Top.data;
      return x;
    }
    return -1; //mandatory to write
  }


  public static void main(String[] args) {
    push("Aryan");
    push("Pop");
    push("Ayush");
    pop();
    peek();
  }
}
