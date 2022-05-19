//java program to convert a decimal number to binary

class BDC{
  static int BDC(int n){
    if(n==0)
      return 0;
    return n%2+10*BDC(n/2);
  }

  public static void main(String[] args) {
      var B= BDC(12);
      System.out.println(B)
  }
}
