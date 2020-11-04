import java.util.Scanner;
class Series
{
	public static void main(String[] args)
	{
    		int n;
    		int sum=0;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the n i.e. max values of series: ");
    		n=sc.nextInt();
    		sum = (n * (n + 1) * (2 * n + 1 )) / 6;
    		System.out.println("Sum of the series : ");
    		for (int i =1;i<=n;i++) 
		{
			if(i!=n)
			{
			
    				System.out.print(i+"^2 +");
			}
			else
			{
				System.out.print(i+"^2 "+"= "+sum);
			}
    		}
    
	}
}