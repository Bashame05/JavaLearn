import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class hashing {
    public static void main(String[] args){
        //creating a HashMap
        HashMap<String,String> hashira = new HashMap<>();

        //insertion into a hashmap
        hashira.put("Shinobu","Insect Hashira");
        hashira.put("Sanemi","Wind Hashira");
        hashira.put("Mitsuri","Love Hashira");
        hashira.put("Giyu","Water Hashira");
        hashira.put("Obanai","Snake Hashira");

        //searching in a hashmap
        System.out.println(hashira.get("Shinobu"));
        System.out.println(hashira.containsKey("Mitsuri"));
        System.out.println(hashira.containsValue("Insect Hashira"));

        //iterating through a hashmap
        //for(Map.entry<keytype,valuetype> variable : hashmapName.entrySet())
        for(Map.Entry<String,String> e : hashira.entrySet()){
            System.out.print("["+e.getKey()+":"+e.getValue()+"] ");
        }
        System.out.println();
        //removing a key:value pair
        hashira.remove("Sanemi");
        System.out.print(hashira);

        //creating a hashSet
        HashSet<String> yonkos = new HashSet<>();

        //insertion
        yonkos.add("Luffy");
        yonkos.add("Shanks");
        yonkos.add("WhiteBeard");
        yonkos.add("Kaido");
        yonkos.add("BlackBeard");

        //printing
        System.out.println(yonkos);

        //searching
        System.out.println(yonkos.contains("Shanks"));

        //deletion
        yonkos.remove("BlackBeard");
        System.out.println(yonkos);

        //iteration through a set
        Iterator<String> it = yonkos.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
