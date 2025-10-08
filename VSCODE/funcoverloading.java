public class funcoverloading {
    //function to calc sum of 2 nums
    public static int sum(int a, int b){
        return a+b;
    }

    //function to calc sum of 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(9,12));
        System.out.println(sum(34,12,66));
    }
    
}
