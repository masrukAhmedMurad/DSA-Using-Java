///Stack using collection framework
package dsa.using.java;

import java.util.Stack;

/**
 *
 * @author M. A. Murad
 */
public class StackUsingCollectionFramework {
    
   //push at bottom
    
    static void pushAtBottom(Stack<Integer>s,int data){
        
        if(s.isEmpty()){
            s.push(data);
            return;
        }
       
        
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
        
    }
    
    //end of push at bottom
    
   
    ///reverse
    
    static void reverse(Stack<Integer> s){
        
        if(s.isEmpty()){
            return;
        }
        
        int top=s.pop();    //access the top element
        reverse(s);
        pushAtBottom(s, top);    //push the element at bottom
        
    }
    //end of reverse
    
    
    public static void main(String[] args){
        
        
        Stack<Integer> stack=new Stack<Integer>();
        
        stack.push(12);
        stack.push(132);
        stack.push(142);
        stack.push(122); 
        stack.push(112);
        pushAtBottom(stack, 333);
        
        System.out.println(stack.isEmpty());
        
          while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        
        }
        
        
           
    }
    
    
    
 
    
}
