
package dsa.using.java;

import java.util.ArrayList;

/**
 *
 * @author M. A. Murad
 */
public class StackUsingArrList {
    
    
    static class Stack{
        
        
        //creating an array list to put the data;
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        
        //is empty method
        public boolean isEmpty(){
           return list.size()==0;   //return whether list is empty or not
            
            
        }
        
        //end of isEmpty method
        
        
        //push method
        
        public void push(int data){
            list.add(data);   ///simply add data to the last of the list;
        }
        
        //end of push method
        
        
        
        
        
        
        //pop method
        
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);     ///access the last element;
            list.remove(list.size()-1);
            return top;
            
        }
        
        //end of pop method
        
        
        
        
        
        ///peek method
        
        public int peek(){
            
            if(isEmpty()){
                return -1;
            }
            
            return list.get(list.size()-1);   ///return the last element
        }
        
        ///end of peek method
        
        
        
        
        ///push at bottom
        
        public void pushAtBottom(int data){
            
            list.add(0, data);
            
            
        }
        
        ///end of push at bottom
        
        
        
        
        
        ///reverse method
        
        
        public void reverse(){
            
            final int j=list.size()-1;
            int k=j;
           
         for(int i=0;i<=j/2;i++){
             int temp=list.get(i);
             list.set(i,list.get(k));
             list.set(k--,temp);
         }
            
            
            
        }
        
        
        //end of reverse method
        
        
          
        
        
    }
    
    
    
    
    
    
    public static void main(String[] args){
        
        
         Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
          
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack.reverse();
        
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        
        }
        
        
    }
    
    
    
    
}
