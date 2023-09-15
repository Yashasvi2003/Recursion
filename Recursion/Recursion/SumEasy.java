import java.util.*;
public class SumEasy {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=0;i<c;i++){
            int s=sc.nextInt();
            int []arr=new int[s];
            for(int j=0;j<s;j++){
                arr[j]=sc.nextInt();
            }
            ArrayList<Integer> list=new ArrayList<>();
            list=Easy(arr,0,0,list);
            int l=0;
            for(int k=0;k<list.size()-1;k++){
                if(list.get(k)==1){
                    l=1;
                    System.out.println("Yes");
                    break;
                }
            }
            if(l!=1){
                System.out.println("No");
            }

        }


    }

    public static ArrayList<Integer> Easy(int []q,int in,int sum,ArrayList<Integer> list) {
        if(in==q.length){
            if(sum==0){
                list.add(1);
                return list;
            }
            else {
                list.add(0);
                return list;
            }
        }

        Easy(q, in+1, sum+q[in], list);
        Easy(q,in+1,sum,list);
        return list;
    }
}
