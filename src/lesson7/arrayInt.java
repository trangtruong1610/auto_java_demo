package lesson7;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class arrayInt {
    public static void main(String[] args) {
        // Type mush be Interger
        Integer arrayInt [] = {1, 5, 8, 4, 9, 11, 22, 33, 55};
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] % 2 == 0){
                System.out.printf("this is even number %d%n", arrayInt[i]);
            }else {
                System.out.printf("this is odd number %d%n", arrayInt[i]);
            }
        }
        System.out.println(Arrays.toString(arrayInt));

        // sort desc
        Arrays.sort(arrayInt, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrayInt));

    }
}
