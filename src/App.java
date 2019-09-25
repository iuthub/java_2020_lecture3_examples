import java.util.ArrayList;

public class App {
    public static void main(String[] args){
////        Craps.start();
//        DeckOfCards myDeckOfCards = new DeckOfCards();
//
//        myDeckOfCards.shuffle();
//
//        for(int i=0; i<=52; i++){
//            System.out.printf("%-19s", myDeckOfCards.dealCard());
//
//            // newline every fourth card
//            if(i % 4 == 0)
//                System.out.println();
//        }

//        int[] arr = {23,45,34,13};
//
////        modifyElement(arr[0]);
//        modifyArray(arr);
//
////        for(int i=0;i<arr.length;i++){
////            arr[i]=1;
////        }
//        for(int i:arr){
//            System.out.println(i);
//        }
//
//        System.out.println(average("Hello", 12,34, 53,23,33));
//
//        ArrayList<String> lst= new ArrayList<String>();
//        lst.add("Hello");
//        lst.add(0,"World");
//        System.out.println(lst.size());

        estimatePI(0.00001);

    }

    private static void modifyArray(int[] arr2){
        arr2[0] = 0;
    }

    private static void modifyElement(int el){
        el = 0;
    }

    private static double average(String msg, double... nums){
        double total = 0.0;

        for(double i:nums){
            total +=i;
        }

        return total/nums.length;
    }

    private static double estimatePI(double precision){
        double last_pi = 0;
        double pi = 4.0;
        int i=0;
        int k=1;
        while(Math.abs(pi - last_pi)>=precision){
            k+=2;
            i++;
            last_pi = pi;
            pi += Math.pow(-1,i)*(4.0/k);
        }

        System.out.println(pi);
        System.out.println(i);

        return pi;
    }

}
