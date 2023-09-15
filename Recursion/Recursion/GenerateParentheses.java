import java.util.*;
public class GenerateParentheses {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int nB = sc.nextInt();
        GenerateParentheses("",nB,0,0);
    }
    public static void GenerateParentheses(String a,int nB,int oB,int cB){
        if(oB==nB &&cB==nB){
            System.out.println(a);
            return;
        }
        if(cB<oB){
            GenerateParentheses(a+")",nB,oB,cB+1);
        }
        if(oB<nB){
            GenerateParentheses(a+"(",nB,oB+1,cB);
        }
    }
}