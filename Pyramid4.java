
import java.util.Scanner;
class Pyramid4
{
	public static void main(String[] args)
	{
		
		int number;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows:");
		number=s.nextInt();
		int space=number;
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			space--;
			for(int k=1;k<=i;k++)
			{	
				System.out.print(" "+k);
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(" "+l);
			}
			System.out.println();	
		}
		
	}
}


