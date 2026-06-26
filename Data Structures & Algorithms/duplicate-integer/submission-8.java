class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> num=new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(nums[i])==false){
                num.put(nums[i],1);
            }else{
                return true;
            }
        }
        return false;
    }
}