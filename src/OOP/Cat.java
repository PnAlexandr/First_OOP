package OOP;

/**
 * Created by Pavlovan on 26.12.2016.
 */
public class Cat {
    static class Cet{
        String name;
        String color;
        int age;
        String[] eatenMices =new String[5];
    }

    public static void main(String[] args) {
        Cet c0;
        c0 = new Cet();
        c0.age=5;
        Cet c1 =new Cet();
        c1.age=1;
        c1.name="Barsik";
        c1.color="Black";



        System.out.println(c0.age);
        System.out.println(c1.age);
        System.out.println();

    }
}
