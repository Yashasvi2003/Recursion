import java.util.Scanner;
public class StringMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iN = sc.nextLine();
        sc.close();

        MappedString(iN, "");
    }

    public static char getLetter(String n) {
        return (char) (Integer.parseInt(n) + 'A' - 1);
    }

    public static void MappedString(String num, String out) {
        if (num.length() == 0) {
            System.out.println(out);
            return;
        }

        String sD = num.substring(0, 1);
        String rN = num.substring(1);

        MappedString(rN, out + getLetter(sD));

        if (num.length() >= 2) {
            String dD = num.substring(0, 2);
            if (Integer.parseInt(dD) <= 26) {
                rN = num.substring(2);
                MappedString(rN, out+ getLetter(dD));}
        }}}

