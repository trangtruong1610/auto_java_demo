package lesson11;

public class RobotCat {
    private int id;
    private String dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void run(){
        System.out.println("The cat is running....");
    }

    public String name(){
        return "Doraemon";
    }

    public String tryTodoST(){
        return getDob() + " aaa";
    }

    public void sayHello(){
        System.out.println("I'm a robot cat");
    }

}
