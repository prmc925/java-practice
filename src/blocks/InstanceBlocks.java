package blocks;

public class InstanceBlocks {
    String empName;

    // Instance block
    {
        System.out.println("This is a instance block");
        empName = "Rocky";
    }

    public InstanceBlocks(){
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {
        InstanceBlocks t = new InstanceBlocks();
    }

}
