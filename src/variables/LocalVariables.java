package variables;

public class LocalVariables {

    /**
     * Local varibale : declared inside method or inside the constructor
     * Scope          : within the method
     * memory allocation : when method starts
     * memory         : stack
     *
     */
    public static void main(String[] args) {
       // a is a local variable
        int a =5;
        System.out.println(a);
        a = 10;
        System.out.println(a);

    }

    public void myMethod(){
        // local variables
        int x = 50;
        System.out.println(x);
        boolean result = true;
    }


}
