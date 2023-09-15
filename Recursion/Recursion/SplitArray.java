import java.util.*;
class SplitArray {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int array[]=new int [size];
        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        int count=SplitArray(array,0,0,0,"","");
        int c=9;
        System.out.println(count);
    }
    public static int SplitArray(int array[],int id,int check,int check2,String col,String a){
        if (id==array.length && check==check2){
            int x=0;
            char y='p';
            String srr="s";
            System.out.print(col+"and ");
            System.out.println(a);
            return 1;
        }
        if(id>=array.length){
            return 0;
        }
        int c1=SplitArray(array,id+1,check+array[id],check2,col+array[id]+" ",a);
        int c2=SplitArray(array,id+1,check,check2+array[id],col,a+array[id]+" ");
        return c1+c2;

    }
}
