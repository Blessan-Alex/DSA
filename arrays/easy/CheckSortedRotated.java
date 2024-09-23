class Solution {
    public boolean check(int[] arr) {
    
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        if(count>1){
            return false;
        }
        else{
            return true;
        }
    }
}