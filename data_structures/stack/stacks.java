package stack;

import java.util.*;


public class stacks {
    public static void main(String[] args) {
        
        Queue queue =  new LinkedList();
        queue.add(1);
        queue.add("sadas");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        
    }
}