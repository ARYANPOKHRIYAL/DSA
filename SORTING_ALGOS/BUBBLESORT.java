class BubbleSort{
  //Bubble-Sort Method
  void bubbleSort(int[] arr){
    int n= arr.length;

    for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        if(arr[j]<arr[j+1]){
          int temp= arr[j];
          arr[j]= arr[j+1];
          arr[j+1]= temp;
        }
      }
    }
  }
//Print Method
  void printArray(int[] arr){
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i]+" ");
  }
}

public class BUBBLESORT{
  public static void main(String[] args) {
    BubbleSort BS= new BubbleSort();
    int[] arr= {10,4,23,43,56,12,22,1,6,2};
    BS.bubbleSort(arr);
    BS.printArray(arr);
  }
}
