

package dsa.using.java;

/**
 * Circular Queue Using Array
 * @author Asus
 * Add element ->O(1)
 * Remove element->O(1)
 * Peek element->O(1)
 */



public class CircularQueueUsingArray {
    
    
    
    static class Queue{
        
    public static int arr[];
    public static int size;
    public static int front=-1;
    public static int rear=-1;
        
       public Queue(int sz){
       
      
      if(rear==-1){
          this.size=sz;
          arr=new int[sz];
      }
   
       
   }
    
    
    
    
    
    
    
    public static boolean isEmpty(){
        
      return rear==-1 && front==-1;
        
    }
    
    public static boolean isFull(){
        return ((rear+1)%size)==front;
    }
    
    
    public static void add(int data){
        
        if(isFull()){
            System.out.println("Q is full");
            return;
        }
        
        rear=(rear+1)%size;
        arr[rear]=data;
        
        if(front==-1){
            front=0;
        }
        
    }
    
    
    
    public static int remove(){
        
        if(isEmpty()){
            System.out.println("Q is empty");
            return -1;
        }
        
       int top=  arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
           front=(front+1)%size;

        }
        
        return top;
        
    }
    



public static int peek(){
    
    
    if(isEmpty()){
        return -1;
    }
    
    return arr[front];
    
}









    
        
        
    }
    
    
    
    
    
    public static void main(String[] args){
        
        Queue q1=new Queue(5);
        q1.add(12);
        q1.add(13);
        q1.add(45);
        Queue q2=new Queue(5);
        q2.add(12);
        q2.add(13);
        q2.add(45);
        q2.remove();
        System.out.println(q1.front);
        Queue q4=new Queue(8);
        System.out.println(q1.rear);
     

while(!q1.isEmpty()){
    System.out.println(q2.peek());
    q2.remove();
}
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
