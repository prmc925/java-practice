package iterationstatements;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int a = 1;
        while (a<=10){
            System.out.println(a);//1,2,..,10
            a++;
        }
        System.out.println("Out of the while loop");

        boolean ans = true;
        while (ans){
            System.out.println("Prime");
            break;
        }
    }
}
