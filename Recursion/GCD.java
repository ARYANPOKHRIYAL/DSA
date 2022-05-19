//java program for finding the GCD of two numbers using recursion
class GCD{

  static int GCD(int a, int b){
    //base cases
    if(a<0 || b<0)
      return -1;
    if(b==0)
      return a;

    //recursive case
    return GCD(b,a%b);
 
  }

  public static void main(String[] args) {
    var G= GCD(8,4);
    System.out.println(G);
  }
}
