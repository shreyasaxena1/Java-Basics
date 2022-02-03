/*
 final keyword
    --variables
    --methods
    --class
    
 1.variables
     -- use caps letter (good convention)
 2. class
     -- no other class can inherit
 3. method
     -- no one ca override the method
     
 */

//Variables



//Class

public class Main{
    public static void main (String[] args) {
        B obj = new B();
        obj.show();
    }
}

final class A{
    public void show(){
        System.out.println("A show");
    }
}

class B extends A{ //error
    public void show(){ 
        System.out.println("B show");
    }
}

//Method
public class Main{
    public static void main (String[] args) {
        B obj = new B();
        obj.show();
    }
}

class A{
    public final void show(){
        System.out.println("A show");
    }
}

class B extends A{
    public void show(){ //error
        System.out.println("B show");
    }
}
