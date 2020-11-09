public class StringEx
{
	public static void main(String args[])
	{
		String s1="java";
		char ch[]={'A','b','c','d','e'};
		String s2=new String(ch);
		String s3=new String("fghijk");
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      		String helloString = new String(helloArray);  
		System.out.println( helloString );
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}