package morningchallenge.challenge4;

/**
 * Created by Jay Vaghani
 */

/**
 * Challenge-4
 *
 * Write a java program using the following requirement.
 * 1.Create a package with name 'challenge4' inside morningchallenge package
 * 2.Create a Java class with name PrintMyName in to challenge4 package
 * 3.Create a Method name with printName() no return type with two params 1. int howMany and 2. String myName
 * 4.Inside a printName() method use for loop to print the name according to howMany value.
 * 5.Create a Java class Test inside challenge4 package.
 * 6.Declare inheritance relationship between two class.
 * 7.Create a main method in Test class.
 * 8.Create a Object of PrintMyName class in to main method and call the printName() method. and pass the
 *   value 15 and your name.
 * 9.Run the program
 */
public class PrintMyName {

    public void printName(int howMany, String myName){
        for (int i = 0; i < howMany; i++) {
            System.out.println(myName);
        }
    }
}
