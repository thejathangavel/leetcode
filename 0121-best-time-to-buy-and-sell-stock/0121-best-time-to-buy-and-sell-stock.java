class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int curr=prices[i]-buy;
        if(curr>max){
            max=curr;
        }
        if(buy>prices[i]){
           buy=prices[i];
        }
    }
    return max;
}
}