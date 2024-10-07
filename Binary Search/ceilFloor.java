import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      //Find floor
      int low = 0, high = n-1;
      int floor = -1;
      while (low<=high) {
        int mid = (low+high)/2;
        if (a[mid]<=x) {
          floor=a[mid];
          low=mid+1;
        }
        else{
          high=mid-1;
        }
      }
      // Find ceil
      low = 0;
      high = n-1;
      int ceil = -1;
      while (low<=high) {
        int mid = (low+high)/2;
        if (a[mid]>=x) {
          ceil=a[mid];
          high=mid-1;
        }
        else{
          low=mid+1;
        }
        
      }
      int[] arr={floor,ceil};
      return arr;
      
    }
    
}