import java.util.*;
public class product {
    public static void main(String args[]) {
        try(Scanner scn=new Scanner(System.in)){
        System.out.println("enter a and b:");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int prod=a*b;
        System.out.println("the product of a and b is:"+prod);
        }
       


    }
}
