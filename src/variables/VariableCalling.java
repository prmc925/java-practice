package variables;

public class VariableCalling {

    String name = "Prime"; //Instance variable
    static int number = 100; //static variable

    public static void main(String[] args) {
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        System.out.println(number);
        System.out.println(VariableCalling.number);
        obj.m1();//calling m1 method inside main method
    }

    public void m1() {
        VariableCalling t = new VariableCalling();
        System.out.println(t.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);

    }

}
