package Linked_List;
class Node3{
  int data;
    Node3 head;
    Node3 next;
    Node3(){}
    Node3(int data){
        this.data=data;
    }
    Node3(int data, Node3 next){
        this.data=data;
        this.next=next;
    }
    public static Node3 mergeList(Node3 l1, Node3 l2){
        Node3 l3 = new Node3();
        Node3 w= l3;
        while (l1!=null && l2!=null){
            if (l1.data< l2.data){
                w.next=l1;
                l1=l1.next;
            }
            else {
                w.next=l2;
                l2=l2.next;
            }
            // Update the variable
            w= w.next;
        }
        // If anyone list become empty append the remaining
        // list element of other list.
        if (l1 == null)
            w.next = l2;


        else if (l2 == null)
            w.next = l1;


        // Return the resultant list without first extra
        // node
        return l3.next;
    }
}

public class LLClass_HW3 {
     public static void main(String[] args) {
         Node3 one = new Node3(1);
         Node3 two = new Node3(2);



         Node3 p=one;
         Node3 q=two;
         for (int i=2; i<10; i++){
             if (i%2==1){
                 p.next=new Node3(i);
                 p=p.next;
             }
         }

         for (int i=3; i<=10; i++){
             if (i%2==0){
                 q.next=new Node3(i);
                 q=q.next;
             }
         }
         Node3 newList = Node3.mergeList(one,two);
         while (newList !=null){
             System.out.print(newList.data+",");
             newList=newList.next;
         }



    }
}
