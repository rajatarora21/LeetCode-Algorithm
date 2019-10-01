class Solution {
    public int[] sortArrayByParity(int[] A) {
       
        int tempArr[]=new int[A.length];
         int count=0;
         for(int i=0;i<A.length;i++)
         {
             if(A[i]%2==0)
             {
                 tempArr[count]=A[i];
                 count++;
             }
             
         }
         for(int i=0;i<A.length;i++)
         {
             if(A[i]%2!=0)
             {
                 tempArr[count]=A[i];
                 count++;
             }
             
         }
         return tempArr;
    }
}