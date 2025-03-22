package methodtypes;

public class NoReturnWithParameter {

    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println(answer);
    }

    //printName
    public static void printName(String name) {
        System.out.println("Name is " + name);
    }

    //multiplication
    public void multiplication(int a, int b){
        int answer = a * b;
        System.out.println(answer);
    }

    public static void main(String[] args) {
        addition(10, 20);
        addition(20, 30);
        addition(100, 200);
        printName("Prime");
        printName("Amit");

        NoReturnWithParameter obj = new NoReturnWithParameter();
        obj.multiplication(10,20);
        obj.multiplication(5,6);
    }
}
