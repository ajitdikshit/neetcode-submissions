class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character,Integer> freq1=new Hashtable<>();
        Hashtable<Character,Integer> freq2=new Hashtable<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            freq1.put(s.charAt(i), freq1.getOrDefault(s.charAt(i), 0) + 1);
            freq2.put(t.charAt(i), freq2.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(int i=0;i<s.length();i++){
            if(!freq1.getOrDefault(s.charAt(i),0).equals(freq2.getOrDefault(s.charAt(i),0))){
                return false;
            }
        }
        return true;
    }
}
