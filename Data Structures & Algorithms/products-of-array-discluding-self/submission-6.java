class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multiple=1;
        int multiplezero=1;
        int countzero=0;
        boolean checkzero=true;
        for(int i=0;i<nums.length;i++){
            multiple*=nums[i];
            if(nums[i]!=0){
                checkzero=false;
                multiplezero*=nums[i];
            }else{
                countzero++;
            }
            
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(countzero<2){
                 if(nums[i]!=0){
                res[i]=multiple/nums[i];
            }
            else{if(countzero==nums.length){
               res[i]=0; 
            }else{
                res[i]=multiplezero;
            }
                
            }
            }else{
                res[i]=0;
            }
           
        }
        return res;
    }
}  
