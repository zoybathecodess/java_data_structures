public class primefunc {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println("true--number is prime. \nfalse-- number is composite.");
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));
        System.out.println(isPrime(2));
    }
    
}
