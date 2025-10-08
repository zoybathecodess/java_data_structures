import java.util.*;
public class prime {
    public static void main(String[] args){
        try(Scanner scn= new Scanner(System.in)){
            float num=scn.nextFloat();
            if(num%2==0){
                if(num==2){
                    System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                    }
                }
            else {
                System.out.println("prime");
            }
                
           
        }
    }
    
}
