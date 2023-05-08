package lesson11;

import java.util.Date;

public class testRobotCat {
    public static void main(String[] args) {
        RobotCat robotCat = new RobotCat();
        robotCat.run();
        System.out.println(robotCat.name());
        System.out.println("=============");

        // set value for class
        robotCat.setId(1);
        robotCat.setDob(new Date().toString());

        // get value from class
        System.out.println(robotCat.getId());
        System.out.println(robotCat.getDob());

        System.out.println(robotCat.tryTodoST());

        System.out.println("=============");
        robotCat.setId(222);
        System.out.println(robotCat.getId());
    }
}
