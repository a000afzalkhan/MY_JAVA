package LeetCode;

public class Maximum_69_number_1323 {
    static void main(String[] args) {

    }
    public int maximum69Number (int num) {
        int temp = num; //original number ko touch nahi karna 👉 isliye copy bana li

        int base = 1; //👉 ye batata hai kaunsa place hai
                      // 1 → units
                      // 10 → tens
                      // 100 → hundreds

        int pos = -1;   //👉 yahan store karenge 6 kaha mila

        while(temp>0){  //👉 jab tak number khatam nahi hota

            if(temp%10==6){ //👉 “mil gaya 6!”

                pos=base;  //👉 uska place store kar liya
            }
            temp/=10; //👉 next digit pe jao

            base*=10; //👉 place bhi update karo
            
        }
        return pos==-1?num:num+(3*pos);  //👉 kyun 3? 6 → 9 difference = 3

    }

}

/*

right se check karo 👀
6 mile → yaad rakho 🧠
last wala = leftmost 6 😎
usme +3 add karo 💥
 */
