class MergeSort{
//Merge-Sort Method
  void mergeSort(int[] arr){

  }

//Print Method
  void printArray(int[] arr){
    int n= arr.length;
    for(int i=0; i<n; i++)
      System.out.print(arr[i]+" ");
  }
}


public class MERGESORT{
  public static void main(String[] args) {
    MergeSort MS= new MergeSort();
    int[] arr= {10,4,23,43,56,12,22,1,6,2};
    MS.mergeSort(arr);
    MS.printArray();
  }
}
