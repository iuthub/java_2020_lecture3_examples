import java.security.SecureRandom;

public class App {
    public static void main(String[] args){
//        SecureRandom rnd = new SecureRandom();
//        System.out.println(1+rnd.nextInt(6));//1 to 6
//        int count=0;
//        for(int i=0;i<1000;i++) {
//            if(Craps.start()){
//                count+=1;
//            }
//        }
//        System.out.println(count);


        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
//
//        for(int c = 0; c<DeckOfCards.NUMBER_OF_CARDS;c++){
//            System.out.printf("%-19s", deckOfCards.dealCard());
//            if (c % 4 == 0) System.out.println();
//        }

//        int[] arr = {12, 34, 56, 76};
////        for(int i: arr){
////            i=0;
////        }
//        for(int i=0;i<arr.length;i++){
//            arr[i]=0;
//        }
//
//        for(int i: arr){
//            System.out.println(i);
//        }


//        int[] arr = {12, 34, 56, 76};
//        modifyArray(arr);
//        for(int i: arr){
//            System.out.println(i);
//        }
//
//        estimatePI(0.00001);

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



}
