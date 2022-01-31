/*
this keyword
  1. When one constructor wants to call another constructor
  2. Refer class variable while assigning values
  
 */
  
public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Shreya",21);      
        p1.show();
        
    }
}

class Person{
    String name;
    int age;
    static int count=0;
    
    public Person(){
        System.out.println("Default Constructor");
    }
    
    public Person(int a){
        this(); //no arguments hence Default Constructor called
        System.out.println("Constructor with 1 arguments");
    }
    
    public Person(String name,int age){
        this(1); //calling const with 1 argument
        System.out.println("Constructor with 2 arguments");
        
        this.name = name;
        this.age = age;
    }
  
    
    void show(){
        System.out.println(name+" is "+age+" years old.");
    }
}
