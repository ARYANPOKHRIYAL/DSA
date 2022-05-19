class printUnorderedPairs{
  public static void main(String[] args) {

    int[] arr=  new int[]{1,3,4,5};//-------> O(1)

    for(int i=0; i<arr.length; i++){//-------> O(N^2)
      for(int j=i+1; j<arr.length; j++){
        System.out.print(arr[i]+","+arr[j]+" ");//------> O(1)
      }
      System.out.println();//-----> O(1)
    }
  }
}
// So, the total time complexity is O(N^2).
