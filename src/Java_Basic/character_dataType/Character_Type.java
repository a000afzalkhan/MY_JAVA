package Java_Basic.character_dataType;

public class Character_Type {
    static void main(String[] args) {

        char x ='a';
        char y = 'f';
        char z = 'z';
        char e ='a';
        char w = 'l';

        char name = (char)('a'+'f'+'z'+'a'+ 'l');

//        System.out.println(x + " " + y + " " + z + " " + e + " " + w);
//        System.out.println(name);  // Unicode 526 is Ȏ   because [ ASC II ] code

        String name2 ="Afzal";
        String name3 = "aFZAL";

//        if(name2.charAt(0) != 'A'){
//            System.out.println("Not present");
//        }else {
//            System.out.println("Present");
//        }

//        if(name2.equals(name3)){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not equal");
//        }

        char ch ='a';
       // ch= ch +1 ;
        System.out.println(ch);



    }
}
