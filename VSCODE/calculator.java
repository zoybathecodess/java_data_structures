import java.util.*;
public class calculator {
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            float num1=scn.nextFloat();
            float num2=scn.nextFloat();
            char op=scn.next().charAt(0);
            switch(op){
                case '+':
                    System.out.println(num1+num2);
                    break;
                
                case '-':
                    System.out.println(num1-num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '%':
                    System.out.println(num1%num2);
                    break;

                case '/':
                    System.out.println(num1/num2);
                    break;

                default:
                    System.out.println("invalid operator");
            }
        }
    }
    
}
