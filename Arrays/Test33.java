import java.util.Scanner;
class Test33
{
	
	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);
        	System.out.println("Please enter limit up to you want series");
        	int num =input.nextInt();
        	int arr[]=new int[num];
		int c=1;
        	for(int i=0;i<num;i++)
        	{
            		if(c%2==0)
            		{
                		arr[i]=c*c;
				c++;
           		}
			else 
			{
                		arr[i] = c*c*c;
				c++;
            		}

        	}

        	for(int i:arr)
        	{
            		System.out.print(i+" ");
        	}
                
	}
}