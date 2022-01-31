public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Shreya",21);
        Developer d1 = new Developer("Aryan",22);
        d1.walk(); //first check in developer class, if not found then person class(super class)
        d1.walk(5);//not found in developer class -- movve to person class
    }
}


class Person{
    String name;
    int age;
    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    void walk(){
        System.out.println(name+" is walking");
    }
    void walk(int steps){
        System.out.println(name+" is walking "+steps+" steps.");
    }
}

class Developer extends Person{
    public Developer(String name,int age){
        super(name,age);
    }
    
     void walk(){ 
        System.out.println("Developer "+name+" is walking");
    }
}
