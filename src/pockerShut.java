import java.util.Random;

public class pockerShut {
        public static void main(String[] args) {
            char suits[] = {'\u2660', '\u2664', '\u2665', '\u2661', '\u2663', '\u2667', '\u2666', '\u2662'};
            String values[] = {"6", "7", "8", "9", "10", "V", "D", "K", "T"};
            String cards[]=new String[36];
            int count =0;
            for (int i=0; i<4; i++){
                for (int j=0; j< values.length; j++)
                    cards[count++] = suits[i]+values[j];
            }
            System.out.println(java.util.Arrays.toString(cards));

            Random rnd = new Random();
            for (int i =0; i< cards.length*2; i++){
                int k= rnd.nextInt(cards.length);
                int m = rnd.nextInt(cards.length);
                String temp = cards[m];
                cards[m] = cards[k];
                cards[k] = temp;

            }
            System.out.println(java.util.Arrays.toString(cards));
        }
    }


