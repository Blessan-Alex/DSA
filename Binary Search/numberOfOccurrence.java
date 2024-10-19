class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int firstIndex = firstOccurrence(arr,n,x);
        int lastIndex = lastOccurence(arr,n,x);
        if(firstIndex==0&&lastIndex==0){
            return 0;
        }
        else
        {
        return lastIndex-firstIndex+1;
        }
    }
    
    int firstOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n-1, index = 0;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                index=mid;
                high=mid-1;
            }
        }
        return index;
    }
    
    int lastOccurence(int[] arr, int n, int x) {
        int low = 0, high = n-1, index = 0;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                index=mid;
                low=mid+1;
            }
        }
        return index;
    }
}