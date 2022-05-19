//java proram to find the factorial of a number

class factorial{
  static int factorial(int n){ //----> M(n)
    //base cases
    if(n<0) //----> O(1)
      return -1;

    if(n==0 || n==1) //----> O(1)
      return 1;
    // recursive case
    System.out.println(n); //----> O(1)
    return n*factorial(n-1); //---->M(n-1)
  }
  public static void main(String[] args) {
    var rec= factorial(5); //----> O(1)
    System.out.println(rec); //----> O(1)
  }
}
// the time complexity for this program can be a+M(n-a)
