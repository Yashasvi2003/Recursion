import java.util.Scanner;
public class Replacement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < x; i++) {
            String st = sc.nextLine();
            String res = ReplacePi(st);
            System.out.println(res);
        }
    }

    public static String ReplacePi(String st) {
        if (st.length() <= 1) {
            return st;
        }

        if (st.substring(0, 2).equals("pi")) {
            return "3.14" + ReplacePi(st.substring(2));}

        return st.charAt(0) + ReplacePi(st.substring(1));
    }}
