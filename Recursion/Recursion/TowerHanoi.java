import java.util.*;
public class TowerHanoi
{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int disk= sc.nextInt();
        System.out.println(TowersofHanoi(disk,"T1","T3","T2")-1);

    }

    public static int TowersofHanoi (int disk , String s , String h , String d) {
        if (disk==0){
            return 1;
        }
        int c=TowersofHanoi(disk-1,s,d,h);
        System.out.println("Move "+disk+"th disc from "+s+" to "+d);
        int c1=TowersofHanoi(disk-1,h,s,d);
        return c+c1;
    }}
