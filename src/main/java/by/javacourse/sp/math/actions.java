package by.javacourse.sp.math;

import by.javacourse.sp.objectsJava.obj.Car;
import by.javacourse.sp.objectsJava.obj.Cat;
import by.javacourse.sp.objectsJava.obj.Tv;

public class actions {

    public static void main(String[] args) {
        Cat[] cat;
        cat = new Cat[1];
        cat[0] = new Cat();
        cat[1] = new Cat();

        cat[0].setName("Kate");
        cat[0].setAge(1);
        cat[0].setColor("black");
        cat[0].setEyes("blue");
        cat[0].setVoice("Meow");

        cat[1].setName("Masha");
        cat[1].setAge(2);
        cat[1].setColor("white");
        cat[1].setEyes("brown");
        cat[1].setVoice("Meow-Meow");


        Tv[] tv;
        tv = new Tv[0];
        tv[0] = new Tv();

        tv[0].setBrand("Samsung");
        tv[0].setModel("5643");
        tv[0].setScreenResolution("1920*1080");
        tv[0].setSize(40);
        tv[0].setWeight(5000);

        Car[] car;
        car = new Car[1];
        car[0] = new Car();
        car[1] = new Car();

        car[0].setBrand("Audi");
        car[0].setModel("S7");
        car[0].setSeats(4);
        car[0].sethP(200);
        car[0].setV(3200);

        car[1].setBrand("Audi");
        car[1].setModel("TT");
        car[1].setSeats(2);
        car[1].sethP(300);
        car[1].setV(4000);

        String a = car[1].getBrand();



        System.out.println(a);
    }

    }
