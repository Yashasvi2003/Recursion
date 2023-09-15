import java.util.*;
public class Duplicate {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Duplicate(s.substring(1),""+s.charAt(0),0);
    }
    public static void Duplicate(String q,String a,int i) {
        if(i>=q.length()){
            System.out.println(a);
            return;
        }
        if(a.charAt(a.length()-1)==q.charAt(i)){
            Duplicate(q, a+"*"+q.charAt(i), i+1);}
        else{
            Duplicate(q, a+q.charAt(i), i+1);}
    }
}
