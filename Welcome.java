import java.util.*;
class Welcome
{
       public static void main(String args[])
       {
	Scanner s = new Scanner(System.in);
	System.out.print("your name: ");
	String str = s.next();
	System.out.println("Welcome "+str);
       }
}