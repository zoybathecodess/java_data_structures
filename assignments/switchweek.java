import java.util.*;
public class switchweek {
    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
            System.out.println("enter the day number:");
            int day=scn.nextInt();
            switch(day){
                case 1: System.out.println("monday");
                break;

                case 2: System.out.println("tuesday");
                break;

                case 3: System.out.println("wednesday");
                break;

                case 4: System.out.println("thurday");
                break;

                case 5: System.out.println("friday");
                break;

                case 6: System.out.println("saturday");
                break;

                case 7: System.out.println("sunday");
                break;

                default:System.out.println("invalid number");

            }
        }
    }
    
}
