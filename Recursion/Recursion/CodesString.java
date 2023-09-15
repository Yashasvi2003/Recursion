import java.util.*;
public class CodesString {
    public static void main(String args[]) {
        String []st={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        Scanner sc=new Scanner(System.in);
        String q=sc.next();
        ArrayList <String> lis=new ArrayList<>();
        lis=CodesOfString(q,"",st,lis);
        System.out.print(lis);
    }

    public static ArrayList <String> CodesOfString(String q,String a,String []st ,ArrayList <String> lis) {
        if(q.length()==0){
            lis.add(a);
            return lis;}
        for(int i=0;i<q.length();i++){
            String s2=q.substring(0, i+1);
            if(Integer.parseInt(s2)<27){
                String s3=st[Integer.parseInt(s2)];
                String s1=q.substring(i+1);

                CodesOfString(s1, a+s3,st,lis);}
        }
        return lis;
    }}
