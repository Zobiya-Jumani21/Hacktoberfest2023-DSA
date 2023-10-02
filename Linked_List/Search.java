package Linked_List;

class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data=data;
        this.next=null;
    }Node4(int data, Node4 next){
        this.data=data;
        this.next=next;
    }
    public void insert(Node4 start, int x){
        // precondition list should be in ascending order  and x> start.data
        // post condition and list contain x.

        Node4 p=start;
        while (p.next!=null){
            if (p.next.data >x){
              break;
            }
            p=p.next;}
            p.next=new Node4(x,p.next);
            // Node4 q = new Node4(x);
           // q.next=p.next;
            //p.next=q;
    }

    public Node4 delete(Node4 start, int x){
        if (start==null || start.data>x){
            return start;
        }
        if (start.data==x){
            return start.next;
        }
        for (Node4 p=start; p.next!=null; p=p.next){
            if (p.next.data>x){
                break;
            }
            if (p.next.data==x){
                p.next=p.next.next;
                break;
            }

        }
        return start;
    }

    public boolean search(Node4 start, int x) {
        boolean found = false;
        if (start == null || start.data > x) {
            found = false;
        }
        if (start.data == x) {
            found = true;
        }
        for (Node4 p = start; p.next != null; p = p.next) {
            if (p.next.data > x) {
                break;
            }
            if (p.next.data == x) {
                found = true;
            }
        }
        return found;
    }
    public Node4 concatenate(Node4 p, Node4 q){
        Node4 i;
        for (i=p; i.next!=null; i=i.next){

        }
        i.next=q;
        return p;
    }

    public Node4 copy(Node4 p){
        Node4 q=new Node4(p.data);
        Node4 temp=q;
        p=p.next;
        while (p!=null){
            temp.next=new Node4((p.data));
            p=p.next;
        }

        return q;
    }
}
public class Search {
    public static void main(String[] args) {
        Node4 start;
        Node4 p=start=new Node4(2);

        for (int i=4; i<=10; i++){
            p.next=new Node4(i);
            p=p.next;
        }

//        for (Node4 q=start; q!=null; q=q.next){
//            System.out.print(","+q.data);
//
//            }
//
//       start.insert(start,3);
//        for (Node4 w=start; w!=null; w=w.next){
//            System.out.print(Arrays.toString(new int[]{w.data}));
//        }
//        start.delete(start,4);
//
//        System.out.println(" ");
//        for (Node4 w=start; w!=null; w=w.next){
//            System.out.print(Arrays.toString(new int[]{w.data}));
//        }
//        System.out.println(" ");
//        System.out.println(start.search(start,9));

      Node4 a=  start.copy(start);
        for (Node4 q=a; q!=null; q=q.next ){
            System.out.println(q.data);
        }
        Node4 start3=new Node4(0);
        Node4 s=start.concatenate(start,start3);

    }
}
