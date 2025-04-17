package javarevision;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */
public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> colourList = createArrayList();
        System.out.println(colourList);
        for (String colour : colourList){
            System.out.println(colour);
        }

        boolean result = checkColourIsAvailableInList(colourList, "red");
        System.out.println(result);
    }

    public static boolean checkColourIsAvailableInList(ArrayList<String> list, String colourName){
        for (String colour : list){
            if (colour.equals(colourName)){
               return true;
            }
        }
        return false;
    }

    public static ArrayList<String> createArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Green");
        list.add("White");
        list.add("Red");
        list.add("Black");
        list.add("Purple");
        return list;
    }
}
