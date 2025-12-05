class Box<T>{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


public class Generics {
    public static void main(String[] args){
        Box<String> box = new Box<>();

        box.setItem("Yamada");

        System.out.println(box.getItem());
    }
}
