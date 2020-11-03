import java.util.Scanner;
class Day
{
       public static void main(String args[])
       {
          int m,week,year,day;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number of days:");
          m = sc.nextInt();
          year = m/365;
          m = m % 365;
          System.out.println("Number of years:" +year);

          week = m /7;
          m = m % 7;
          System.out.println("Number of weeks:" +week);
          
          day = m;
          System.out.println("Number of days:" +day);
       }
}  
          
          