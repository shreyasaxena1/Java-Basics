public class Main{
    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.ram =4;
        l1.setPrice(38000);
        l1.show();
    }
}
class Laptop{
    int ram;
    private int price;
    
    void setPrice(int price){
        this.price = price;
    }
    
    void show(){
        System.out.println("Laptop has "+ram+"GB ram and its price is Rs"+price);
    }
    
}
