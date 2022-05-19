class firstSubstring{

  static String isFirst(String str){
    if(str.length()==0) //if the string is empty
      return 0;
    if(Character.isUpperCase(str.chatAt(0))) //if the the first letter is Uppercase
      return str.charAt(0);
    else
      return isFirst(str.substring(1,str.length()-1)); //try for the next letter in the string recursively
  }
  public static void main(String[] args) {
    var str= isFirst("arYAn");
    System.out.println(str);
  }
}
