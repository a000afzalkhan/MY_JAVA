package CodingGame;

import java.util.Scanner;

public class Ben_Game {
    static void main(String[] args) {
        Scanner ben = new Scanner(System.in);
        int P = ben.nextInt(); //Amount Earn
        int H = ben.nextInt(); //Working Hour
        int R = ben.nextInt(); //Rent

        if(P*H>R){    // If he has afforded the rent with extra money
            System.out.println("YES");
        } else if(P*H<R){
            System.out.println("NO");
        }else {
            System.out.println("BARELY");
        }


    }
}
/*
Ben is very broke. He cannot afford rent, so he is going to get a job this month so he won't be evicted.
The job he is going to get pays P per hour, and he works H hours, and his rent costs R each month.
Output YES if Ben can afford his rent with extra money, NO if he cannot afford his rent,
and BARELY if he can afford his rent with no extra money
Input
Line 1: an integer P - the amount Ben earns each hour he works
Line 2: an integer H - the number of hours Ben works per month
Line 3: an integer R - the monthly rent Ben must pay Input
20
100
600
Output
YES solve in java
 */