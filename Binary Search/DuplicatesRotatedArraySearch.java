class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low++;
                high--;
                continue;
                // without continue is also fine, helps make it more efficient
            }
            //left half sorted
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right half sorted
            else{
                if(target<=arr[high]&& arr[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}