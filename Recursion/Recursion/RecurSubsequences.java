import java.util.*;
public class RecurSubsequences{
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
        ArrayList <String> lis=new ArrayList<>();
        String str=sc.next();
        lis=Answer(str,"",lis);
        for(int i=lis.size()-1;i>=0;i--){
            System.out.print(lis.get(i)+" ");
        }
        System.out.println();
        System.out.println(lis.size());

    }
    public static ArrayList<String> Answer(String q,String answer,ArrayList <String> lis){
        if(q.length()==0){
            lis.add(answer);
            return lis;
        }
        char x=q.charAt(0);
        String s=q.substring(1);
        Answer(s, answer+x,lis);
        Answer(s, answer,lis);
        return lis;
    }}
