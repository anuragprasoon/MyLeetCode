class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int h=height[i]<height[j]?height[i]:height[j];
            if(max<(j-i)*h){
                max=(j-i)*h;
            }
            if(height[j]<height[i]){
                j--;
            }else{
                i++;
            }
        }
        return max;      
    }
}