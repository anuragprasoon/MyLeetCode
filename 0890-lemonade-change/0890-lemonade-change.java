class Solution {
    public boolean lemonadeChange(int[] bills) {
        int coin=0;
        int cash=0;
        for(int i:bills){
            if(i==5){
                coin++;
            }
            if(i==10){
                if(coin==0) return false;
                coin--;
                cash++;
            }else if(i==20){
                if(cash!=0 && coin>0){
                    cash--;
                    coin--;

                }else if(coin>2){
                    coin-=3;
                }else{
                    return false;
                }
            }

        }
        
        return true;
    }
}