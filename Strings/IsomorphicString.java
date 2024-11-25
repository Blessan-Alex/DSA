class Solution {
    public boolean isIsomorphic(String s, String t) {
        
            /*if (s.length() != t.length()) {
            return false;
        }
            int sArray[]= new int[256];
            int tArray[]=new int[256];
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sArray[sChar]==0 && tArray[tChar]==0){
                sArray[sChar]=tChar;
                tArray[tChar]=sChar;
            }
            else if(sArray[sChar]!=tChar || tArray[tChar]!=sChar){
                return false;
            }
        }
        return true;*/

        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        int n = s.length();
        for(int i = 0;i<n;i++){
            char sa = s.charAt(i);
            char ta = t.charAt(i);
            if(map1.containsKey(sa)&&map1.get(sa)!=ta){
                return false;
            }
            if(map2.containsKey(ta)&& map2.get(ta)!=sa){
                return false;
            }
            map1.put(sa,ta);
            map2.put(ta,sa);
        }
        return true;

    }
}