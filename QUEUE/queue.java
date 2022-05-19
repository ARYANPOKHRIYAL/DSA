public class Queue{
  int size=5;
  int[] items= new int[size];
  int front, rear

  queue(){
    front= -1;
    rear= -1;
  }

  boolean isFull(){
    if(front==0 && rear==size-1)
      return true;
    else
      return false;
  }
  boolean isEmpty(){
    if(front== -1)
      return true;
    else
      return false;
  }

  void enQueue(int x){
    if(isFull())
      System.out.println("Queue is Full.");

    else{
      if(front== -1)
        front=0;
      rear++;
      item[rear]= x;
      System.out.println(x+" inserted in the queue");
    }
  }

  int deQueue(){
    int x;
    if(isEmpty())
      System.out.println("Queue is Empty.");
    else{
      x= items[front];
      if(front>=rear){
        front= -1;
        rear= -1;
      }
      else
        front++;
    }
    System.out.println(x+" deleted from the queue.");
    return x;
  }

  void display(){
    if(isEmpty()){
      System.out.println("Empty queue.");
    }
    else{
      for(int i= front; i<=rear; i++){
        System.out.println(items[i]+" ")
      }
    }
  }

  public static void main(String[] args) {
    Queue q= new Queue();

    q.deQueue();
    q.enQueue(12);
    q.enQueue(13);
    q.enQueue(14);
    q.enQueue(15);
    q.enQueue(16);
    q.enQueue(17);
    q.display();
    q.deQueue();
    q.display();
  }
}
