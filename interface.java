import java.io.*;
import java.util.*;

interface Number
{
    int findSqr(int n);
}

class A implements Number
{
    int sqr=0;
    public int findSqr(int n)
    {
        sqr=n*n;
        return sqr;
    }
}

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Number obj;
        obj=new A();
        int n=sc.nextInt();
        
        System.out.println(obj.findSqr(n));
    }
}
