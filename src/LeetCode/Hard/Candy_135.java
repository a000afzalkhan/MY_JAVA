package LeetCode.Hard;

public class Candy_135 {
    static void main(String[] args) {

    }
//    public int candy(int[] ratings){
//
//    }
}



/*

 public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Step 1: Everyone gets at least 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to Right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum candies
        int total = 0;
        for (int candy : candies) {
            total += candy;
        }

        return total;
 */


/*

                                   OPTIMIZE SOLUTION



   public int candy(int[] ratings) {
    int n = ratings.length;
    int candies = 1;

    int up = 0, down = 0, peak = 0;

    for (int i = 1; i < n; i++) {
        if (ratings[i] > ratings[i - 1]) {
            up++;
            peak = up;
            down = 0;
            candies += 1 + up;
        }
        else if (ratings[i] < ratings[i - 1]) {
            up = 0;
            down++;
            candies += 1 + down;

            if (down > peak) {
                candies += 1;
            }
        }
        else {
            up = down = peak = 0;
            candies += 1;
        }
    }

    return candies;
}

 */
