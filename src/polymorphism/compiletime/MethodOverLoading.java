package polymorphism.compiletime;

public class MethodOverLoading {
    /**
     * 1. with different data type
     * 2. with different number of args/params
     * 3. with different squence of arguments
     */
    public void m1(){

    }
    public void m1(int a){

    }
    public void m1(int a, int b){

    }

    public void m1(int a,String name){

    }
    public void m1(String name, int a){

    }

    public void addition(int a, int b){
        int ans = a + b;
    }

    public void addition(int a, int b, int c){
        int ans = a + b + c;
    }


}
