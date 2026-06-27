class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map: Sorted Word -> List of Original Words
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            // 1. Sort the word to find its "category"
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            // 2. If this category doesn't exist yet, create a new list for it
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            // 3. Dump the original word into its correct category list
            map.get(sortedWord).add(word);
        }
        
        // 4. Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}