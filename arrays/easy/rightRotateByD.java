class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k=k%n;
        int[] temp=new int[k];
        for(int i =n-k;i<n;i++){
            temp[i-(n-k)]=nums[i];
        }
        for(int i =n-1;i>=k;i--){
            nums[i]=nums[i-k]; //Got stuck here with overwriting issue, now fixed with backward loop
        }
        for(int i =0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}