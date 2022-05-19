class Stack{
  static final int MAX=1000;
  int top;
  int a[]= new int[MAX]; // Max size of the stack

  boolean isEmpty(){ //to check if the stack is empty or not
    return(top<0);
  }
  Stack(){
    top=-1;
  }

  boolean push(int x){  //to push an element in the stack
    if(top>=(MAX-1)){ //to check if the stack is full or not
      System.out.println("Stack OverFlow!");
      return false;
    }
    else{  //else push the element in the stack
      a[++top]=x;
      System.out.println(x+" pushed into the Stack");
      return true;
    }
  }

  int pop(){  //to remove the top element from the stack
    if(top<0){  //to check if the stack contains any elements to pop
      System.out.println("Stack UnderFlow!");
      return 0;
    }
    else{  //if false then pop the element at the top
      int x= a[top--];
      return x;
    }
  }

  int peek(){  //to fetch the latest added element in the stack
    if(top<0){
      System.out.println("Stack UnderFlow!");
      return 0;
    }
    else{
      int x= a[top];
      return x;
    }
  }

  void print(){ //to print the elements present currently in the stack
    for(int i=top; i>-1; i--){
      System.out.println(" "+a[i]);
    }
  }

}

// the driver method
class stackByArray{
  public static void main(String[] args) {
    Stack S= new Stack();
    S.push(10);
    S.push(20);
    S.push(30);
    System.out.println(S.pop()+" popped from the stack");
    System.out.println("top element is: "+S.peek());
    System.out.println("Elements present in the stack are:");
    S.print();
  }
}
