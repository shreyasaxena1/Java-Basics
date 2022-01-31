public class Main{
    public static void main(String[] args){
        Person p1 = new Person(170.8f,248.7f);

        System.out.println(p1.salary());        
    }
}

class Person{
    String name;
    int age;
    float comp1,comp2;
    
    public Person(float c1,float c2){ //constructor
        comp1=c1;
        comp2=c2;
    }
    
    float salary(){
        return comp1+comp2;
    }
}
