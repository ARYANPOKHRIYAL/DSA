public class queue{
  int size=5;
  int[] items= new int[size];
  int front, rear;

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
  int enQueue(int x){
    if(isFull())
      System.out.println("Queue is full.");
    else{
      if(front== -1)
        front= 0;

      rear++;
      items[rear]= x;
      System.out.println(x+" inserted in the queue.");
    }
  }

  int deQueue(){
    if(isEmpty())
      System.out.println("Queue is empty.");
    else{
      x= items[front];
      if(front>=rear){
        front= -1;
        rear= -1;
      }
      else
        front++;
    }
    System.out.println(x+" got dequeued from the queue.");
    return x;
  }

  void display(){
    if(isEmpty()){
      System.out.println("Empty Queue.");
    }
    else{
      System.out.println("Queue is: ");
      for(int i= front; i<=rear; i++){
        System.out.println(items[i]+" ");
      }
    }
  }

  public static void main(String[] args) {
    queue Q= new queue();

    Q.enQueue(12);
    Q.enQueue(13);
    Q.enQueue(14);
    Q.enQueue(15);
    Q.enQueue(16);
    Q.display();
    Q.deQueue();
    Q.display();
  }
}
