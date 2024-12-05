class Solution {
    public boolean isMonotonic(int[] nums) {
        int mi = 0;
        int md = 0;
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                mi=1;
            }
            if(nums[i]>nums[i+1]){
                md=1;
            }
        }
        if(mi==1 && md==1) return false;
        else if(mi==0 && md==1) return true;
        else if(mi==1 && md==0) return true;
        else return true;

    }
}