class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] n= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    n[0]=i;
                    n[1]=j;
                    return n;
                }
            }
        }
    return n;
    }
}