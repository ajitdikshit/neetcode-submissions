class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.equals("")) return "";
        
        int[] countT = new int[128];
        int[] window = new int[128];
        
        int need = 0;
        for (char c : t.toCharArray()) {
            if (countT[c] == 0) need++; 
            countT[c]++;
        }
        
        int have = 0;
        int left = 0;
        int[] result = {-1, Integer.MAX_VALUE}; 
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;
            
            if (countT[c] > 0 && window[c] == countT[c]) {
                have++;
            }
            
            while (have == need) {
                if ((right - left + 1) < result[1]) {
                    result[0] = left;
                    result[1] = right - left + 1;
                }
                
                char leftChar = s.charAt(left);
                window[leftChar]--;
                
                if (countT[leftChar] > 0 && window[leftChar] < countT[leftChar]) {
                    have--;
                }
                
                left++;
            }
        }
        
        if (result[1] == Integer.MAX_VALUE) return "";
        return s.substring(result[0], result[0] + result[1]);
    }
}