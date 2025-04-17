package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList <String> carList = new ArrayList();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Toyota");
        carList.add("Audi");


        System.out.println(carList.size());
        System.out.println(carList.get(1));
        System.out.println(carList.contains("Honda"));

        for (String car  : carList){
            System.out.println(car);
        }

        ArrayList <Object> list = new ArrayList();

        list.add("Java");
        list.add(10);
        list.add(true);

        List <String> studentName = new ArrayList();

    }

}
