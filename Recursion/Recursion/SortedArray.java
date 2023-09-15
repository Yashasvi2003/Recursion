import java.util.*;
public class SortedArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sizearray=sc.nextInt();
        int []quesarray=new int[sizearray];
        for(int p=0;p<sizearray;p++)
        {
            quesarray[p]=sc.nextInt();
        }
        System.out.println(isSorted(quesarray,0));
        sc.close();
    }
    public static Boolean isSorted(int[]quesarray, int p){
        if(quesarray[p]>quesarray[p+1]){
            return false;
        }
        boolean x=true;
        if(p<quesarray.length-2){
            x=isSorted(quesarray,p+1);
        }
        return x;
    }
}
