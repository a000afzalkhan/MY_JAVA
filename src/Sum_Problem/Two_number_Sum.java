package Sum_Problem;

public class Two_number_Sum {
    static void main(String[] args) {

        int x = 243;
        int y = 564;

        int z = x+y;  //  8 0 7

        System.out.println(z);

        int reversed = 0;

        while(z!=0){
         //   int d =z%10;
           reversed=reversed*10+(z%10);
//            System.out.println(z);
            z=z/10;
        }
       System.out.println(reversed);

    }
}
