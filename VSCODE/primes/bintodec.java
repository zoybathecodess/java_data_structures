public class bintodec {
    
    public static void binTodec(int binNum){
        int num=binNum;
        int pow=0;
        int dec=0;  
        while(binNum>0){
             int ld=binNum%10;
            dec=(int) (dec+(ld*Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+num+ "="+dec);
    }

    public static void main(String[] args) {
        binTodec(111);
    }
}
