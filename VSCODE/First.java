import java.util.*;
public class First {
    public static void main(String args[]) {
        System.out.println("hello world");
        int a=10;
        System.out.println(a);
        String name="tony stark";
        System.out.println(name);

        //input
        try(Scanner scn = new Scanner(System.in)){
            String input= scn.next();
            System.out.println("input " +input);
        }
        

//         //input including space
//         String space = scn.nextLine();
//         System.out.print("input with space "+space);

//         //input integer 
//         int number=scn.nextInt();
//         System.out.println("integer value "+number);

//         //input float 
//         float f=scn.nextFloat();
//         System.out.println("float value "+f);

//         //input boolean
//         boolean bool=scn.nextBoolean();
//         System.out.println("boolean value "+bool);

//         //input double 
//         double num=scn.nextDouble();
//         System.out.println("double float value "+num);

//         //input long 
//         long lng=scn.nextLong();
//         System.out.println("long int value "+lng);

//         //input short 
//         short srt=scn.nextShort();
//         System.out.println("short int value "+srt);

//         //input byte 
//         byte bite=scn.nextByte();
//         System.out.println("byte value "+bite);

//     
    }
}
