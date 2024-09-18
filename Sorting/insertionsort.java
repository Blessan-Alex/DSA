class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int k = i;
       while(k>0 && arr[k-1]>arr[k]){
           int temp = arr[k];
           arr[k]=arr[k-1];
           arr[k-1]=temp;
           k--;
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<n;i++){
          insert(arr,i);
      }
  }
}