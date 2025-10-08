import java.util.*;
public class bill {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
                float pencil=scn.nextFloat();
                float eraser = scn.nextFloat();
                float pen=scn.nextFloat();
                float sum=pencil+eraser+pen;
                float gst=(18/100)*sum;
                float total = gst+sum;
                System.out.println("total amount:"+total);
                
        }
    }
    
}
