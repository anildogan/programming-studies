package stack;

import java.util.*;


public class stacks {
    public static void main(String[] args) {
        
        Queue<Integer> queue =  new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        
    }
}