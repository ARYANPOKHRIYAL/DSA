class LinearSearch{
  int linearSearch(int[] arr, int value){
    for(int i=0; i<arr.length; i++){
      if(arr[i]==value){
        System.out.print("The value is found in the array.");
        return i;
      }
    }
    System.out.print("The value is not found in the array.");
    return -1;
  }
}

public class LINEARSEARCH{
  public static void main(String[] args) {
    int[] arr={10,4,23,43,56,12,22,1,6,2};
    LinearSearch LS= new LinearSearch();
    LS.linearSearch(arr, 43);
  }
}
