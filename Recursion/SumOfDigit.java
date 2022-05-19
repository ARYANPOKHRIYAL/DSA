//java program to find the sum of digits of a number

class SumOfDigit{
  static int func(int n){
    if(n<0){
      return 0;
    }

    if(n==0){
      return 0;
    }
    return n%10+func(n/10);
  }

  public static void main(String[] args) {
    var sum= func(14);
    System.out.println(sum);
  }
}
