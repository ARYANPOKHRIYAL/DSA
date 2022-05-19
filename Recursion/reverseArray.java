import java.util.Arrays;

class reverseArray{

  public static void main(String[] args) {
    int[] arr= new int[]{1,2,3,4,5,6};

    for(int i=0; i<arr.length/2; i++){ //-----> O(N/2)
      int lastIndex= arr.length-i-1; //------> O(1)
      int temp= arr[i]; //------> O(1)
      arr[i]= arr[lastIndex]; //------> O(1)
      arr[lastIndex]= temp; //------> O(1)
    }
    System.out.println(Arrays.toString(arr)); //------> O(1)
  }
}

//So, the final time complexity of this program is O(N).
