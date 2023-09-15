import java.util.*;
public class SubsetRecur {
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int[] array= new int[x];
        for(int i=0;i<x;i++){
            array[i]=sc.nextInt();
        }

        int y=sc.nextInt();

        subset(array,0,y,0,"");

    }

    public static void subset(int[] array,int in,int target,int s,String answer){
        if(in==array.length){
            if(s==target){
                System.out.println(answer);
            }
            return;
        }
        subset(array,in+1,target,s,answer);
        subset(array,in+1,target,s+array[in],array[in]+" "+answer);

    }

}
