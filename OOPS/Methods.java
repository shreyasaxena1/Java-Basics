public class Main{
  public static void main(String[] args){
      Person obj = new Person();
      obj.name = " Shreya";
      obj.age = 21;
      System.out.println(obj.name +" "+ obj.age);
      obj.sleep();
      obj.eat();
  }   
}

class Person{
    String name;
    int age;
    
    void sleep(){
        System.out.println(name+" is sleeping");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
}
