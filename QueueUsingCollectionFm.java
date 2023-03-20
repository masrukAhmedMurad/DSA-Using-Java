
package dsa.using.java;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue Using Collection Frame Work
 * @author Asus
 */
public class QueueUsingCollectionFm {
    
    
    
    
    public static void main(String[] args){
        
        Queue<Integer> q1=new ArrayDeque<>();
        
        q1.add(12);
        q1.add(13);
        q1.add(45);
        
while(!q1.isEmpty()){
    System.out.println(q1.peek());
    q1.remove();
}

        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
      
        
        
        
        
        
        
    }
    
    
}
