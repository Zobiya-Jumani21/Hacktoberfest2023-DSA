package Linked_List;
class Node{
    int data;
    Node next; // self reference object

    public Node(int data){

        this.data=data;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    void insert(Node start, int x){
        // precondition the list is in ascending order
        // and x> start.data
        // postCondition is that list contain x , x save successfully
        Node p=start;
        while (p.next!= null){
            if (p.next.data> x){
                break;
            }
            p=p.next;
        }
        p.next=new Node(x,p.next);
    }
   // Node insert(Node start, int x){
//        if (start==null || start.data>x){
//
//        }
//    }

}
public class LLClass_HW {

    public static void main(String[] args) {

        Node start = new Node(12);
        Node shuru=start;
        for (int i=1; i<10; i++){
            shuru.next = new Node(12+i);
            shuru=shuru.next;

        }


        for (Node shur=start; shur!=null; shur=shur.next){
            System.out.print(shur.data+",");
        }
        start.insert(start,13);
        System.out.println("");
        for (Node shur=start; shur!=null; shur=shur.next){
            System.out.print(shur.data+",");
        }
    }
}
