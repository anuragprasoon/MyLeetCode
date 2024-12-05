class Solution {
    public int romanToInt(String s) {
        char[] t=s.toCharArray();
        int[] sum= new int[t.length];
        int num=0;
        int curval=0;
        int preval=0;
        for(int i=t.length-1;i>=0;i--){
            int n=0;
            if(t[i]=='I'){
                n=1;
            }
            if(t[i]=='V'){
                n=5;
            }
            if(t[i]=='X'){
                n=10;
            }
            if(t[i]=='L'){
                n=50;
            }
            if(t[i]=='C'){
                n=100;
            }
            if(t[i]=='D'){
                n=500;
            }
            if(t[i]=='M'){
                n=1000;
            }
            sum[i]=n;
        }
    for(int i=sum.length-1;i>=0;i--){
            curval=sum[i];
            if(curval<preval){
                num-=curval;
            }else{
                num+=curval;
            }
            preval=curval;

    }
    return num;
    
    }
}