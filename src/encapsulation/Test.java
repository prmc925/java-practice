package encapsulation;

public class Test {


    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(100);
        System.out.println(obj.getId());
        obj.setName("Java");
        System.out.println(obj.getName());

        obj.setId(50);
        System.out.println(obj.getId());
        obj.setName("Python");
        System.out.println(obj.getName());

    }
}
