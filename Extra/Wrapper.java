//some frameworks only works with wrapper classes, they don't use primitive variables
public class Main{
    
public static void main(String[] args){
    //Both works same
    int i=5; //primitive 
    
    //ii is object of class i
    Integer ii = new Integer(5); // -- Boxing or wrapping  
    
    int j = ii.intValue(); // -- Unboxing or unwrapping
    
    
    Integer value = i; //Autoboxing ( Converting primitives into objects )
    int k = value //Autounboxing
    
    
    
    }
}

/*
byte b=10;  
short s=20;  
int i=30;  
long l=40;  
float f=50.0F;  
double d=60.0D;  
char c='a';  
boolean b2=true

Autoboxing: Converting primitives into objects  

Byte byteobj=b;  
Short shortobj=s;  
Integer intobj=i;  
Long longobj=l;  
Float floatobj=f;  
Double doubleobj=d;  
Character charobj=c;  
Boolean boolobj=b2; 

Unboxing: Converting Objects to Primitives  

byte bytevalue=byteobj;  
short shortvalue=shortobj;  
int intvalue=intobj;  
long longvalue=longobj;  
float floatvalue=floatobj;  
double doublevalue=doubleobj;  
char charvalue=charobj;  
boolean boolvalue=boolobj;  */
