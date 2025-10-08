public class nestedloop {
    public static void main(String[] args){
        for(int line=1; line<=4; line++){
            for(int star=1;star<=line;star++){
                    System.out.print("*");
            }
            System.out.println();
        }

        for(int line=1;line<=4;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();
        
        char ch='A';
        for(int line=1;line<=5;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
