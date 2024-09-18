class Solution
{
	int  select(int arr[], int i)
	{
	    int min=i;
        for(int k=i+1;k<arr.length;k++){
            
            if(arr[k]<arr[min]){
                min=k;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<=n-1;i++){
	        int min = select(arr,i);
	        int temp =  arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	    }
	}
}