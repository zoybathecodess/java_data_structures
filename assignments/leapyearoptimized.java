import java.util.*;
public class leapyearoptimized {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            System.out.println("enter the year");
            int year=scn.nextInt();
            boolean x=(year%4==0);
            boolean y=!(year%100==0);
            boolean z=(year%400==0);


            if(x&&(y||z)){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+"is not a leap year");
            }
        }
    }
}
