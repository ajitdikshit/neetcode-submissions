class Solution {
    public int trap(int[] height) {
        int left;
        
        int leftmax=height[0];
        
        int res=0;
        for(int x=1;x<height.length;x++){
            int rightmax=0;
            left=x;
            int right=height.length-1;
            while(right>left){
                if(rightmax<height[right]){
                    rightmax=height[right];
                }right--;
            }if(!(Math.min(rightmax,leftmax)<=height[x])){
                res+=Math.min(rightmax,leftmax)-height[x];
               
            }
            if(leftmax<height[left]){
                leftmax=height[left];
            }
        }
        return res;
    }
}
