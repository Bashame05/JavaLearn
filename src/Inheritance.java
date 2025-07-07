//inheritance enhances readability
//baseclass -> child class
//4 types single level || multilevel
class Yonko{
    String haki;
    public  void printHaki(){
        System.out.println(haki);
    }
}
class Pirate extends Yonko{
    String crew;
    public void printCrew(){
        System.out.println(crew+" "+haki);
    }
}
class Ship extends Pirate{
    String name;
    public void printOwner(){
        System.out.println("The crew on this ship is "+crew+" and its captain has "+haki+" and its name is "+name);
    }
}
class navigator extends Pirate{
    String navname;
    public void printnav(){
        System.out.println(navname+" is a part of the crew"+crew+" and navigates their ship ");
    }
}

public class Inheritance {
    public static void main(String[] args){
     Pirate shanks = new Pirate();
     shanks.haki="Color of the Supreme King";
     shanks.crew="Red Hair Pirates";
     shanks.printHaki();
     shanks.printCrew();
     Ship luffy = new Ship();
     luffy.crew="Straw Hat Pirates";
     luffy.name="Going Merry";
     luffy.haki="Armament,Observation and Conquerors Haki";
     luffy.printOwner();
     navigator nav = new navigator();
     nav.crew = "Straw Hats";
     nav.navname="Robin";
     nav.printnav();
    }
}
