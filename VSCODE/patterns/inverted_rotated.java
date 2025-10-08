public class inverted_rotated {

    public static void pyramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 

            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(200);
    }
}
