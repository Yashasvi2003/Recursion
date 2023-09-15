import java.util.*;
public class Ascii {
    static void Count(String s, String r, int j)
    {
        if (j == s.length())
        {
            if (r.length() > 0)
            {
                System.out.print(r + " ");
            }
            return;
        }
        char ch = s.charAt(j);
        Count(s, r, j + 1);
        Count(s, r + ch, j + 1);
        Count(s, r + (int)ch, j + 1);
        ;
    }
    static int temp=1;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String r = "";
        int N = s.length();
        System.out.print(" ");
        Count(s, r, 0);
        Ascii(s, r, 0);
        System.out.print("\n"+temp);
    }
    static void Ascii(String s, String r,int j)
    {
        if (j == s.length())
        {
            if (r.length() > 0)
            {
                temp++;
            }
            return;
        }
        char ch = s.charAt(j);
        Ascii(s, r, j + 1);
        Ascii(s, r + ch, j + 1);
        Ascii(s, r + (int)ch, j + 1);
    }
}
