/*
Types of interfaces
   --Normal ( has more than 1 methods )
   --Single abstract interface ( has only one method ) / Functional interface
   --Marker interface ( no method )
  
*/

//Functional interface

public class Main
{
	public static void main(String[] args) {
		abc a = () -> System.out.println("Hello world"); //lambda method - works in FI
		a.show();
	}
}

@FunctionalInterface
interface abc{
    void show();
}
  
