class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int[] temp=new int[3];
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                temp[0]=temp[0]+1;
            }
            else if(bills[i]==10)
            {
                if(temp[0]==0)
                    return false;
                temp[1]=temp[1]+1;
                temp[0]=temp[0]-1;
            }
            else if(bills[i]==20)
            {
                if(temp[0]==0)
                    return false;
                if(temp[1]==0)
                {
                    if(temp[0]<3)
                        return false;
                    temp[0]=temp[0]-3;
                    temp[2]=temp[2]+1;
                }
                else 
                {
                    temp[1]=temp[1]-1;
                    temp[0]=temp[0]-1;
                    temp[2]=temp[2]+1;
                }
                
            }
        }
        return true;
        
    }
}