package variables;

/**
 * static variable - class
 * scope           - within the class
 * memory allocation - class loaded
 * store - non heap memory
 */

public class StaticVariables {
    //declaring static variables
  static int a = 10;
  static String name = "Prime Testing";

    public static void main(String[] args) {
        System.out.println(a);
        //calling static variable with class name
        System.out.println(StaticVariables.a);
        System.out.println(name);
        System.out.println(StaticVariables.name);
        StaticVariables obj = new StaticVariables();
        //calling instance method m1 with object
        obj.m1();

    }

    //declaring instance method
    public void m1(){
        System.out.println(StaticVariables.a);

    }

}
