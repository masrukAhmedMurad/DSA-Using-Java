
package dsa.using.java;

/**
 *
 * @author M. A. Murad
 */

/**
 * Simple Que Using Array
 * Add element->O(1)
 * Remove element->O(n)
 * Peek element->O(1)
 */

public class SimpleQUsingArray {
    
    
    public static class Queue{
        
   public static int arr[];
   public static  int size;
   public static int rear=-1;
   public Queue(int sz){
       
      
      if(rear==-1){
          this.size=sz;
          arr=new int[sz];
      }
   
       
   }
   
   
   
   public static boolean isEmpty(){
       return rear==-1;
   }
   
     public static boolean isFull(){
       return rear==size-1;
   }
     
   
   public static void add(int data){
       if(isFull()){
           System.out.println("Queue is full");
           return ;
       }
       
       arr[++rear]=data;
       
   }
   
   
   
   public static int remove(){
       
       if(isEmpty()){
           return -1;
       }
       
       for(int i=0;i<rear;i++){
           arr[i]=arr[i+1];
       }
       return --rear;
       
       
   }
   
   
   public static int peek(){
       if(isEmpty()){
           return -1;
       }else{
           return arr[0];
       }
   }
   
   
        
   
   
        
        
    }
    
    
    
    public static void main(String[] args){
        
        
        Queue q1=new Queue(6);
        
        System.out.println(q1.isFull());
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
                
        q1.add(12);
        q1.add(32);
        q1.add(232);
        q1.add(232);
        q1.add(122);
       
            
        
        System.out.println(q1.isFull());
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
        
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
         
         System.out.println(q1.isFull());
        System.out.println(q1.isEmpty());
        System.out.println(q1.peek());
    
     Queue q2=new Queue(8);
     
      q1.add(12);
        q1.add(32);
        q1.add(232);
        q1.add(232);
        q1.add(122);

          q2.add(12);
        q2.add(32);
      q2.add(12);
        q2.add(32);
       
         System.out.println(q2.isFull());
        System.out.println(q2.isEmpty());
        System.out.println(q2.peek());
        
         while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        
          Queue q3=new Queue(8);
     
       System.out.println(q2.isFull());
        System.out.println(q2.isEmpty());
        System.out.println(q2.peek());
        
        
        
         System.out.println(q1.rear);
        q1.add(232);
        q1.add(122);
        
          System.out.println(q1.rear);
         Queue q4=new Queue(8);
            System.out.println(q1.rear);
     

     
        q4.add(232);
        q4.add(232);
        q4.add(122);
          q1.remove();
            q1.remove();
            q1.add(999);
            q1.add(899);
            q1.add(990);
             //q1.remove();
        q4.add(232);
        q4.add(232);
        q4.add(122);
         q4.add(122);
         while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
        
    }
    
    
    
    
    
    
   
    
    
}
