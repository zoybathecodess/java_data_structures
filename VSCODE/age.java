import java.util.*;
public class age {

    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            int age=scn.nextInt();
            if(age>60){
                System.out.println("senior citizen");
            }
            else if(age>=13 && age<18){
                System.out.println("teenager");
            }
            else if(age>=18){
                System.out.println("adult");
            }
            else{
                System.out.println("infant");
            }
                
            
        }
    }
    
}
