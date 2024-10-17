


//Positive
public class Solution {
    public static int longestSubarrayWithSumK(int []A, long K) {
        
        int N = A.length;
        int sum=A[0];
        int left = 0, right =0;
        int len = 0;
        while(right<N){
            while(left<=right&&sum>K){
                sum-=A[left];
                    left++;
            }
            
            if(sum==K){
                    len=Math.max(len,right-left+1);
                }
            right++;
            if(right<N){
                sum+=A[right];
            }
        }
        // Complete the function
        return len;
    }
}