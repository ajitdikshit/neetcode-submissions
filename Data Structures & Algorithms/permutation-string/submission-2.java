class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int[] fre1=new int[26];
    int[] fre2=new int[26];
    int left=0;
    if (s1.length() > s2.length()) {
            return false;
        }
    for(int x=0;x<s1.length();x++){
        fre1[s1.charAt(x)-'a']++;
        fre2[s2.charAt(x)-'a']++;
    }
    for(left=0;left<s2.length()-s1.length();left++){
        if(Arrays.equals(fre1,fre2)){
            return true;
        }
        fre2[s2.charAt(left)-'a']--;
        fre2[s2.charAt(left+s1.length())-'a']++;
    }
    return Arrays.equals(fre1,fre2);
    }
}
