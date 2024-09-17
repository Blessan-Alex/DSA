package Basics.Hashing;
/*
Frequencies of Limited Range Array Elements
Difficulty: EasyAccuracy: 27.64%Submissions: 296K+Points: 2
You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.
Note:
Do modify the array in-place changes in arr[], such that arr[i] = frequency(i) and assume 1-based indexing.
The elements greater than n in the array can be ignored when counting.
N=7
3 4 4 8 1 2 5
P=9
*/
public class freq {
    
// Function to count the frequency of all elements from 1 to N in the array.
public static void frequencyCount(int arr[], int N, int P) {
    // do modify in the given array
    for (int i = 0; i < N; ) {  
        if (arr[i] > 0 && arr[i] <= N) {
            int k = arr[i]-1;
            if(arr[k]<0){
                arr[i]=0;
                arr[k]-=1;
                i++;
            }
            else{
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                arr[k]= -1;
            }
        }
        else if (arr[i] > N) {  
            arr[i]  = 0 ; // add n+1 to mark an increase, using 1-based index  
        }  
        else{
            i++;
        }
    }
    for (int i = 0; i < arr.length;i++ ) {
        arr[i]=-arr[i];
    }

}  
}
    


