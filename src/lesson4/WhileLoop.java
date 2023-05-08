package lesson4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter a number : ");
        while ((inputNumber=scanner.nextInt()) != 0){
            System.out.printf("You have just input a number = %d%n", inputNumber);
            if (inputNumber%2 == 0){
                System.out.println("You have input an even number");
                System.out.println("Loop will break");
                break;
            }else {
                System.out.println("You just input an odd number");
                System.out.println("Pls enter even number : ");

            }
        }
    }
}
