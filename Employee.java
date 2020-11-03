import java.util.Scanner;
class Employee
{
    public static void main(String args[])
    {
       float hra,da,gs;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your salary :");
       float basic = sc.nextFloat();

       if(basic<10000)
       { 
            hra=basic*10/100;
            da=basic*90/100;
       }
       else
       {
            hra=2000;
            da=basic*98/100;
       }
         
        gs=basic+hra+da;
        System.out.println("HRA :" +hra);
        System.out.println("DA :" +da);
        System.out.println("GS :" +gs);
    }
}




       