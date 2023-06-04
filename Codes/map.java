import java.util.*;

public class map{
    public static void main(String...args) throws Exception{

        Map<String,String> m = new TreeMap();
        System.out.println(m.size());

        m.clear();
        m.put("ID","1");
        m.put("Ad","2");
        if (m.isEmpty() == false){
            System.out.println(m);
        }

        Map m2 = new HashMap();
        m2.putAll(m);
        if (m2.containsKey("ID")){
            System.out.println("id is there");
        }
        System.out.println(m2.get("ID"));

        Set s = m2.keySet();
        System.out.println(s);

        //
        System.out.println(m2.values());

        Set<Map.Entry> ss = m2.entrySet();

        for(Map.Entry me : ss){
            System.out.println(me.getKey()+" is "+me.getValue());
        }
    }
}
