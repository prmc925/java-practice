package morningchallenge;

/**
 * Created by Jay Vaghani
 */
public class Challenge2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Challenge2 challenge2 = new Challenge2();
        challenge2.productOfTwoNumber(num1, num2);
    }

    public void productOfTwoNumber(int num1, int num2){
        int ans = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + ans);

    }
}
