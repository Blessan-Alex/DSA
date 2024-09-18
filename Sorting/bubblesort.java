class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n;i++){
            int didswap=0;
            for(int k=0;k<n-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k+1];
                    arr[k+1]=arr[k];
                    arr[k]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }
}