package Linked_List;
import java.util.Scanner;
import java.io.*;
class LList{
    String data;
    LList next;
    int count;
    LList(String data){ this.data=data;}

    LList(String data, int count){
        this.data=data;
        this.count=count;
    }

}
public class LLClass_HW_V {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LList start= new LList("");
        LList S=start;
        LList node2 = new LList("",0);
        LList T=node2;
        boolean check = false;
       
        String[] wordsList= new String[]{"i","love"," my","university","i","have","been","studying","in","this","university","since","the","last","12","months"
        ,"and","those","months","have","been","the","best","of","my","life","the","university","is","providing","me","a"
        ,"platform","to","strengthen","my","skills","and","make","a","way","for","my","better","future","i","will",
                "keep","loving","my","university","for","the","rest","of","my","life"};

        //  love my university. i have been studying in this university since last 12th month.
        // and these months have been the best of my life.
        // the univerity is providing me to platform to strengthen my skill and make a way for my better future.
        // i will keep loving my university for the rest of my life.

for(int i=0; i< wordsList.length; i++){
            S.next=new LList(wordsList[i]);
            S=S.next;
        }
//String word;
//        System.out.println("are you go for another word ?");
//char ch=sc.next().charAt(0);
//
//while (ch=='y' || ch=='Y'){
//    System.out.println("enter a word :");
//    word = sc.next();
//    S.next= new LList(word);
//    S=S.next;
//    System.out.println("are you go for another word ?");
//     ch=sc.next().charAt(0);
//
//}
//        for (int i=2; i<20; i++){
//            input=sc.nextLine();
//            S.next=new LList(input);
//            S=S.next;
//        }

// traverse the list
        for (LList s=start; s!=null; s=s.next){
            System.out.print(s.data+" ");
        }

        int counter = 0,num=-1;
        //while (num< wordsList.length){

            for (LList p=start; p!=null; p=p.next,num++) {
                //num++;

                for (LList q=node2; q!=null;q=q.next) {
                    if (p.data.equalsIgnoreCase(q.data)) {
                        check = true;
                        break;
                    }
                }

                if (check) {
                    check = false;
                    continue;}

                for (LList i =start;i!=null;i=i.next) {
                    if (wordsList[num].equals(i.data)){
                        counter++;
                        //new element
                    }
                }
                if (counter>1){
                T.next = new LList(wordsList[num], counter);
                T = T.next;}


                counter=0;
            }

//            if (counter > 1){
//                    for (LList p = node2; p != null; p = p.next) {
//                        if (wordsList[num].equals(p.data))
//                            break;
//                        else {
//                            T.next = new LList(wordsList[num], counter);
//                            T = T.next;
//                        }
//
//                    }
//                    }


//                            num++;
//            counter=0;


        System.out.println("\n\nWords , number of times repeated");
for (LList q=node2; q!=null; q=q.next){
    System.out.print("\n"+q.data+","+q.count);
}

    }}

