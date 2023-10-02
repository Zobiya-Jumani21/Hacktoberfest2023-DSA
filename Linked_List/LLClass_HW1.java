package Linked_List;
class Node1{
    int data;
   static int size=0;
   static int sum=0;
    Node1 second;

    Node1(int data){
        this.data=data;
    }
    int getSize(){
        return size;
    }
}
public class LLClass_HW1 {
    public static void main(String[] args) {
        int average=0,count=0;
        Node1 start = new Node1(2);
        Node1 q=start;

        for (int i=2; i<=10; i++){
            q.second= new Node1(2*i);
            q=q.second;

        }
        for (Node1 p=start; p!=null; p=p.second){
            System.out.print(p.data+",");
            count++;
            Node1. size++;
           Node1.sum+=p.data;

        }

        average=Node1.sum/count;

// call the size function for the measure the size
        System.out.println("\nSIZE OF LIST IS :"+start.getSize());
        System.out.println("SUM IS :"+Node1.sum);
        System.out.println("Average of list is : "+average);
    }
}
