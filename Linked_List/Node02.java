package Linked_List;

// test section 02 question 2
public class Node02 {
    int data;
    Node02 next;
    Node02(int data){
        this.data=data;
    }
    public static void main(String[] args) {
        int array[]={29,35,45,55,65,75,95};
        Node02 start=new Node02(array[0]);
        Node02 p=start;

        for (int i=1; i< array.length; i++){
            p.next=new Node02(array[i]);
            p=p.next;
        }
        int mid=0,last;
        // find mid
        for (Node02 q=start; q!=null; q=q.next){
            mid++;
        }
        int midelement=mid/2;
        if (mid%2==0){
           midelement=midelement;
        }
        else {
            midelement=midelement+1;
        }
        int count=0;
        for (Node02 q=start; q!=null; q=q.next) {
            count++;
            if (midelement == count) {
                System.out.println("mid element is :");
                System.out.print(q.data);
                break;
            }

        }
        for (Node02 s=start; s!=null; s=s.next){
            if (s.next==null){
                System.out.println("last element is :");
                System.out.print(s.data);
            }
        }
    }
}
