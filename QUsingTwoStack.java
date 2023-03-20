
package dsa.using.java;

import java.util.Stack;

/**
 * Queue using two stacks
 * @author Asus
 * add->O(n)
 * remove->O(1)
 * peek->O(1)
 */
public class QUsingTwoStack {
    
    
    static class Queue{
        
   static Stack<Integer>s1=new Stack<>();
   static Stack<Integer>s2=new Stack<>();
    
   
   public static boolean isEmpty(){
       return s1.isEmpty();
   }
   
   
   
   
   public static void add(int data){
       
       if(isEmpty()){
           s1.add(data);
           return;
       }
       
       while(!s1.isEmpty()){
           s2.add(s1.pop());
       }
       
       s1.add(data);
       while(!s2.isEmpty()){
           s1.add(s2.pop());
       }
       
   }
   
   
   public static int remove(){
       if(isEmpty()){
           return -1;
       }
       
       return s1.pop();
       
   }
   
   
   public static int peek(){
       if(isEmpty()){
           return -1;
       }
       return s1.peek();
   }
   
   
        
        
    }
    
   
    
    
    
    
    
    
    
    
    public static void main(String[] args){
    
       Queue q1=new Queue();
        
        q1.add(12);
        q1.add(13);
        q1.add(45);
        
         Queue q2=new Queue();
        
        q2.add(12);
        q2.add(13);
        q2.add(45);
while(!q1.isEmpty()){
    System.out.println(q1.peek());
    q1.remove();
}

        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
      
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
