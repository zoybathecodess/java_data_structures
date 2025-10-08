import java.util.*;
public class evenodd {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            System.out.println("enter a number:");
            int num=scn.nextInt();
            if(num%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
    }
    
}
