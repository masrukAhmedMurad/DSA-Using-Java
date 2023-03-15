//Stack data structure using linked list;


/**
 *
 * @author M. A. Murad
 */
public class StackUsingLinkedList {
    
//Node class    
    private static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;  //
        }
        
    }
 //end of node class
    
    
 ///stack class
    
    public static class Stack{
        
        public static Node head=null;    //declaring head variable
        
        
        
        
 ///isempty method to check the stack is null or not
        
        public static boolean isEmpty(){
            return head==null;
        }
 ///end of isempty method       
       
   
 ///push method
        
        public static void push(int data){
            
            Node newNode=new Node(data);   ///creating new node
            
            if(isEmpty()){
                head=newNode;   ///assigning new node to head;
                return;
            }
            
            newNode.next=head;   //head is linked to new node
            head=newNode;        ///newnode beconmes the head
            
            
        }
        
  ///end of push method      
        
      
        
        
  ///start pop method
        
         public static int pop(){
            if(isEmpty()){
                return -1;  ///if stack is empty return -1
            }    
            
            int top=head.data;  ///store the last value
            head=head.next;   //point head.next to head
            return top;    //return top value 
            
        }      
  
  
  //end of pop method
        
         
         
  ///start peek method
         
         public static int peek(){
            if(isEmpty()){
                return -1;  ///if stack is empty return -1
            }    
            
            int top=head.data;  ///store the last value
            
            return top;    //return top value 
           
             
         }
         
  ///end of peek method
         
         
         
         
         
  ////push at bottom;
         
         
         public static void pushAtBottom(int data){
            
             Node newNode=new Node(data);
             
             if(isEmpty()){
                 head=newNode;
                 return;
             }
            
             Node temp=head;
            
            
             while(temp.next!=null){
                 temp=temp.next;
             }
             
             temp.next=newNode;
            
             
             
             
             
             
             
         }
         
         
   ///end of push at bottom
         
         
         
         
         
         
    ///reverse stack
         
         
         public static void reverse(){
             
             if(isEmpty()){
                 return ;
             }
             
             Node prev=head;
             Node curNode=head.next;
             
             
             while(curNode!=null){
                 Node next=curNode.next;
                 
                 curNode.next=prev;
                 prev=curNode;
                 curNode=next;
                 
             }
             
             head.next=null;
             head=prev;
             
             
             
         }
         
         
         
         
         
         
      
         
         
   ///end of reverse stack
         
         
         
         
         
         
        
    }
    
    
  //end of stack class
    
    
    
    public static void main(String[] args){
        
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

       

         System.out.println();
       
        Stack stack2 = new Stack();
        stack2.push(1);
        stack2.push(34);
        stack2.push(34);
        stack2.push(400);
        stack1.pushAtBottom(1000);
        stack1.reverse();
        while(!stack2.isEmpty()) {
            System.out.println(stack1.peek());
            stack2.pop();

        
        
        
        }



    }
    
}
