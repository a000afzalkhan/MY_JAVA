package Searching_ALGO;

public class LinerSearching {
    static void main(String[] args) {
        int []arr = {12,45,7,23,56};
        int tar = 56;

        int found = -1;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==tar){
                found=i;
                break;
             }
        }

        if(found == -1){                    //( found != -1 ) alternate
            System.out.println("not found");
        }else {
            System.out.println("found at = " + found);
        }

        }

    }

