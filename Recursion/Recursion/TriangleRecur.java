import java.util.*;
class TriangleRecur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        NthTriangle(0,x);
    }

    public static void NthTriangle(int c,int x)
    {
        if(x==0)
        {
            System.out.print(c);
            return;
        }
        NthTriangle(c+x,x-1);
    }}
