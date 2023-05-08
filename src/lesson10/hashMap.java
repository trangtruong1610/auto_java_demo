package lesson10;

import java.util.HashMap;
import java.util.Map;


public class hashMap {
    public static void main(String[] args) {
        // Declare HashMap
        Map<Integer, String> myHashMapList = new HashMap<>();

        // add data into HashMap
        myHashMapList.put(111, "student 1");
        myHashMapList.put(112, "student 2");

        // get value of HashMap
        System.out.println("name of student 111 is: " + myHashMapList.get(111));
        System.out.println("================");

        // get key of HashMap
        myHashMapList.forEach((key, value) -> {
            if (value.equals("student 2")) {
                System.out.print("key of student 2 is :" + key + "\n");
            }
        });
        System.out.println("================");

        // replace value
        myHashMapList.replace(111, "student a");
        System.out.println("name of student 111 is: " + myHashMapList.get(111));
        System.out.println("================");

        // remove value
        System.out.println("list before remove: " + myHashMapList.size());
        myHashMapList.remove(111);
        System.out.println("list after remove: " + myHashMapList.size());
        System.out.println("================");

        // nested hashMap
        Map<Integer, Map<String, String>> myNestedList = new HashMap<>();
        Map<String, String> student1 = new HashMap<>();
        student1.put("name", "trang");
        student1.put("address", "89 binh thoi");

        Map<String, String> student2 = new HashMap<>();
        student2.put("name", "su");
        student2.put("address", "tran nhan ton");

        myNestedList.put(1, student1);
        myNestedList.put(2, student2);

        System.out.println("name of student 1 is: " + myNestedList.get(1).get("name"));
        System.out.println("address of student 2 is: " + myNestedList.get(2).get("address"));
        System.out.println("================");

        // lambada
        myNestedList.forEach((key, value) -> {
            System.out.println(myNestedList.get(key).get("name"));
            System.out.println(myNestedList.get(key).get("address"));
        });

    }
}
