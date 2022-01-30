
/*
Throwable -- class
   - Exception (Can be handled)
       -checked
           -IOExceptions
           -SQLExceptions
       -unchecked
           - RuntimeExceptions
                 -Arithematic exception
   - Error
   
   */

public class ExceptionDemo{
    public static void main(String[] args){
        int i=8,j=2,k=0;
      int a[] = new int[4];
        try{
           k=i/j;
           for(int l=1;l<=10;l++){
              System.out.println(a[l]);
            }
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.print("Array Exhausted");
    }
      catch(Exception e){ //last catch
          System.out.print("Unknown Exception");
      }
      finally{ //execute for sure
            System.out.println("BYE");
        }
    }
}










//Try with resouces
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter input");
        Scanner scn = null;
        try{
         scn = new Scanner(System.in); //here scn is a resource and we need to close it
        String s = scn.nextLine();
        System.out.print(s);
        
        }
        catch(Exception e){
            System.out.println("hahahah");
        }
        finally{
            scn.close(); //closing all resources
        }
        
        
    }
}

//Instead of closing resources in finally block, initialize them with try
//Try with resouces
import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter input");
        System.out.println("Enter input");
        
        try(Scanner scn = new Scanner(System.in)){
         
        int s = scn.nextInt(); //even if error occure here, resource will deallocate
        System.out.print(s); 
        }
        
        
    }
}



//Throw - forcefully generate error
//Throws - Supress error

public class Main {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}


