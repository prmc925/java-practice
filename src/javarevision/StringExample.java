package javarevision;

/**
 * Created by Jay Vaghani
 */
public class StringExample {
    public static void main(String[] args) {
        String date = "12_April_2025";
        String[] a = date.split("_"); // String[] a = ["16", "April", "2025"]
        String day = a[0];
        String month = a[1];
        String year = a[2];
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
