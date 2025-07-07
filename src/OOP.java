class Pen{
    String color;
    String type;
    int price;

    public void write(){
        System.out.println("The pen is writing!!");
    }
    public void penColorAndType(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
    //Default Constructor and if u pass parameters and use them it becomes parameterised constructor
    Pen(){
    }
    //copy constructor
    Pen(Pen trimax){
        this.color = trimax.color;
        this.type  = trimax.type;
    }
    public void printInfo(String color){
        System.out.println(color);
    }
    public void printInfo(int price){
        System.out.println(price);
    }
    public void printInfo(String color , int price){
        System.out.println(color +" "+price);
    }
    //java doesnt need destructor since it already has a garbage collectors
}
//4 main concepts in OOPs
//ENCAPSULATION
//INHERITANCE
//POLYMORPHISM //function overloading(compile time) function overriding(runtime)
//ABSTRACTION

public class OOP {
    public static void main(String[] args){
        Pen trimax = new Pen();
        trimax.color="blue";
        trimax.type="gel";
        trimax.price = 50;
        Pen reynolds = new Pen();
        reynolds.color = "black";
        reynolds.type = "ballpoint";
        reynolds.printInfo(reynolds.color, reynolds.price);
        Pen hauser = new Pen(trimax);
        hauser.penColorAndType();
        hauser.write();
        Pen rorito = new Pen(reynolds);
        rorito.penColorAndType();
        rorito.write();

    }
}
