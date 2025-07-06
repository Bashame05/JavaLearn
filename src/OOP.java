class Pen{
    String color;
    String type;

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
}
//4 main concepts in OOPs
//ENCAPSULATION
//INHERITANCE
//POLYMORPHISM
//ABSTRACTION

public class OOP {
    public static void main(String[] args){
        Pen trimax = new Pen();
        trimax.color="blue";
        trimax.type="gel";
        Pen reynolds = new Pen();
        reynolds.color = "black";
        reynolds.type = "ballpoint";
        Pen hauser = new Pen(trimax);
        hauser.penColorAndType();
        hauser.write();
        Pen rorito = new Pen(reynolds);
        rorito.penColorAndType();
        rorito.write();


    }
}
