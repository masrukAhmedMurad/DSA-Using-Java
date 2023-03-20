/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.using.java;

/**
 * Queue Using LinkedList Scratch
 * @author Asus
 * add->O(1)
 * remove->O(1)
 * peek->O(1)
 */
public class QUsingLinkedListScratch {
    
    
    
    static class Node{
        
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
        
    }
    
    
    
    
    static class Queue{
        
    static Node head=null;
    static Node tail=null;
    
    
    public static boolean isEmpty(){
        return head==null && tail==null;
        
    }
    
    
    public static void add(int data){
        
        Node nd=new Node(data);
        if(isEmpty()){
            head=nd;
            tail=nd;
        }
        
        tail.next=nd;
        tail=nd;
        
    }
    
    
    
    
    
    
    
    
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        
        int top=head.data;
       
        
        if(head==tail){
            tail=null;
        }
        head=head.next;
        
        
        return top;
        
    }
    
    
    
    public static int peek(){
        
        if(isEmpty()){
            return -1;
        }
        
        return head.data;
        
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
