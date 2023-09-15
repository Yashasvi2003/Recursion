import java.util.*;
public class FirstInd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] array = new int[x];
        for(int i=0;i<x;i++){
            array[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int answer=FirstIndex(array,0,t);
        System.out.println(answer);
    }
    public static int FirstIndex(int[] array,int ind,int t){
        if(ind==array.length){
            return -1;
        }
        if(array[ind]==t){
            return ind;
        }
        return FirstIndex(array,ind+1,t);
    }}
