package polymorphism.runtime;

public class ChildClass extends ParentClass{

    public void calculation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

    public void addition(int x, int y){
        System.out.println(x+x);
        System.out.println(y+y);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.calculation(10,20);
        obj.addition(2,5);
    }
}
