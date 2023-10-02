package Linked_List;
class Node1st{
    int data;
    int size=0;
    Node1st next;
    Node1st(int data){
        this.data=data;
        size++;
    }
}
public class Reverce {
    public static void main(String[] args) {
       int[] array ={1,2,3,4,5,6,7,8,9,10};
       Node1st head = new Node1st(array[0]);
       Node1st p=head;
       for (int i=1; i< array.length; i++){

           p.next= new Node1st(array[i]);
           p=p.next;
       }
        System.out.println("Linked List print");
       int count=0;
       for (Node1st q=head; q!=null; q=q.next){
           System.out.print(q.data+",");
           count++;
       }


       int[] array2 = new int[count];
       count=0;
        
        for (Node1st z=head; z!=null; z=z.next){

            array2[count]= z.data;
            ++count;

        }

        for (int i=0; i< array2.length; i++){
           System.out.println(array2[i]);
        }
    }
}
