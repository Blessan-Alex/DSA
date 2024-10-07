class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int c = 0;
        int consec = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                if (c>consec){
                    consec = c;
                }
                c=0;
            }
            
        }
        if (c>consec){
                    consec = c;
                }
        return consec;
    }
}