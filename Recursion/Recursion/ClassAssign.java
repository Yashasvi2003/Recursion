import java.util.Scanner;
public class ClassAssign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int c = DistinctIntegers(x);
            System.out.println("#" + i + " : " + c);
        }
    }

    public static int DistinctIntegers(int x) {

        if (x == 1) {
            return 2;}
        if (x == 2) {
            return 3;}
        int cA = DistinctIntegers(x - 1);
        int cB = DistinctIntegers(x - 2);
        return cA+cB;
    }}
