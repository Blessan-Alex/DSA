// Lasts In Last Out
import java.util.Stack;


public class learnStack {
    public static void main(String[] args){
        Stack<Integer> items = new Stack<>();

        items.push(1);
        items.push(2);
        items.push(4);
        
        System.out.println("Stack "+items);
        System.out.println(items.peek());

        items.pop();
        System.out.println("Stack "+items);


    
}
}
