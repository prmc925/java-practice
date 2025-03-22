package methodtypes;

public class WithReturnTypeWithParameter {

    public static int addition(int a, int b){
        int result = a + b;
        return result;
    }

    public String name(String courseName){
      return courseName;
    }

    public static void main(String[] args) {
        int ans = addition(5,10);
        System.out.println(ans);
        System.out.println(addition(10,20));

        WithReturnTypeWithParameter obj = new WithReturnTypeWithParameter();
        obj.name("Java");
        System.out.println(obj.name("Java"));
    }

}
