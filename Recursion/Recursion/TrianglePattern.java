import java.util.*;
public class TrianglePattern {
    public static void main(String args[]) {
        // for(int i=0;i<5;i++){
        // 	for(int j=0;j<=i;j++){
        // 		System.out.print("*		");
        // 	}
        // 	System.out.println();
        // }
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        TrianglePattern(0,0,x-2);
    }

    public static void TrianglePattern(int r,int c,int x){
        for(c=0;c<=r;c++){
            System.out.print("*"+"	");
        }
        System.out.println();
        if(r<=x){
            TrianglePattern(r+1,c,x);}
        return;
    }}
