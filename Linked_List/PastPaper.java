package Linked_List;
class Node22{
    int data;
    Node22 next;
    Node22(int data){this.data=data; next=null;}
    public int sum(Node22 p){
        int sum=0;
        for (Node22 start=p; start!=null; start=start.next){
            sum=sum + start.data;

        }
        return sum;
    }
    public boolean search(Node22 p, int x){
        for (Node22 start=p; p!=null; p=p.next){
            if (start.data==x)
                return true;
        }
        return false;
    }
    public static void concatenate(Node22 p, Node22 q){
Node22 i;
       for ( i=p; i!=null ;i=i.next){
           if (i.next==null){
               i.next=q;
           }
       }
       for (Node22 s=p; s!=null; s=s.next){
           System.out.println(s.data);
       }

    }
}
public class PastPaper {
    public static void main(String[] args) {
       Node22 head = new Node22(3);
       Node22 p=head;
        Node22 head2 = new Node22(11);
       for (int i=4; i<=10; i++){
           p.next=new Node22(i);
           p=p.next;
       }

        System.out.println(head.sum(head));
        System.out.println(head.search(head,2));

        Node22.concatenate(head,head2);

        for (Node22 q=head; q!=null; q=q.next){
            System.out.println(q.data);

        }
        System.out.println(1); }

}
