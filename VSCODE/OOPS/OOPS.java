public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
        BankAccount myacc = new BankAccount();
        myacc.username = "ZoybaParihan";
        //myacc.password = "123"; //error

        Student  s1 = new Student("Zoyba");
        System.out.println(s1.name);

    } 
}
class Pen{
    private String color;
    private int tip;
    //getters and setters
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

}
class BankAccount {
    public String username;
    private String password;
}

class Student{
    String name;
    int roll;
    Student(String name){ //constructor
        this.name = name;
    }
}