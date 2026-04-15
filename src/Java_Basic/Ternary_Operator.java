package Java_Basic;

public class Ternary_Operator {
    static void main(String[] args) {


        //      SYNTX ( Condition ) ? true : false ;

        int a = 1;
        int b = 2;

        int max = (a > b) ? a : b ;
        System.out.println("Max is = " + max);

        int min = (a < b)?a:b;
        System.out.println("Min is = " + min);
    }
}

/*

🔹 1. Basic Concept

Ternary operator ka syntax:

condition ? value_if_true : value_if_false;

👉 Matlab:

Agar condition true hai → pehla value
Agar false hai → dusra value
🔹 2. Simple Example
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);

👉 Output: 20

✔ Explanation:

condition: a > b → false
isliye b return hua
🔹 3. If-Else vs Ternary
Normal if-else:
int max;
if (a > b) {
    max = a;
} else {
    max = b;
}
Ternary version:
int max = (a > b) ? a : b;

👉 Same kaam, but short code 😎

🔹 4. Even-Odd Example
int num = 7;

String result = (num % 2 == 0) ? "Even" : "Odd";

System.out.println(result);

👉 Output: Odd

🔹 5. Nested Ternary (Thoda Advanced)
int a = 10, b = 20, c = 15;

int max = (a > b)
            ? (a > c ? a : c)
            : (b > c ? b : c);

System.out.println(max);

👉 Output: 20

✔ Yeh multiple conditions check karta hai

🔹 6. Ternary with String
int marks = 85;

String grade = (marks >= 90) ? "A" :
               (marks >= 75) ? "B" :
               (marks >= 50) ? "C" : "Fail";

System.out.println(grade);
🔹 7. Return Statement mein use
public static int findMax(int a, int b) {
    return (a > b) ? a : b;
}

👉 Direct return kar diya — clean code 👍

🔹 8. Important Rules ⚠️

✔ Condition hamesha boolean hona chahiye
✔ Dono side same type ke hone chahiye (mostly)
✔ Overuse mat karo — readability kharab hoti hai

🔹 9. Kab Use Kare?

✅ Simple decision
✅ Value assign karni ho
❌ Complex logic ho → normal if-else better

🔹 10. Common Mistake ❌
int x = (10 > 5) ? 10 : "Hello"; // ❌ error

👉 Kyunki int aur String mix nahi kar sakte

🔥 Short Summary (Yaad rakhne ke liye)

👉 Ternary = one-line if-else

condition ? true_value : false_value
 */
