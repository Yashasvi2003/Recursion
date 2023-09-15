import java.util.*;
public class StringToInteger {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();

        System.out.println(Convert(st,0));
        sc.close();
    }
    public static int Convert(String q,int add) {
        if(q.length()==0){
            return add;
        }
        String s1=q.substring(0, 1);
        int x=Integer.parseInt(s1);
        add=add*10+x;
        add=Convert(q.substring(1),add);
        return add;
    }}
