import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return name + "(" + age + ")";
    }
}
public class stream {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Sage",25));
        personList.add(new Person("Jett",21));
        personList.add(new Person("Cypher",40));
        personList.add(new Person("Brimstone",45));

        List<Person> youngAgents =  personList
                .stream()
                .filter(a -> a.getAge()<30)
                .toList();
        youngAgents.forEach(System.out::print);

        System.out.println();

        youngAgents.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::print);
        System.out.println();

            youngAgents.stream()
                    .map(a-> a.getName() +"-" + a.getAge()*2 + " ")
                    .forEach(System.out::print);



    }
}
