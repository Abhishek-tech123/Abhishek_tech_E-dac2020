import java.util.Scanner;
class Circle1
{
    public static void main(String args[])
    {
       double area;
       double c;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a radius");
       int r = sc.nextInt();
       area = 2*3.14*r*r;
       c=2*3.14*r;
       System.out.println("Area: " +area);
       System.out.println("Circumference: " +c);

   }
}