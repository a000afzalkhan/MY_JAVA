package Basic_Understand;

public class Even_Number {
            // R E C U R S I O N  -  M E T H O D
        static  int Evn(int e){
            if(e  == 0){
                return 1;
            }
            if(e == 1){
                return 0;
            }
            return Evn(e - 2);
        }






    static void main() {
            // All Even number 1 to 20

     //   for (int i = 2; i <=20 ; i++) {
//            boolean isEven = true;
//
//            for (int j = 2; j < i; j++) {
//                if( i % j == 1 ){
//                    isEven=false;
//                }
//                break;
//            }
//            if(isEven){
//                System.out.print (i + " ");
//            }
//     if (i % 2 == 1 ){
//         System.out.print(i + " ");
//     }


        int result = Evn(7);
        if(result ==1){
            System.out.println("Even number ");
           }
        else{
            System.out.println("Number is Odd");
        }
        }
    }

