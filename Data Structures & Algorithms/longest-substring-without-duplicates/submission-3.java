class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0; int right;
        HashMap<Character,Integer> characters=new HashMap<>();
        char c;
        int maxlen=0;
        for(int x=0;x<s.length();x++){
            right=x;
            c=s.charAt(right);
            if(!characters.containsKey(c)){
                characters.put(c,x);
            }else{
                left=Math.max(left,characters.get(c)+1);
                characters.put(c,right);
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
