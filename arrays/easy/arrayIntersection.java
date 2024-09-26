import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		int i=0;
		int k=0;
		ArrayList<Integer> list = new ArrayList<>();

		while(i<n && k<m){
			if(arr2.get(k)<arr1.get(i)){
				k++;
				
			}
			else if(arr1.get(i)<arr2.get(k)){
				i++;
			}
			else{
				list.add(arr1.get(i));
				i++;
				k++;
			}
			}
			return list;
		}
	}

