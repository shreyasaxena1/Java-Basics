import java.util.Queue;
import java.util.LinkedList;

public class Myclass{
    public static void main(String[] args){
     Queue<Integer> q = new LinkedList<>();
     q.offer(1); // can use q.add(1) but if operation does not complete then it will return exception but offer only return false 
     q.offer(2);
     q.offer(3);
     
     System.out.print(q);
     
     q.poll(); //can use q.remove() -- return exception if empty but pull return NULL
     
     System.out.print(q);
     
     System.out.print(q.element()); //can use q.peek() -- return exception if fails
     
    }
}


Queue<Integer> q = new PriorityQueue<>(); //minheap
