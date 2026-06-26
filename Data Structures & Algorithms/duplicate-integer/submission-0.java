class Solution {
    public boolean hasDuplicate(int[] nums) {
        int temp;
        for(int x=0;x<nums.length-1;x++){
            temp=nums[x];
            for(int j=x+1;j<nums.length;j++){
                if(nums[j]==temp){
                    return true;
                }
            }
        }
        return false;
    }
}