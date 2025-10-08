
import java.util.Scanner;

public class dectobin {
    public static void decTobin(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=(int)(bin+(rem*(Math.pow(10, pow))));
            pow++;
            n=n/2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        decTobin(n);
        scn.close();
    }
   
    
}
