
import java.util.*;

public class ternary {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            float marks=scn.nextFloat();
            String type=(marks>=33)?"pass":"fail";
            System.out.println(type);
        }
    }
    
}
