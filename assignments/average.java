import java.util.*;
public class average {
    public static void main(String[] args){
        try(Scanner scn=new Scanner (System.in)){
            float a=scn.nextFloat();
            float b=scn.nextFloat();
            float c=scn.nextFloat();
            float average=(a+b+c)/3;
            System.out.println(average);
        }
    }
    
    
}
