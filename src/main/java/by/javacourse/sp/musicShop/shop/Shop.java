package by.javacourse.sp.musicShop.shop;

import by.javacourse.sp.musicShop.instruments.GuitarModels;
import by.javacourse.sp.musicShop.instruments.Guitars;
import by.javacourse.sp.musicShop.instruments.Pianos;

public class Shop {

    public static void main(String[] args) {

        Guitars guitarsAll = new Guitars();
        GuitarModels gibsonLesPaul = new GuitarModels();
        gibsonLesPaul.GibsonLesPaul();

        GuitarModels gibsonSD = new GuitarModels();
        gibsonSD.gibsonSD();


        GuitarModels[] guitars = {gibsonLesPaul, gibsonSD};

        guitarsAll.guitarsInfo();

    }
}
