class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int k = 0;
        while(i<n&&k<m){
            
            if(a[i]<=b[k]){
                if(list.size()==0||list.get(list.size() - 1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(list.size()==0||list.get(list.size() - 1)!=b[k]){
                    list.add(b[k]);
                }
                k++;
            }
        }
        
        
        while(k<m){
            if(list.size()==0||list.get(list.size() - 1)!=b[k]){
                    list.add(b[k]);
                }
                k++;
        }
        
        while(i<n){
            if(list.size()==0||list.get(list.size() - 1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
        }
        
        return list;
    }
}
