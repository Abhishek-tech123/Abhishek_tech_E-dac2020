class Test3
{
	
	public static void main(String[] args) 
	{
        	int avg=0;
		int a[] = {5,14,35,89,140};
                int n = a.length;
                //int c[] = new int[n];
		int sum=0;
		for (int i = 0; i + 1 <=n; i++)  
        	{ 
            
            		sum = a[i] + a[i + 1] + a[i+2]; 
			sum =sum/3;
            		System.out.print(sum + " "); 
        	} 
                
                
	}
}


