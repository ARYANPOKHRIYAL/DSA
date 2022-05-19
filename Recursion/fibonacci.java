class fibonacci{

  static int fibonacci(int n){
    if(n<0) //----> O(1)
      return -1;
    if(n==0 || n==1) //----> O(1)
      return n;

    return fibonacci(n-1)+fibonacci(n-2); //----> O(2^n),
    //according to O(Branches^depth) formula
  }

  public static void main(String[] args) {
    var fib= fibonacci(5); //----> O(1)
    System.out.println(fib); //----> O(1)
  }
}

//So, the time complexity of this program is O(2^n).
