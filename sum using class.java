import java.util.Scanner;

class add{
    static int a,b;
    add(int c,int d){
        a=c;
        b=d;
    }
    
    int add_2(){
        return a+b;
    }
}
public class calc{
       final static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
       int a=s.nextInt();
       int b=s.nextInt();
        add sum=new add(a,b);
        System.out.println(sum.add_2());
    }
}
