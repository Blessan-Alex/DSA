class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low = 0, high = arr.size()-1, min=Integer.MAX_VALUE,minIndex=0;
        // Handling the case when the array is not rotated at all  
        if (arr.get(low) < arr.get(high)) {  
            return 0;  
        }  

        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(low)<=arr.get(mid)){
                if(min>arr.get(low)){
                    min=arr.get(low);
                    minIndex=low;
                }
                low=mid+1;
            }
            else{
                if(min>arr.get(mid)){
                    min=arr.get(mid);
                    minIndex=mid;
                }
                high=mid-1;
            }
        }
        return minIndex;
    }
}