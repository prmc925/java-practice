package methodtypes;

public class WithReturnTypeNoParameter {

    public static void main(String[] args) {
        int result = addition();
        System.out.println(result);
        System.out.println(addition());
        WithReturnTypeNoParameter obj = new WithReturnTypeNoParameter();
        System.out.println(obj.myName());
        System.out.println(isRight());

    }
    public static int addition() {
        int a = 10;
        int b = 20;
      //  String name = "Prime";
        int ans = a + b;
        return ans;
    }
    public String myName(){
        String firstName = "Amit";
        String lastName = "Kathrotiya";
        String fullName = firstName+" "+lastName;
        return fullName;
    }

    public static boolean isRight(){
        boolean a = true;
        boolean b = false;
        return a;
    }




}
