//小就买，大就卖。卖完之后，记得买

class Solution {
    public int maxProfit(int[] prices) {
        double low2=Double.POSITIVE_INFINITY;
        int low =(int)low2;
        int profit=0;
        for(int i:prices){
    
            if(i>low){
                int a=i-low;
                profit+=a;
                low=i;
            }
             else if(i<low){
                low = i;
            }
        }

        return profit;
    }
}
