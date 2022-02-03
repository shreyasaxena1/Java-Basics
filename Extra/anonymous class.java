public class Main
{
	public static void main(String[] args) {
		A obj = new A(){ 
		    /*
		    we want to use some other defination of method show 
		    but don't want to override it using base class so
		    we use anonymous class  -- one time use*/
		    
		    void show(){
		    System.out.println("This is main's method");
		    }
		};
		
		obj.show();
	}
}

class A{
    void show(){
        System.out.println("This is A's method");
    }
}
