package lesson7;

import java.util.Scanner;

public class arrayString {
    public static void main(String[] args) {
        String arrayString [] = {"trang", "su", "Jessi"};
        System.out.println("Pls enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (String s : arrayString) {
            if (name.equals(s) && name.equals("Jessi")) {
                System.out.println("This is my crush");
                break;
            }
        }

    }
}
