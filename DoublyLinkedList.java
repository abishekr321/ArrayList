
public class DoublyLinkedList {
	class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }    
    Node head=null;
    Node tail = null;  
void insert (int data) {  
      Node newNode = new Node(data);  
      if(head == null) {  
            head = tail = newNode;    
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            tail.next = newNode;  
          newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
  } 
void delete() {
	 if(head != tail) {  
         tail = tail.previous;  
         tail.next = null;  
     }  
     else {  
         head = tail = null;  
     }  

}
 
void print () {  
      Node current = head;  
      if(head == null) {  
       System.out.println("no node");  
       return;  
        }  
        while(current != null) {  
            System.out.print(current.data + ", ");  
            current = current.next;  
        }  
    }  
  
 public static void main(String[] args) {  
  DoublyLinkedList dList = new DoublyLinkedList();  
         
        dList.insert(1);  
        dList.insert(2);  
        dList.insert(3);  
        dList.insert(4);  
        dList.insert(5);
        dList.delete();
        dList.print();  
    }  
  

}
