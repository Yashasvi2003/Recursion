import java.util.*;
public class subsequences {

    public static void main(String args[]) {


        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            String s=sc.next();
            ArrayList <String> list=new ArrayList<>();
            list=Answer(s,"",list);
            list.sort(null);
            for(int j=1;j<list.size();j++){
                System.out.println(list.get(j));
            }

        }
        sc.close();
    }
    public static ArrayList <String> Answer(String q,String a,ArrayList <String> list) {
        if(q.length()==0){
            list.add(a);
            return list;
        }
        char y=q.charAt(0);
        String str=q.substring(1);

        Answer(str,a+y,list);
        Answer(str,a,list);
        return list;
    }
}