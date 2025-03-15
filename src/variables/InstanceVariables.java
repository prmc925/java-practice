package variables;

public class InstanceVariables {

    int a = 10;
    String name = "Prime Testing";

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);
        obj.m1();

    }

    //instance method or non static method
    public void m1(){
        System.out.println(a);
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(name);

    }


}
