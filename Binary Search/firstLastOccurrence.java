class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        if(nums.length==0){
            return arr;
        }
        int firstIndex = firstTime(nums,target);
        int lastIndex = lastTime(nums,target);
        //System.out.println(firstIndex+" "+lastIndex);
        if(nums[firstIndex]!=target || nums[lastIndex]!=target){
            return arr;
        }
            arr[0]=firstIndex;
            arr[1]=lastIndex;
            return arr;
        
    }

    public int firstTime(int[] nums, int target){
        int check = 0;
        int low = 0;
        int first = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                high=mid-1;
                first = mid; 
                }
            else if(nums[mid]<target) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }          
        return first;
    }

    public int lastTime(int[] nums, int target){
        int check = 0;
        int low = 0;
        int last =0 ;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                low=mid+1;
                last=mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
                }
            else {
                high=mid-1;
            }
        }          
        return last;
    }
}
        
