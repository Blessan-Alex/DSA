class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
        int index = partition(arr,low,high);
        quickSort(arr,low,index-1);
        quickSort(arr,index+1,high);
        }
    
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[low];
        int i = low;
        int k = high;
        while(i<k){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[k]>pivot && k>=low+1){
                k--;
            }
            if(i<k){
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[k];
        arr[k]=temp;
        return k;
    } 
}