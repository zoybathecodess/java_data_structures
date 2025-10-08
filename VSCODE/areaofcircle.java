import java.util.*;
public class areaofcircle {
    public static void main(String args[]) {
        try(Scanner scn=new Scanner(System.in)){
        System.out.println("enter radius of circle:");
        float radius=scn.nextFloat();
        float area=3.14f*radius*radius;
        System.out.println("the area of circle is:"+area);
        }
  
    }
}
