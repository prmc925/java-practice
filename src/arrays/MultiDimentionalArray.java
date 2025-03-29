package arrays;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        int a [][] = new int[2][3];

        a[0][0] = 100;
        a[0][1] = 200;
        a[0][2] = 300;
        a[1][0] = 400;
        a[1][1] = 500;
        a[1][2] = 600;
        System.out.println(a[0][1]);

        int b [][] = {{100,200,300},{400,500,600}};

        System.out.println(b[1][1]);


    }
}
