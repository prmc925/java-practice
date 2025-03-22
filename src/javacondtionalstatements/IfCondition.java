package javacondtionalstatements;

public class IfCondition {

    public static void isEligibleForVote(){
        int age = 20;

        if (age>=18){
            System.out.println("Age is "+age+". Eligible for vote");
        }
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        isEligibleForVote();
    }

}
