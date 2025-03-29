package javacondtionalstatements;

public class SwitchStatements {

    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("It is my favourite day");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sarurday");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("It is a last day of the week");
                break;
            default:
                System.out.println("Invalid week number");
        }


    }

}
