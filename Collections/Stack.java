import java.util.Stack;

public class Myclass{
    public static void main(String[] args){
      Stack<String> s = new Stack<>();
      s.push("Cat");
      s.push("Dog");
      s.push("Fish");
      
      while(!s.empty()){
          System.out.print(s.peek()+" ");
          s.pop();
      }
    }
}
