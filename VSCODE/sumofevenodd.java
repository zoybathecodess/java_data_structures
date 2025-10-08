import java.util.*;
public class sumofevenodd{
    public static void main(String[] args){
        
        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner scn=new Scanner(System.in);
        int choice; 
        int evensum=0;
        int oddsum=0;
        do { 
            System.out.println("enter a number: ");
            int num=scn.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;

            }
            System.out.println("press 1 to continue, press 0 to stop");
            choice=scn.nextInt();
        } while (choice==1);
        
        System.out.println("even sum is: "+evensum);
        System.out.println("odd sum is: "+oddsum);

    }
} 