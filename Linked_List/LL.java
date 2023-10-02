package Linked_List;
// in arrayList search time complexity is big o of one O(1)
// in arrayList insult time complexity is big o of one O(n)

// in LinkedList search time complexity is big o of one O(n)
// in LinkedList insult time complexity is big o of one O(1)
// linkedList is variable sized
// Non_Contiguous memory
//linkedList structure called Node
// last node called empty or null node
// Head means first Node
// single,double,circular these are the type of linkedList
public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);

        if (head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add last
    public void addLast(String data){
        Node newNode = new Node(data);

        if (head == null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while (currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;

    }
    // print list
    public void printList(){
        if (head==null){
            System.out.println("List is null");
            return;
        }
        Node currNode=head;
        while (currNode != null){
            System.out.println(currNode.data+"_>");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    // delete first
    public void firstDelete(){
        if (head==null){
            System.out.println("The list is a empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last
    public void lastDelete(){
        if (head==null){
            System.out.println("The list is a empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
LL list = new LL();
list.addFirst("LinkedList");
list.addFirst("is a");
list.printList();
list.addLast("list");
list.printList();

list.firstDelete();
list.printList();
        System.out.println(list.getSize());
    }
}
