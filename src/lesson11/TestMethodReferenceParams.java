package lesson11;

import java.util.Scanner;

public class TestMethodReferenceParams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which robot do you want to see ? dog or cat ?");

        String robotName = scanner.next();
        TestMethodReferenceParams testMethodReferenceParams = new TestMethodReferenceParams();

        switch (robotName) {
            case "cat":
                testMethodReferenceParams.triggerHelloGreetingsRobotCat(new RobotCat());
                break;
            case "dog":
                testMethodReferenceParams.triggerHelloGreetingsRobotDog(new RobotDog());
                break;
            default:
                System.out.println("not in options");
        }
    }
    public void triggerHelloGreetingsRobotCat(RobotCat robotCat){
        robotCat.sayHello();
    }

    public void triggerHelloGreetingsRobotDog(RobotDog robotDog){
        robotDog.sayHello();
    }
}
