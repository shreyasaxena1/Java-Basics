//Hashset
import java.util.Set;
import java.util.HashSet;

public class Myclass{
    public static void main(String[] args){
     Set<Integer> s= new HashSet<>();
     
     s.add(12);
     s.add(23);
     s.add(22);
     s.add(22); //avoid duplicates
     s.add(4);
     
     System.out.print(s);
     
     s.remove(12);
     System.out.print(s.isEmpty());
     System.out.print(s.contains(12));
     System.out.print(s.clear());
      

    }
}

//Linked hashset

Set<Integer> s= new LinkedHashSet<>(); //maintain order

//Treeset
Set<Integer> s= new TreeSet<>(); //Sorted form - BST - O(LOGN)
