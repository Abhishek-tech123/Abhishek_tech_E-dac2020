import java.util.Scanner;
class Swap
{
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number before swap:");
         int n1 = sc.nextInt();
         System.out.println("Enter a number before swap:");
         int n2 = sc.nextInt();
         System.out.println("==================================================");
         n1 = n1 + n2;
         n2 = n1 - n2;
         n1 = n1 - n2;
         System.out.println("value after swap n1:" +n1);  
         System.out.println("value after swap n2:" +n2); 
    }
}  