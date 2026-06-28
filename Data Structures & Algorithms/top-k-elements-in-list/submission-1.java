class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> table=new HashMap<>();
        int arr[]=new int[k];
        int x=0;
        int maxnum=0;
        for(int a=0;a<nums.length;a++){
            table.put(nums[a],table.getOrDefault(nums[a],0)+1);
        }
        for(int y=0;y<k;y++){
            int max=0;
            maxnum=0;
            for(x=0;x<nums.length;x++){
                if(table.getOrDefault(nums[x],0)>max){
                    max=table.get(nums[x]);
                      maxnum=nums[x];
                }
            }table.remove(maxnum);  
            
            arr[y]=maxnum;
        }
    return arr;
    }
}
