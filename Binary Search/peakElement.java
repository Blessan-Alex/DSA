class Solution {
    public int findPeakElement(int[] nums) {
        int low = 1;
        int high = nums.length-2;
        int mid = 0;
        if(nums.length == 1){
            return 0;
        }
        if(nums[1]>nums[2]){
            return 1;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid-1]<nums[mid]&& nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return mid;
    }
}