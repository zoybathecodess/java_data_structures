import java.util.*;
public class breakstatement {
    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
            
            while(true){
                System.out.println("enter number:");
                int number=scn.nextInt();
                if(number%10==0){
                    System.out.println("the number was a multiple of 10. Exiting the loop...");
                    break;
                }
                System.out.println(number);
            }
            
        }
    }
}
    

