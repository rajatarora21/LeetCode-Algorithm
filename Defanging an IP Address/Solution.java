class Solution {
    public String defangIPaddr(String address) 
    {
            char[] arr=address.toCharArray();
		    String temp="";
		    for(int i=0;i<arr.length;i++)
		    {
			    if(arr[i]=='.')
			    {
				    temp=temp+"[.]";
				    continue;
			    }
			    temp=temp+arr[i];
		    }
        return temp;
    }
}