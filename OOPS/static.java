//static -- use for prop of class -- independent of object -- access by class name

public class Main{
    public static void main(String[] args){
        Person p1 = new Person();      
        Person p2 = new Person();      
        Person p3 = new Person();      
        Person p4 = new Person();      
        Person p5 = new Person();  
        System.out.println(Person.count);
    }
}

class Person{
    String name;
    int age;
    static int count=0;
    
    public Person(){
        count++;
    }    
}
