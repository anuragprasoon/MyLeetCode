class Solution {
    public int pivotIndex(int[] nums) {
        int[] sl= new int[nums.length];
        int[] sr=new int[nums.length];
        int sleft=0;
        int sright=0;
        int i=0;
        int j=nums.length-1;
        while(i<nums.length){
            sleft+=nums[i];
            sright+=nums[j];
            sl[i]=sleft;
            sr[j]=sright;
            i++;
            j--;
        }
        for(int n=0;n<sl.length; n++){
            if(sl[n]==sr[n]){
                return n;
            }
        }
        return -1;
    }
}