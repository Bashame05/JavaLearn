class Agents{
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
}

public class Encaps {
    public static void main(String[] args) {
        System.out.println("I hate Valorant");

        Agents agent1 = new Agents();
        agent1.setName("Jett");
        agent1.setType("Duelist");

        Agents agent2 = new Agents();
        agent2.setName("Fade");
        agent2.setType("Initiator");


        System.out.println(agent1.getName()+":"+ agent1.getType());
        System.out.println(agent2.getName()+":"+ agent2.getType());

    }
}
