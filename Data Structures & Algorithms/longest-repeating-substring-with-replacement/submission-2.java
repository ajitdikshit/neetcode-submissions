class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer> alpha=new HashMap<>();
      int left=0;
      int maxfreq=0;
      int maxlen=0;
      for(int right=0;right<s.length();right++){
        char rightchar=s.charAt(right);
        alpha.put(rightchar,alpha.getOrDefault(rightchar,0)+1);
        maxfreq=Math.max(maxfreq,alpha.get(rightchar));
        while((right-left+1)-maxfreq>k){
            alpha.put(s.charAt(left),alpha.getOrDefault(s.charAt(left),1)-1);
            left++;
        }
        maxlen=Math.max(maxlen,(right-left+1));
      }  
      return maxlen;
    }
}
