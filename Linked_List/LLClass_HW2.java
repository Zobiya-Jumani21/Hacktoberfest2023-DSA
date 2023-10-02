package Linked_List;
class Node2{
    int data;
    static int size=0;
    static int sum=0;
    Node1 second;

    Node2(int data){
        this.data=data;
    }
    int getSize(){
        return size;
    }
}
public class LLClass_HW2 {
    public static void main(String[] args) {
        int average=0,count=0;
        Node1 start = new Node1(1);
        Node1 q=start;

        for (int i=2; i<=100; i++){
            q.second= new Node1(i);
            q=q.second;

        }
        for (Node1 p=start; p!=null; p=p.second){
            System.out.print(p.data+",");

            Node1. size++;
            if (p.data % 2==0){
                Node1.sum += p.data;
                count++;
            }
        }

        average=Node1.sum/count;

// call the size function for the measure the size
        System.out.println("\nSIZE OF LIST IS :"+start.getSize());
        System.out.println("SUM IS Even number is:"+Node1.sum);
        System.out.println("Average of list is : "+average);
    }
}
