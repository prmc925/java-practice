package exceptiondemo;

public class UncheckedException {

    public static void division(){
        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Please enter valid number");
        }
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        division();
    }

}
