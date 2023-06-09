
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author M. A. Murad
 */
public class Tree {
    
    //Node class
    static class Node{
        
        int data;
        Node left;
        Node right;

        //Node constructor
        public Node(int data) {
            
            this.data = data;
            
            //left and right set to null
            this.left = null;
            this.right = null;
            
            
        }
    
    }
    
    //end of node class
    
    
         static class NodeInfo{
            
            int diameter;
            int height;

            
            public NodeInfo(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
            
            
            
            
        }
    
    
    
    
    
    
    
    
    
    //Binary tree class
    
    static class BinaryTree{
       
        //index initialized to -1, for iterating through the nodes array while building tree using nodes array
        static int  index=-1;
        
        //building tree from preOrder Values;
        
        static Node buildTree(int nodes[]){
            ++index;
            
            if(nodes[index]==-1){
                return null;
            }
            
            Node newNode=new Node(nodes[index]);  //creating new node
            
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            
            return newNode;
            
        }
        
        
        //end of buildtree method
        
        
        
        
        
         //POSTOrder traversal
        
        static void postOrder(Node root){
            if(root==null){
             //System.out.print("-1->");
               
                return;
            }
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"->");

            
            
        }
        
        
        
        
        
        
        //inOrder traversal
        
        static void inOrder(Node root){
            if(root==null){
            // System.out.print("-1->");
              
                return;
            }
            
            inOrder(root.left);
            System.out.print(root.data+"->");

            inOrder(root.right);
            
            
        }
        
        
        
        
        
        
        //preeOrder traversal
        
        static void preOrder(Node root){
            if(root==null){
             System.out.print("-1->");
               
                return;
            }
            
            System.out.print(root.data+"->");
            preOrder(root.left);
            preOrder(root.right);
            
            
        }
        
        
        
        //levelOrder Traversal
        
        static void levelOrder(Node root){
            
            Queue<Node> q=new LinkedList<Node>();   //creating a queue
          
            q.add(root);  
            q.add(null);
            
            //loop through the queue untill it is empty
            while(!q.isEmpty()){
                
                Node curNode=q.remove();  //remove first element
                
                if(curNode==null){
                     System.out.println(); //print new line

                    
                    if(q.isEmpty()){
                        break; //break loop if really the queue is empty
                    }else{
                        q.add(null); //add another null to the last if the queue is not empty
                    }
                    
                }else{
                    //print the data
                    System.out.print(curNode.data+" ");
                    if(curNode.left!=null){
                        q.add(curNode.left);  //add left Node to the queue
                    }
                    if(curNode.right!=null){
                        q.add(curNode.right);   //add right node to queue
                    }
                    
                }
                
                
            }
            
            
            
            
        }
        
        
        ///end of level order
        
        
        
        //count node
        
        static int countNodes(Node root){
            
            if(root==null){
                return 0;
            }
            
            
            int leftCount=countNodes(root.left);
            int rightCount=countNodes(root.right);
            int total=leftCount+rightCount+1;
            
            return total;
            
        }
        
        
        //end of count node
        
        
        
        
        
        //count sum of the nodes
        
        static int countSum(Node root){
            
            
            if(root==null){
                return 0;
            }
            
            int leftSum=countSum(root.left);
            int rightSum=countSum(root.right);
           
            
            int total =rightSum+leftSum+root.data;
            
            return total;
            
            
        }
        
        
        //end sum of the node
        
        
        
        
        
      ///height of a tree
        
        static int height(Node root){
            
            if(root==null){
                return 0;
            }
            
            
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            
            
            
            int total=Math.max(leftHeight,rightHeight)+1;
            return total;
            
        }
        
        
        //end of height of a tree
        
        
        
        
        
        
        
        //diameter of a tree
        
        //time complexity O(n^2)
        static int diameterNS(Node root){
            
            if (root==null){
                return 0;
            }
            
            
            int diameter1=diameterNS(root.left);    //diameter of left sub tree
            int diameter2=diameterNS(root.right);     //diameter of right sub tree
            
            int diameter3=height(root.left)+height(root.right)+1;    //number of nodes through parent node
            
            return Math.max(diameter1,Math.max(diameter2, diameter3));
        
            
        }
        
        
        
        
   
        
        
        
        
         //time complexity O(n)
        
        static NodeInfo diameterN(Node root){
            
            if(root==null){
                NodeInfo newNodeInfo=new NodeInfo (0,0);
                return newNodeInfo;
            }
           
            NodeInfo left=diameterN(root.left);
            NodeInfo right=diameterN(root.right);
            
            int myHeight=Math.max(left.height,right.height)+1;
            
            int dia1=left.diameter;
            int dia2=right.diameter;
            int dia3=left.height+right.height+1;
            int myDiameter=Math.max(dia1,Math.max(dia2, dia3));
            
            NodeInfo newNodeInfo=new NodeInfo (myDiameter,myHeight);
            
            return  newNodeInfo;
            
            
            
            
            
        }
        
        
        
        ///end diameter
        
        
        
        
        
        
        
        
    }
    
    

    
    
    
    
    
    
     public static void main(String[] args) {


         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};  //pre order values representing null by -1;

         
        BinaryTree binaryTree=new BinaryTree();   //creating object of binary tree
      
        Node root = binaryTree.buildTree(nodes);  //build a tree using the pre order values and store the root;
      
        binaryTree.preOrder(root);
        
        System.out.println();
        binaryTree.postOrder(root);
        
        System.out.println();
        binaryTree.inOrder(root); 
        
        System.out.println();
        binaryTree.levelOrder(root); 
        
        System.out.println(); 
        int NumberOfNodes=binaryTree.countNodes(root);  
        System.out.println(NumberOfNodes);
        
        System.out.println();
        int SumOfNodes=binaryTree.countSum(root);  

        System.out.println(SumOfNodes);
        
        System.out.println();
        int height=binaryTree.height(root);  

        System.out.println(height);
        
         System.out.println();
        int diameterNS=binaryTree.diameterNS(root);  

        System.out.println(diameterNS);
        
        
        
         System.out.println();
         NodeInfo diameterN=binaryTree.diameterN(root);  

        System.out.println(diameterN.diameter);
        
        
    }
    
   
     
     
     
     
    
}
