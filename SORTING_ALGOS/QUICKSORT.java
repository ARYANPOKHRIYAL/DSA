class QuickSort{
//Partition Method to return the pivot number....
  int Partition(int[] arr, int start, int end){
    int pivot= end;  //------->O(1)
    int i= start-1;  //------->O(1)

    for(int j= start; j<=end; j++){  //------->O(N)
      if(arr[j]<=arr[pivot]){  //------->O(1)
        i++;  //------->O(1)
        int temp= arr[i];  //------->O(1)
        arr[i]= arr[j];  //------->O(1)
        arr[j]= temp;  //------->O(1)
      }
    }
    return i;  //------->O(1)
    //Time Complexity: O(N)
  }

  void quickSort(int[] arr, int start, int end){  //------->T(N)
    if(start<end){
      int pivot= Partition(arr, start, end);  //------->O(N)
      quickSort(arr, start, pivot-1);  //------->T(N/2)
      quickSort(arr, pivot+1, end);  //------->T(N/2)
    }
    //Time Complexity: O(NLogN)
    //Space Complexity: O(N)
  }

//Print Method
  void printArray(int[] arr){
    int n= arr.length;
    for(int i=0; i<n; i++)
      System.out.print(arr[i]+" ");
  }
}


public class QUICKSORT{
  public static void main(String[] args) {
    QuickSort QS= new QuickSort();
    int[] arr= {10,4,23,43,56,12,22,1,6,2};
    QS.quickSort(arr,0,arr.length-1);
    QS.printArray(arr);
  }
}
