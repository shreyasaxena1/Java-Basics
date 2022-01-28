### Array List

import java.util.ArrayList;
import java.util.Collections;

public class Myclass{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volka");
        cars.add("Meuws");
        cars.add("Bradde");
        cars.add("Moaks");
        
        //Traverse
        for(String i : cars){
            System.out.print(i+" ");
        }
    
        cars.set(0,"Volvo"); //update value
        System.out.print(cars.get(0)+" "); //get by index
        
        cars.remove(0); //delete element
        System.out.print(cars.get(0));
        
        System.out.print("\n");
        Collections.sort(cars); //sorting of elements
        for(String i : cars){
            System.out.print(i+" ");
        }
        
         cars.clear(); //Remove all elements
        System.out.print(cars.size());
    }
}


