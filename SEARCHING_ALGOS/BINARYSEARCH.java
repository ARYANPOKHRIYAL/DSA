class BinarySearch{
  int binarySearch(int[] arr, int value){
    int start=0;
    int end= arr.length-1;
    int middle= (start+end)/2;
    System.out.print(start+" "+middle+" "+end);
    while(middle!=value && start<=end){
      if(value<arr[middle])
        end= middle-1;
      else
        start= middle+1;
      middle= (start+end)/2;
      System.out.print(start+" "+middle+" "+end);
    }
    if(arr[middle]==value){
      System.out.print("The value is present in the array at index: "+middle);
    }
    else{
      System.out.print("The value is not found in the array.");
      return -1;
    }
    return middle;
  }
}

public class BINARYSEARCH{
  public static void main(String[] args) {
    int[] arr={10,4,23,43,56,12,22,1,6,2};
    BinarySearch BS= new BinarySearch();
    BS.binarySearch(arr, 43);
  }
}
