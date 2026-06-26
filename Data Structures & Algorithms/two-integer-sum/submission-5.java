class Solution {
    public int[] twoSum(int[] nums, int target) {
      Hashtable<Integer,Integer> num=new Hashtable<>();
      for(int i=0;i<nums.length;i++){
        if(num.containsKey(target-nums[i])){
            return new int[] {num.getOrDefault(target-nums[i],0),i};
        }else{
            num.put(nums[i],i);
        }
      }
      return new int[] {-1};
    }
}
