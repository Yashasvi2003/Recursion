import java.util.*;
public class KeypadNotes{
    public static void main(String[]args){
        String[] carr = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int chec= Keypad(carr,"",input);

        System.out.print("\n"+chec);

    }
    public static int Keypad(String[] carr,String Ans,String input){
        if(input.length()==0){
            System.out.print(Ans+" ");
            return 1;
        }
        char p = input.charAt(0);
        String str = carr[p-'0'];
        int chec = 0;
        for(int i=0;i<str.length();i++){

            chec+= Keypad(carr,Ans+str.charAt(i),input.substring(1));
        }
        return chec;
    }
}