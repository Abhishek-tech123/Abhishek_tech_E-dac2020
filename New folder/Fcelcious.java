import java.util.Scanner;
class Fcelcious
{
     public static void main(String args[])
     {
        double celcious,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp.in fahrenheit");
        f = sc.nextDouble();
        celcious = 5*(f-32)/9;
        System.out.print("temp in celcious:" +celcious);
     }
}