class Solution {
    public int maxProfit(int[] prices) 
    {
        int max=0;
        int min=0;
        int value=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<prices[min])
                min=i;
            if(prices[i]>prices[max])
                max=i;
            if(min>max)
                max=min;
            if(max>min&&prices[max]-prices[min]>value)
                value=prices[max]-prices[min];
        }
        return value;
    }
    
}
