class binarySearch{
  int binarySearch(int arr[], int x, int low, int high){

    //repeat till the pointers low and high meet each ohter
    while(low<=high){
      int mid= low+high(high-low)/2;
      if(arr[mid]==x)
        reaturn mid;
      if(arr[mid]<x)
        low= mid+1;
      else
        high= mid-1;
    }
    return -1;
  }

  public static void main(String[] args) {
    binarySearch ob= new binarySearch();
    int arr[]= {1,2,3,4,5,6,7,8,9};
    int n= arr.length;
  }
}
