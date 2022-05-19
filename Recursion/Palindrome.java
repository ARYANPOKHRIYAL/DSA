class Palindrome{
  
  static String isPalindrome(String s){
    if(s.length()==0 || s.length()==1)
      return true;
    if(s.charAt(0)== s.charAt(s.length()-1)) // if the sirst and the last letter are same
      return isPalindrome(s.substring(1,s.length()-1));// return a subtring excluding the 1st and the last letter
    return false;
  }
  public static void main(String[] args) {
    boolean s= isPalindrome("RACECAR");
    System.out.println(s);
  }
}
