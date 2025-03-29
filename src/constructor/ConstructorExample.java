package constructor;

public class ConstructorExample {
    //instance variable, global variable

    int empID;
    String empName;

    public ConstructorExample(int empID, String empName){
           this.empID  =  empID;
           this.empName = empName;
    }

    public static void main(String[] args) {
        ConstructorExample t = new ConstructorExample(10,"Jitendra");
        t.display();
        ConstructorExample t1 = new ConstructorExample(20, "Amit");
        t1.display();
    }

   public void display(){
       System.out.println(empID);//
       System.out.println(empName);
   }


}
