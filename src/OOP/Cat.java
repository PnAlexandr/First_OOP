package OOP;

import java.util.Arrays;

/**
 * Created by Pavlovan on 26.12.2016.
 */
public class Cat {
    static class Cet{
        String name;
        String color;
        int age;
        String[] eatenMices =new String[5];

        public  void meaw(){
            System.out.println("Meaw!");
        }
        void  jump(){
            if(age<5) System.out.println("I jump");
            else
                System.out.println("I'm an abut go home");
        }
    }

    public static void main(String[] args) {
        Cet c0;
        c0 = new Cet();
        c0.age=5;
        Cet c1 =new Cet();
        c1.age=1;
        c1.name="Barsik";
        c1.color="Black";
        c1.meaw();
        c1.jump();
        c0.jump();


        System.out.println(c0.age);
        System.out.println(c1.age);
        System.out.println(Arrays.toString(c1.eatenMices));

    }
}
