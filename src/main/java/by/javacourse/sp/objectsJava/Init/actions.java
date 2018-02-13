package by.javacourse.sp.objectsJava.Init;


import by.javacourse.sp.objectsJava.obj.Car;
import by.javacourse.sp.objectsJava.obj.Cat;
import by.javacourse.sp.objectsJava.obj.Tv;

public class actions {

    public static void main(String[] args) {
        Cat[] myCats;
        myCats = new Cat[1];

        myCats[0] = new Cat();
        myCats[1] = new Cat();

        myCats[0].setName("Kate");
        myCats[0].setAge(1);
        myCats[0].setColor("black");
        myCats[0].setEyes("blue");
        myCats[0].setVoice("Meow");

        myCats[1].setName("Masha");
        myCats[1].setAge(2);
        myCats[1].setColor("white");
        myCats[1].setEyes("brown");
        myCats[1].setVoice("Meow-Meow");


        Tv[] myTv = new Tv[0];

        myTv[0] = new Tv();

        myTv[0].setBrand("Samsung");
        myTv[0].setModel("5643");
        myTv[0].setScreenResolution("1920*1080");
        myTv[0].setSize(40);
        myTv[0].setWeight(5000);

        Car[] myCar = new Car[1];
        myCar[0] = new Car();
        myCar[1] = new Car();

        myCar[0].setBrand("Audi");
        myCar[0].setModel("S7");
        myCar[0].setSeats(4);
        myCar[0].sethP(200);
        myCar[0].setV(3200);

        myCar[1].setBrand("Audi");
        myCar[1].setModel("TT");
        myCar[1].setSeats(2);
        myCar[1].sethP(300);
        myCar[1].setV(4000);

        String a = myCar[1].getBrand();

        System.out.println(a);
    }

    }
