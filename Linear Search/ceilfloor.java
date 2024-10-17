class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = Integer.MIN_VALUE, ceil = Integer.MAX_VALUE;
        boolean f = false, c=false;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                floor = Math.max(floor,arr[i]);
                f=true;
            }
            
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
                ceil = Math.min(ceil,arr[i]);
                c=true;
            }
            
        }
        if(!f){
            floor=-1;
        }
        if(!c){
            ceil=-1;
        }
        int[] ans={floor,ceil};
        return ans;
        
    }
}