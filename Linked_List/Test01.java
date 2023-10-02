package Linked_List;

public class Test01 {

    public static void main(String[] args) {
        int array[]={29,35,45,55,65,75,95};
        int count1=-1;
        for (int i=0; i< array.length; i++){
            count1++;
        }
        System.out.println(count1);
int midElement=(count1/2);
//        if (midElement%2==0){
//
//        }
//        else if(midElement%2!=0) {
//            midElement=midElement+1;
//        }

        System.out.println("Mid element an array is :"+array[midElement]);
        System.out.println("Last emelent is in an array is :"+array[count1]);
    }
}
