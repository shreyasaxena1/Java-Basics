public class Main{
    public static void main (String[] args) {
        Abc obj = new Abc(){
            public void show(){
                System.out.println("Hello world");
            }
        };
        
        obj.show();
    }
}

/*
 we cannot create object of interface since 
 interface does not method implementation,need
 to create a class for making object. So we can
 use anonymous class and implement the method */
 

interface Abc{
    void show(); 
}
