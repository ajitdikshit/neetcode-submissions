class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target;
        List<List<Integer>> res=new ArrayList<>();
        int left=0;
        for(int x=0;x<nums.length-2;x++){
            int right=nums.length-1;
            left=x+1;
            target=-nums[x];
            while(left<right){
                if(nums[left]+nums[right]==target){
                    if(!res.contains(Arrays.asList(nums[x],nums[left],nums[right])))
                    res.add(Arrays.asList(nums[x],nums[left],nums[right]));
                    
                    left++;
                    }
                    else{
                        if(nums[left]+nums[right]<target){
                            left++;
                        }else{
                            right--;
                        }
                    }
            }
        }
        return res;
    }
}
