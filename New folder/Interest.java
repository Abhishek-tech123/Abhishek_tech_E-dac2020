import java.util.Scanner;
class Interest
{
     public static void main(String args[])
     {
         int si;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a amount:");
         int p = sc.nextInt();
         System.out.println("Enter rate of interest:");
         int r = sc.nextInt();
         System.out.println("Enter a no of years:");
         int n = sc.nextInt();
         si = p*n*r/100;
         System.out.println(si);
      }
}
       