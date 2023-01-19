public class SinglyLinkedList {     
class Node{    
	    int data;    
	    Node next;    
 Node(int data) {    
	    this.data = data;    
	    next = null;    
	        }    
}       
             Node head = null;    
             Node tail = null;    
 void insert(int data) {    
	       Node newNode = new Node(data);    
	       if(head == null) {    
                head = newNode;    
	            tail = newNode;    
	        }    
	       else {    
	            tail.next = newNode;     
	            tail = newNode;    
	        }    
	    }
 void delete() {
	 if(head!=tail) {
	 Node current=head;
	 while(current.next != tail) {  
         current = current.next;  
     }    
     tail = current;  
     tail.next = null;  
 }   
	 else {
		 head=tail=null;
	 }
	 
	 }  
 
  void print() {    
	     Node current = head;    
	            if(head == null) {    
	            System.out.println("No nodes");    
	            return;    
	        }    
	     while(current != null) {    
	            System.out.print(current.data + ", ");    
	            current = current.next;    
	        }    
	        	    }    
 public static void main(String[] args) {    
	  SinglyLinkedList sList = new SinglyLinkedList();    
	            
	       
	        sList.insert(1);    
	        sList.insert(2);    
	        sList.insert(3);    
	        sList.insert(4);    
	        sList.insert(5);   
	        sList.delete();
	        sList.print();    
	    }    
	}    


