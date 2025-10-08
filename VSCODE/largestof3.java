import java.util.*;
public class largestof3 {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            float num1=scn.nextFloat();
            float num2=scn.nextFloat();
            float num3=scn.nextFloat();
            if(num1>num2&& num1>num3){
                System.out.println("num1 is the largest");
            }
            else if(num3>num2){
                System.out.println("num3 is the largest");
            }
            else{
                System.out.println("num2 is the largest");
            }    
        }
    }
    
}
