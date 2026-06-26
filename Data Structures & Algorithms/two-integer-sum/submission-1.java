class Solution {
    public int[] twoSum(int[] nums, int target) {
      Hashtable<Integer,Integer> num=new Hashtable<>();
      int complement;
      for(int x=0;x<nums.length;x++){
        num.put(nums[x],x);
      }  
      for(int x=0;x<nums.length;x++){
        complement=target-nums[x];
        if(num.containsKey(complement)==true){
            if(num.get(complement)!=x){
                return new int[]{x,num.get(complement)};
            }
        }
      }
      return new int[] {0,0};
    }
}
