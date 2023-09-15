import java.util.*;
public class AllIndices {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t =sc.nextInt();
        AllIndex(arr,0,"",t);
    }
    public static void AllIndex(int []arr,int i,String an,int t){
        if(i==arr.length){
            System.out.print(an);
            return;

        }
        if(arr[i]==t){
            AllIndex(arr,i+1,an+i+" ",t);}
        else{
            AllIndex(arr,i+1,an,t);}
    }}