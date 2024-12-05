class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(i+1<arr.length && i+2<arr.length){
            if(arr[i]-arr[i+1]!=arr[i+1]-arr[i+2]){
                return false;
            }
            }

        }
        return true;
    }
}