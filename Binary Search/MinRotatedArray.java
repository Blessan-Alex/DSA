class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length-1, min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            //left half is sorted
            if(nums[low]<=nums[mid]){
                if(min>nums[low]){
                    min=nums[low];
                }
                low=mid+1;
            }
            else{
                if(min>nums[mid]){
                    min=nums[mid];
                }
                high=mid-1;
            }
        }
        return min;
    }
}