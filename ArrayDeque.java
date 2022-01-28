import java.util.ArrayDeque;

public class Myclass{
    public static void main(String[] args){
     ArrayDeque<Integer> adq = new ArrayDeque<>();
     
     adq.offer(3);
     adq.offerFirst(4);
     adq.offerLast(5);
     System.out.print(adq); //4 3 5
     System.out.print("\n");
     
     System.out.print(adq.peek()); //4
     System.out.print(adq.peekLast()); //5
     
     System.out.print(adq.poll()); //4
     System.out.print(adq.pollLast()); //5
     
    }
}
