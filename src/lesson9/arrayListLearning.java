package lesson9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListLearning {
    public static void main(String[] args) {
        List<Integer> myNumberList = new ArrayList<Integer>();
        List<String> myStringList = new ArrayList<String>();

        // convert array to ArrayList
        Float [] myFloatArray = {1.2f, 1.3f, 1.4f};
        List<Float> myFloatList = Arrays.asList(myFloatArray);

        // Add, replace, delete element in arrayList
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++){
            myNumberList.add(secureRandom.nextInt());
        }
        System.out.println(myNumberList);
        System.out.println("===============");

        // get value by index
        for (int i = 0; i < myNumberList.size(); i++){
            System.out.println(myNumberList.get(i));
        }
        System.out.println("===============");

        // get value in list
        for (int i : myNumberList){
            System.out.println(i);
        }
        System.out.println("===============");

        //add element into arrayList
        myNumberList.add(0, 112233);
        System.out.println(myNumberList);
        System.out.println("===============");

        // replace element in arrayList
        myNumberList.remove(1);
        myNumberList.add(1, 334455);
        System.out.println(myNumberList);
        System.out.println("===============");

        // delete element in arrayList
        myNumberList.remove(myNumberList.size() - 1);
        System.out.println(myNumberList);
        System.out.println("===============");

        // lamba
        myNumberList.forEach(value -> {
            System.out.println(value);
        });
        System.out.println("===============");

        //  isEmpty
        System.out.println("My numberList is empty " + myNumberList.isEmpty());
    }
}
