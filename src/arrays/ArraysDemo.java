package arrays;

public class ArraysDemo {

//    int a = 10;
//    int b = 20;
//    int c = 30;
//    int d = 40;
//    int e = 50;

    //Array Declaration
    int a [];
    int number [];
    String studentName [];

    public static void main(String[] args) {
        // Approach 1
        int x [] = {10,20,30,40,50};
        System.out.println(x[0]);
        System.out.println(x[3]);
        System.out.println(x[1]+x[4]);
        System.out.println(x.length);

        //Approach 2
        int z [] = new int[5];
        z[0] = 100;
        z[1] = 200;
        z[2] = 300;
        z[3] = 400;
        z[4] = 500;

     //   z[5] = 600;
        System.out.println(z[1]);

        String courseName [] = {"Java","C++","C#","Python"};
        System.out.println(courseName[0]);
        System.out.println(courseName[2]);


    }

}
