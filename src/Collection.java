import java.util.*;

public class Collection {
    public static void main(String[] args){
        ArrayList<String> agents = new ArrayList<>();

        agents.add("Sage");
        agents.add("Fade");
        agents.add("Killjoy");
        agents.add("Jett");
        System.out.println(agents);

        String mainAgent = agents.get(0);
        System.out.println(mainAgent);

        agents.set(3,"Reyna");
        System.out.println(agents);

        agents.remove(3);
        System.out.println(agents);

        System.out.println(agents.size());

        Collections.sort(agents);
        System.out.println(agents);


        HashMap<String,String> archons = new HashMap<>();

        archons.put("Raiden Shogun","Inazuma");
        archons.put("Zhongli","Liyue");
        archons.put("Venti","Sumeru");
        archons.put("Furina","Fontaine");
        archons.put("Mavuika","Natlan");
        archons.put("Tsaritsa","Snehznaya");

        for(Map.Entry<String,String> e : archons.entrySet()){
            System.out.println(e.getKey()+" is the archon of "+e.getValue());
        }


        HashSet<String> nations = new HashSet<>();

        nations.add("Inazuma");
        nations.add("Fontaine");
        nations.add("Natlan");
        nations.add("Nod Krai");

        Iterator<String> it = nations.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }



    }
}
