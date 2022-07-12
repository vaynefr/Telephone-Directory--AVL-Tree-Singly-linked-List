

package phonebook;

class Node<Object> {
    Object data;
    Node<Object> next;
    
    Node(Object input) {
        data = input;
        next = null;
    }
    
@Override
public String toString(){
        return String.valueOf(this.data);
    }
}

public class List<Object> {
    private Node<Object> head;
    private Node<Object> tail;
    private int length;

    List() {
	head = null;
        tail = null;
	length = 0;
    }

    void add(Object input) {
        Node<Object> n = new Node<Object>(input);
        
        if (isEmpty()) {
            head = tail = n;
            length++;
	} else {            
            tail.next = n;
            tail = tail.next;
            length++;            
        }
    }

    void printList () {	
	if (head == null) {
            System.out.println("The list is empty!");
	} else {
            
            Node<Object> n = head;
            for (int i = 0; i < length; i++) {
		System.out.print("Index = " + (i+1) + " ");
		System.out.println(n);
		n = n.next;
            }
            System.out.println();
	}
    }

    Object getHeadData() {
        return head.data;
    }
    
    Object getIdx(int n) {
        Node<Object> temp = head;
        if(n == 0) return head.data;
        for(int i = 1; i <= n; i++) {
           temp = temp.next;
           if(n >= length) return null;
        }
        return temp.data;
    }

    Node getNode(int n) {
        Node<Object> temp = head;
        if(n == 0) return head;
        if(n >= length) return null;
        for(int i = 1; i <= n; i++) {
           temp = temp.next;
           if(i == n) {
               return temp;
           }
        }
        return null;
    }

    void delete(int d) {        
        if (d == 0) {
            head = head.next;
	} else if (d == length - 1) {
            Node<Object> temp = getNode(length - 2);
            temp.next = null;
            tail = temp;
        } else {
            Node<Object> temp = getNode(d - 1);
            temp.next = temp.next.next;
        }
        length--;
    }

    int getLength() {
        return length;
    }

    boolean isEmpty() {
	return (length == 0);
    }
}
