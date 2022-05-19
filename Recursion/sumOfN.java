//java program to find the sum of first n whole numbers

class sumOfN{

  static int SUM(int n){
    if(n==1 || n==0){
      return n;
    }
    return n+SUM(n-1);
  }

  public static void main(String[] args) {
    var sum= SUM(100);
    System.out.println(sum);
  }
}
