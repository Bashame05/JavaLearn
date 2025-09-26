
interface A{
    //var in interfaces are final and static
    int age = 31;
    String name = "shweta";

    void show();
    void config();
}
//if a class implements two interfaces you need to instantiate both of them when you create an object for that class
class B implements A{
    public void show() {
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}


public class INTERFACES {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.name);
    }
}
