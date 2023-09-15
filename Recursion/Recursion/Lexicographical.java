import java.util.*;
public class Lexicographical {
    public static void main(String args[]) {
        ArrayList <String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        list=Output(0,list,t);
        list.sort(null);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }


    public static ArrayList <String> Output(int c,ArrayList <String> list,int t) {
        if(c==t+1){
            return list;
        }

        list.add(Integer.toString(c));
        Output(c+1, list, t);
        return list;
    }
}
