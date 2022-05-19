class sumAndMulti{

  static void SumAndMulti(int[] arr){
    int sum=0;  //--------------> O(1)
    int product=1;//------------> O(1)

    if(arr.length==0)//-----------> O(1)
      System.out.println(" ");//-------------> O(1)

    for(int i=0; i<arr.length; i++){//----------> O(N)
      sum+=arr[i]; //------------> O(1)
    }
    for(int i=0; i<arr.length; i++){ //-----------> O(N)
      product*=arr[i]; //------------> O(1)
    }
    System.out.println(sum+", "+product); //-------------> O(1)
  }
}

//So, at the end, the time complexity of the above created method is O(N).
