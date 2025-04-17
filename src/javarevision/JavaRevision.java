package javarevision;

/**
 * Created by Jay Vaghani
 */
public class JavaRevision {
    String name;
    int value;

    public JavaRevision(){
        System.out.println("No Arg Cons");
    }

    public JavaRevision(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public int getValue(){
        return this.value;
    }

    public static JavaRevision getInstance(){
        JavaRevision j = new JavaRevision();
        return j;
    }

    public boolean isTeen(){
        boolean teen = false;
        return teen;
    }

    public static void main(String[] args) {
        JavaRevision j = getInstance();
        JavaRevision j1 = new JavaRevision("Jay", 123);
        String name = j.getName();
        System.out.println(j1.getName());
        System.out.println(j1.getValue());
    }
}
