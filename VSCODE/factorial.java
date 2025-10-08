
import java.util.Scanner;

public class factorial{
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
           
        }
        return f;
    }

    //calculate binomial coefficient

    public static int binomial(int n,int r){
        //bc=n!/(r!)(n-r)!
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int res=a/(b*c);
        return res;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        // int fac=fact(num);
        // System.out.println(fac);
        int bc=binomial(num1,num2);
        System.out.println(bc);
    }



}