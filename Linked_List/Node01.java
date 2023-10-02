package Linked_List;
// DSA test Question 01 section 2
public class Node01 {
    int data;
    Node01 next;
    Node01(int data){this.data=data;}
    static int[] resize(int[] a, int n){
        if (n<a.length)throw  new IllegalArgumentException();
        int[] aa=new int[n];
        System.arraycopy(a,0,aa,0,a.length);
        return aa;
    }
    public static void main(String[] args) {

        Node01 start= new Node01(5);
        Node01 p=start;
      Node01 head =new Node01(29);
        Node01 q=head;

        for (int i=7; i<=11; i++){
            if (i%2!=0){
                p.next=new Node01(i);
                p=p.next;
            }
        }
        for (int i=35; i<=45; i+=10){

                q.next=new Node01(i);
                q=q.next;
            }
        for (Node01 s=start; s!=null; s=s.next){
            System.out.println(s.data);
        }
        System.out.println("");
        for (Node01 s=head; s!=null; s=s.next){
            System.out.println(s.data);
        }
        System.out.println(" ");

        Node01 start3=new Node01(p.data+q.data);
        Node01 z=start3;
//

//        int[] array=new int[5];
//        int[] new array=resize(array,25);

    }
}
