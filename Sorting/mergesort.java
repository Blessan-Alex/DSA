

class Solution
{
    void merge(int arr[], int low, int mid, int high)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int left=low;
        int right=mid+1;
        
        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid ){
            list.add(arr[left]);
            left++;
        }
        while(right<=high ){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        
    }
    void mS(int arr[], int low, int high)
    {
        
        if(low==high){
            return;
        }
        int mid=(low+high)/2;
        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void mergeSort(int arr[], int l, int r)
    {
        l=0;
        r=arr.length-1;
        mS(arr,l,r);
    }
}