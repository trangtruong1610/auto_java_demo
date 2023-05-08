package lesson3;

public class ForLoop {
    public static void main(String[] args) {
        int maxMistakesAllowed = 3;
        for (int mistakesNumber = 0; mistakesNumber < maxMistakesAllowed; mistakesNumber++){
            System.out.printf("Can play outside because mistake is %d%n", mistakesNumber);
        }
    }
}
