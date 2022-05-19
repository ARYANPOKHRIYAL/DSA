class InsertionSort{
  //Insertion-Sort Method
  void insertionSort(int[] arr){
    int n= arr.length;
    for(int i=1; i<n; i++){ //-------> O(N)
      int temp= arr[i], j=i;  //-------> O(1)
      while(j>0 && arr[j-1]>temp){ //-------> If the previous element is less than the next element, O(N)
        arr[j]=arr[j-1]; //-------> O(1) //Swap them
        j--; //-------> O(1)
      }
      arr[j]= temp; //------->Else let the numer be itself, O(N)
    }
    //Time Complexity: O(N^2)
    //Space Complexity: O(N)
  }
//Print Method
  void printArray(int[] arr){
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i]+" ");
  }
}

public class INSERTIONSORT{
  public static void main(String[] args) {
    InsertionSort IS= new InsertionSort();
    int[] arr= {10,4,23,43,56,12,22,1,6,2};
    IS.insertionSort(arr);
    IS.printArray(arr);
  }
}
