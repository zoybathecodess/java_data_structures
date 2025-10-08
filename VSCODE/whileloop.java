import java.util.*;
public class whileloop {
    public static void main(String [] args){
        int counter=0; //initialise
        while(counter<5){
            System.out.println("Hello World");
            counter++;
        }

        //sum of first n numbers
        try(Scanner scn=new Scanner(System.in)){
            int range=scn.nextInt();
            int sum=0;
            int i=1;
            while(i<=range){
                sum+=i;
                i++;
            }
            System.out.println("sum:"+sum);

        }

    }
    
}
