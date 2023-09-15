import java.util.*;
public class MoveAll {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        MoveAll(s,"","",0);
    }
    public static void MoveAll(String s,String a1,String a2,int i){
        if(i==s.length()){
            System.out.print(a1+a2);
            return;
        }
        if(s.charAt(i)!='x'){
            MoveAll(s,a1+s.charAt(i),a2,i+1);}
        else{
            MoveAll(s,a1,a2+"x",i+1);}
        return;
    }
}
