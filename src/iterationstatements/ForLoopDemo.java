package iterationstatements;

public class ForLoopDemo {

    public static void main(String[] args) {

//        for(int i=5;i<=10; i++){
//            System.out.println(i);
//        }

//        for(int i =10; i>=1; i--){
//            System.out.println(i);//10,9,..,1
//        }

        System.out.println("Print odd number between 1 to 10");
        //1,3,5,7,9
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0){
                System.out.println(i);//1,3
            }
        }

        System.out.println("Print even number between 1 to 20");
        //2,4,6
        for(int i=1; i<=20; i++){

            if(i%2==0){
                    System.out.println(i);

            }
        }

    }
}
