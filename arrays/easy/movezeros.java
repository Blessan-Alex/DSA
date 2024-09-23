class Solution {

    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int k=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        if(k!=0){
        for(int i=k;i<arr.length;i++){
            arr[i]=0;
        }
        }
    }
}
