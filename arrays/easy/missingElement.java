class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        int sumMissing=0;
        for(int i =0;i<nums.length;i++){
            sumMissing += nums[i];
        }
        return sum-sumMissing;
        
    }
}

//Using xor , since finding sum of large nunmbers can use tad bit more memory

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1=0, xor2=0;
        for(int i =0;i<n;i++){
            xor2=xor2^nums[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^0;
        return xor1^xor2;
    }
}