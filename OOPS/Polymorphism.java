//Ploymorphism -- runtime and compile time

public class Main{
  public static void main(String[] args){
      Person obj = new Person();
      obj.name = " Shreya";
      obj.age = 21;
      System.out.println(obj.name +" "+ obj.age);
     
      //Compile time polymorphism
      obj.walk();
      obj.walk(16);
  }   
}

class Person{
    String name;
    int age;
    
    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps+ " steps");
    }
}
