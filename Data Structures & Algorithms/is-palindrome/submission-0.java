class Solution {
    public boolean isPalindrome(String s) {
        String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
        alphanumeric=alphanumeric.toLowerCase();
        for(int x=0;x<alphanumeric.length()/2;x++){
            if(alphanumeric.charAt(x)!=alphanumeric.charAt(alphanumeric.length()-x-1)){
                return false;
            }
        }
        return true;
    }
}
