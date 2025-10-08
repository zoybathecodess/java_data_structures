
import java.util.*;

public class functions {
    public static int printHello(){
        System.out.println("hello");
        return 1;
    }

    public static int sum(int a,int b)//parameters or actual parameters
    {
        int sum=a+b;
        return sum;
    }
    public static int prod(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        // printHello();
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        // int sum=sum(x,y); //arguments or actual parameters
        // System.out.println(sum);
        int prod=prod(x,y);
        System.out.println(prod);
    }

    
}
