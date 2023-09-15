import java.util.*;
class LastInd{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        LastIndex(arr,t,size-1);

    }
    public static void LastIndex(int []arr,int t,int c){
        if(c<0){

            System.out.print(-1);
            return;
        }
        if(arr[c]==t){

            System.out.print(c);
            return;
        }

        LastIndex(arr,t,c-1);
    }}
