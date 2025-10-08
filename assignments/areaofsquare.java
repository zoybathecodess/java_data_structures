import java.util.*;
public class areaofsquare {
    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
                float side = scn.nextFloat();
                float area = side*side;
                System.out.println("area:"+area);
        }
    }
    
}
