class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int resIndex = 0; 

        int left = 0;
        int right = k - 1;
        int max = Integer.MIN_VALUE;
        int maxindex = -1;

        while (right < nums.length) {
            
            if (left > maxindex) {
                max = Integer.MIN_VALUE;
                for (int i = left; i <= right; i++) {
                    if (max < nums[i]) {
                        max = nums[i];
                        maxindex = i;
                    }
                } 
            } 
            else if (nums[right] >= max) {
                max = nums[right];
                maxindex = right;
            }
            
           
            result[resIndex] = max;
            resIndex++;
            
            left++;
            right++;
        }
        
        return result;
    }
}