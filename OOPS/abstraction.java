/* Abstraction
 1. abstract keyword 
   -- class (can't create abstract class object) -- have both abstract and normal methods
   -- methods (only included in abstract class)
 2. interface
   --methode inside are by defalut public and abstract 
 
 Java does not have multiple inheritance so we use interfaces
 */

//Abstract keyword

//car is just a concept so we can make it abstract class. Its object will never be used so we reduced complexity
public class Main{
    public static void main(String[] args){
       Audi a= new Audi();
        a.start();
    }
}

class BMW extends car{
    @Override
    void start(){
        System.out.println("BMW is starting");
    }
    
}

class Audi extends car{
  @Override
    void start(){
        System.out.println("Audi is starting");
    }   
}



abstract class car{
    int price;
    abstract void start();
}



//Interface

public class Main{
    
public static void main(String[] args){
    Transformer t1 = new Transformer();
    t1.walk();
  }
}

class Transformer implements Person,Car{
    @Override
    public void walk(){
        System.out.println("Walking");
        
    }
    
    @Override
    public void start(){
       System.out.println("Starting");
    }
}

interface Person{
    void walk();
}
interface Car{
    void start();
}
