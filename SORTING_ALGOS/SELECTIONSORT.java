class SelectionSort{

//Selection-Sort Method
  void selectionSort(int[] arr){
    int n= arr.length;
    for(int j=0; j<n; j++){ //-------> O(N)
      int minIndex=j; //-------> O(1)
      for(int i=j+1; i<n; i++){ //-------> O(N)
        if(arr[i]<arr[minIndex]) //comparing the elements to find the minimum one, O(1)
          minIndex=i;
      }
      if(minIndex!=j){ //if the minimum element is what we have taken, O(1)
        int temp=arr[j];
        arr[j]= arr[minIndex];
        arr[minIndex]= temp;
      }
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

public class SELECTIONSORT{
  public static void main(String[] args) {
    SelectionSort SS= new SelectionSort();
    int[] arr= {10,4,23,43,56,12,22,1,6,2};
    SS.selectionSort(arr);
    SS.printArray(arr);
  }
}
