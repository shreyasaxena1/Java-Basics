import java.util.Map;
import java.util.HashMap;

public class Myclass{
    public static void main(String[] args){
     Map<String,Integer> m = new HashMap<>();
     
     m.put("One",1);
     m.put("Two",2);
     m.put("Three",3);
     m.put("Four",4);
     
     m.putIfAbsent("One",3);
    
     System.out.print(m);
     
     for(Map.Entry<String,Integer> i: m.entrySet()){
         System.out.println(i.getKey());
         System.out.println(i.getValue());
     }
     
     for(String i : m.keySet()){
         System.out.println(i);
     }
     for(Integer i : m.values()){
         System.out.println(i);
     }
     
     System.out.print(m.containsKey("Three"));
     
     System.out.print(m.containsValue(3));
     
    }
}


Map<String,Integer> m = new TreeMap<>();


