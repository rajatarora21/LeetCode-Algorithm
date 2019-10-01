class Solution {
    public int numJewelsInStones(String J, String S) {
        
        char[] jArr=J.toCharArray();
        char[] sArr=S.toCharArray();
        int temp=0;
        for(int i=0;i<jArr.length;i++)
        {
            for(int j=0;j<sArr.length;j++)
            {
                if(jArr[i]==sArr[j])
                {
                    temp++;
                }
                
            }
        }
        return temp;
        
    }
}