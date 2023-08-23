import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
        /*
        List<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4,0);
        System.out.println(list.get(4));
        list.remove(0);
        list.remove(list.size()-1);
        list.contains(3);
        for (int i = 0; i< list.size()-1; i++){
            System.out.println(list.get(i));
        }
    }*/
}