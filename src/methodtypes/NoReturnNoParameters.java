package methodtypes;

public class NoReturnNoParameters {

    public static void main(String[] args) {
        addition();
        NoReturnNoParameters obj = new NoReturnNoParameters();
        obj.subtraction();
    }
    //No return type, no parameter
    public static void addition(){
        int a =5;
        int b = 10;
        int ans = a+b;
        System.out.println("Additon of two numbers "+a+ " and "+b+ " is "+(a+b));
    }

    public void subtraction(){
        int a =10;
        int b = 2;
        int ans = a -b;
        System.out.println("Subtraction of two number "+a+" and "+b+ " is "+(a-b));
    }


    //multiplication
    public void multiplication(){

    }

    //devision
    private void division(){

    }


}
