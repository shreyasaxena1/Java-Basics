import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Myclass{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>(); //generic (datatype mentioned)
        cars.add("Volka");
        cars.add("Meuws");
        cars.add("Bradde");
        cars.add("Moaks");
        cars.add(3,"Shats"); //add by index
        
        //Traverse
        for(String i : cars){
            System.out.print(i+" ");
        }
        ArrayList<String> newList = new ArrayList<>();
        newList.add("metshob");
        newList.add("Frazae");
        
        cars.addAll(newList);
        
        for(String i : cars){
            System.out.print(i+" ");
        }
        cars.set(0,"Volvo"); //update value
        System.out.print(cars.get(0)+" "); //get by index
        
        cars.remove(0); //delete element
        System.out.print(cars.get(0));
        cars.remove("Shats"); //remove element
        //Integer.valueof() for int element
        
        
        System.out.print("\n");
        Collections.sort(cars); //sorting of elements
        for(String i : cars){
            System.out.print(i+" ");
        }
        
        Iterator<String> i = cars.iterator();
        
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        
        System.out.print(cars.contains("Moaks")); //check element present or not
        
        cars.clear(); //Remove all elements
        System.out.print(cars.size());
              
    }
}
