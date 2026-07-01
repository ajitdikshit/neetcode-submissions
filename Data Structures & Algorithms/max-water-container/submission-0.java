class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;
        int curr;
            while(left<right){
                curr=(right-left)*Math.min(heights[left],heights[right]);
                if(heights[left]<=heights[right]){
                    left++;
                }else{
                    right--;
                }
                if(max<curr){
                    max=curr;
                }
            }
            return max;
    }
}
