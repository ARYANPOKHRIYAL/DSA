//java program to find the power of a number

class power{
  static int power(int base, int exp){
    if(exp<0)
      return -1;
    if(exp==0)
      return 1;
    return base*power(base,exp-1);
  }

  public static void main(String[] args) {
    var pow= power(2,3);
    System.out.println(pow);
  }
}
