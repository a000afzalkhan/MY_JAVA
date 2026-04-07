package CodingGame;
import java.util.Scanner;

public class DestroyHighest_mountain {
    static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Height of Mountain = ");
        
//        while(true){
            int maxHeight = 0;
            int maxIndex = 0;

            for (int i = 0; i <8 ; i++) {
                int mountain = s.nextInt();
                if(maxHeight<mountain){
                    maxHeight=mountain;
                    maxIndex = i;
                }
            }
            System.out.println(maxIndex);
        }
    }

