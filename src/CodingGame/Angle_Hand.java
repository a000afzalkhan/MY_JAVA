package CodingGame;

public class Angle_Hand {
    static void main(String[] args) {

    }
}
/*
Given a time, output the angles of the two hands.
Input
Line 1: Time in hh:mm format.
Output
Line 1: Angle of Hour hand.
Line 2: Angle of Minute hand.
Constraints
Time is given in 24-hour format.
0/12 o'clock is 0°.
Example
Input
00:00
Output
0
0 solve in java



import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        String[] parts = line.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        // Convert to 12-hour format
        hour = hour % 12;

        // Minute hand angle
        int minuteAngle = minute * 6;

        // Hour hand angle
        double hourAngle = hour * 30 + minute * 0.5;

        // Print hour angle (avoid .0 if integer)
        if (hourAngle == (int) hourAngle) {
            System.out.println((int) hourAngle);
        } else {
            System.out.println(hourAngle);
        }

        // Print minute angle
        System.out.println(minuteAngle);
    }
}



Gemini said
Yeh sawal aapse basically yeh puch raha hai ki ek analog clock (kaante waali ghadi) mein kisi khaas samay par dono suiyan (hands) kitne degree ke angle par hongi.

Iska logic samajhne ke liye ghadi ko ek circle ki tarah dekho:

1. Clock ka Structure
Ek pura circle 360
∘
  ka hota hai.

Minute Hand (Badi Sui): Yeh 60 minutes mein ek chakkar pura karti hai.

Toh 1 minute mein kitna ghumegi? 360/60=6
∘
 .

Hour Hand (Choti Sui): Yeh 12 ghante mein ek chakkar pura karti hai.

Toh 1 ghante mein kitna ghumegi? 360/12=30
∘
 .

2. Main Twists (Jo dhyan rakhna hai)
Is question mein do zaroori baatein hain:

Hour hand sirf ghante par nahi rukti: Jab minute hand chalti hai, toh hour hand bhi thoda-thoda aage sarakti hai.

Agar 12:30 ho raha hai, toh hour hand exact 12 par nahi hogi, balki 12 aur 1 ke beech mein hogi.

Iska calculation: 0.5
∘
  per minute (kyunki 30
∘
  / 60 min = 0.5).

24-hour format: Question mein time 13:00 ya 21:00 bhi ho sakta hai. Par ghadi toh 12 wali hi hoti hai, isliye humein hours % 12 karna padta hai taaki humein 1 se 12 ke beech ki value mile.

3. Example se samjho
Maano input hai 03:30

Minute hand kahan hogi?
30 minutes beet chuke hain. Ek minute mein 6
∘
 , toh 30×6=180
∘
 . (Yeh seedha niche 6 par hogi).

Hour hand kahan hogi?
3 baje tak woh 3×30=90
∘
  chal chuki thi. Lekin upar se 30 minutes aur beet gaye, toh woh thoda aur aage badhi: 30×0.5=15
∘
 .
Total angle = 90+15=105
∘
 .

Output Kya Dena Hai?
Aapko do lines print karni hain:

Pehli line mein Hour hand ka angle.

Doosri line mein Minute hand ka angle.

Example 00:00 par dono 12 par hoti hain, isliye output 0 aur 0 aata hai.

Kya aapko coding ka logic (Java waala part) clear hai ya usmein koi line samajhni hai?






 */
