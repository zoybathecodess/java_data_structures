
import java.util.Scanner;

public class isevenfunc{
    public static boolean isEven(int n){
        if(n%2==0){
            // System.out.println("the number is even");
            return true;
        }
        else{
            return false;
        }
    }   
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        if (isEven(num)) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
       
    }
}