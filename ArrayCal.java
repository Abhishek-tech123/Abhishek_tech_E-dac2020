import java.util.Scanner;
class ArrayCal
{
	public static void main(String[] args)
	{
    		int[] array = {10, 20, 30, 40, 50, 60,70,80,90,100};
      		int sum = 0,avg=0;
           	for( int num : array) 
		{
          		sum = sum+num;
			avg =sum/num;
      		}
      		System.out.println("Sum of array elements is:"+sum);
      		System.out.println("Average of array elments is:"+avg);
	}
}