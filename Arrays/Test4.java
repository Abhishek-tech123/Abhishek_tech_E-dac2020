import java.util.Scanner;
class Test4
{
	
	public static void main(String[] args) 
	{	
		int i;
		int n,b=1,d=1;
        	Scanner sc= new Scanner(System.in);
        	n=sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		i=0;
		while ((b == 1 || d == 1) && i < n - 1)
		{
			if(a[i] < a[i+1])
				d=0;
			else if (a[i] > a[i+1])
				b=0;
			i++;
		}
		if(b==1)
		{
			System.out.println("Array is sorted in ascending order");
		}
		else if(d==1)
		{
			System.out.println("Array is sorted in descending order");
		}
		else
		{
			System.out.println("Array is in random order");
		}
                
	}
}