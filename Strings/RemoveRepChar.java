public class RemoveRepChar 
{
	static char ch;
	public static void main(String[] args) 
	{
		String str="aabbbbccc";
		char[] charArray = str.toCharArray();
		int count=0;
		for(int i=0;i<charArray.length;i++)
		{
           		 if(i!=0 )
			{
            			if(charArray[i]==ch)continue;        //ddddee
            			if(charArray[i]==charArray[i-1]) 
				{
                		count++;
                		if(count==1)
				{
                    			System.out.println(charArray[i]);
                   			count=0;
                   			ch=charArray[i];
                		}   
           		 }
            		else
			{
                		count=0;//aabb

           		 }
           	 }


        }

    }

}
