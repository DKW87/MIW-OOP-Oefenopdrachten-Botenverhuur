package controller;

import model.*;

import java.time.LocalDate;

public class BotenverhuurLauncher {

    public static void main(String[] args) {

        System.out.println("Dit is de uitwerking van Danny Kwant met studentnummer 500955184.\n");

        Klant dannyKlant = new Klant("Danny", "mijn@email.nl", true);
        Klant gerkeKlant = new Klant("Gerke");

        Zeilboot mijnZeilboot = new Zeilboot("De Engel", -7);
        Zeilboot mijnZeilboot2 = new Zeilboot("De Duivel", 99);
        Zeilboot mijnZeilboot3 = new Zeilboot("De Barbaar", 16);
        Zeilboot mijnZeilboot4 = new Zeilboot("De Heiligman", 15);

        Motorboot mijnMotorboot = new Motorboot("De Snelheidsduivel", 15, 180);
        Motorboot mijnMotorboot2 = new Motorboot("De Langzame Heiligman", 30, 15);
        Motorboot mijnMotorboot3 = new Motorboot("De Agressieve Barbaar", 9, 150);
        Motorboot mijnMotorboot4 = new Motorboot("De Negatieve Engel", -33, 30);

        System.out.println();
        Verhuur mijnVerhuur2 = new Verhuur(gerkeKlant, LocalDate.of(2024, 4, 3), 10);
        mijnVerhuur2.voegBootToe(mijnZeilboot2);
        mijnVerhuur2.voegBootToe(mijnZeilboot4);
        mijnVerhuur2.voegBootToe(mijnZeilboot3);
        mijnVerhuur2.voegBootToe(mijnMotorboot);
        mijnVerhuur2.voegBootToe(mijnMotorboot3);

        System.out.println();
        System.out.println(mijnVerhuur2);

        Verhuur mijnVerhuur = new Verhuur(dannyKlant, LocalDate.of(2024, 5, 5), 5);
        mijnVerhuur.voegBootToe(mijnZeilboot2);
        mijnVerhuur.voegBootToe(mijnZeilboot4);
        mijnVerhuur.voegBootToe(mijnZeilboot3);
        mijnVerhuur.voegBootToe(mijnMotorboot);
        mijnVerhuur.voegBootToe(mijnMotorboot3);

        System.out.println(mijnVerhuur);


    }

}