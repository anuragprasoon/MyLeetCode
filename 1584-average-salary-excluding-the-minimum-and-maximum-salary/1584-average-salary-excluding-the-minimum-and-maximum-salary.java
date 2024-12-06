class Solution {
    public double average(int[] salary) {
        double min=salary[0];
        double max=salary[0];
        double sum=0;
        for(int i: salary){
            if(max<=i){
                max=i;
            }
            if(min>i){
                min=i;
            } 
            sum+=i;
        }
        return (sum-(max+min))/(salary.length-2);
        
    }
}