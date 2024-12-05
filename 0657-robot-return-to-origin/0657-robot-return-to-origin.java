class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char c: moves.toCharArray()){
            if(c=='U') x+=1;
            if(c=='D') x-=1;
            if(c=='R') y+=1;
            if(c=='L') y-=1;
        }
        if(x==0 && y==0 )return true;
        return false;
    }
}