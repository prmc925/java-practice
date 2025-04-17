package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader("file.txt");
        System.out.println("hello");
    }

    public static void readJungleBook(String fileName) throws FileNotFoundException{
        readFile(fileName);
    }

    public static void m1(String bookName) throws FileNotFoundException {
        readFile(bookName);
    }

    public static void main(String[] args) {
        try{
            readJungleBook("Mogli.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
