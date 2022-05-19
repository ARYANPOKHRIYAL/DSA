class printConditionPairs{
  public static void main(String[] args) {

    int[] arr1=  new int[]{1,3,4,5};//-------> O(1)
    int[] arr2=  new int[]{1,3,4,5};//-------> O(1)

    for(int i=0; i<arr1.length; i++){//-------> O(MN)
      for(int j=0; j<arr2.length; j++){
        for(int k=0; k<1000000; k++) //-----------> O(1)
          System.out.print(arr1[i]+","+arr2[j]+" ");//------> O(1)
      }
      System.out.println();//-----> O(1)
    }
  }
}
// So, the total time complexity is O(MN),
//     where M is the length of arr1 and N is the length of arr2.
