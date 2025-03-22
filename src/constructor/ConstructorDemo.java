package constructor;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Zero param constructor");
    }

    public ConstructorDemo(int a){
        System.out.println("1 param constructor");
    }

    public ConstructorDemo(int a, int b){
        System.out.println("2 param constructor");
    }

    public ConstructorDemo(String name){
        System.out.println("1 string data type param constructor "+name);
    }

    public void addition(){
        System.out.println("this is a method");
    }

    public static void main(String[] args) {
        ConstructorDemo t = new ConstructorDemo();
        ConstructorDemo t1 = new ConstructorDemo(10);
        ConstructorDemo t3 = new ConstructorDemo(10, 20);
        ConstructorDemo t2 = new ConstructorDemo("Prime");
        t.addition();
        t1.addition();
    }

}
