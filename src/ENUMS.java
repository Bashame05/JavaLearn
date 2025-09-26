
enum Status{
    Running , Failed , Pending , Success
}
enum Laptop{
    Mac(2000) , Dell(1299) , ThinkPadd(1800) , Lenovo;

    private int price;

    Laptop(){
        price = 900;
    }
    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class ENUMS {
    public static void main(String[] args) {
        //enum acts as a custom datatype in laymans terms
//        Status s = Status.Failed;
//        System.out.println(s);
//        //ordinal is to get the index of the constant that we created
//        System.out.println(s.ordinal());
//        //use values to get an array of all our constants
//        Status[] ss = Status.values();
//
//        for(Status x : ss){
//            System.out.println(x + " : " + x.ordinal());
//        }

        Status s = Status.Pending;
        //switch cases also support enums
        switch(s){
            case Running :
                System.out.println("all good");
                break;
            case Pending :
                System.out.println("please wait");
                break;
            case Failed :
                System.out.println("it failed");
                break;
            case Success :
                System.out.println("you're done");
                break;
            default:
                System.out.println("unknown status");
                break;
        }

        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
}
