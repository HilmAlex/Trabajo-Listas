package com.company;

import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static void showMenu(Agenda agenda){
        String menu;
        byte option;
        Scanner scanner = new Scanner(System.in);
        menu = "APP LISTA DE ACTIVIDADES";
        menu += "\n Seleccion una opcion: ";
        menu += "\n1. Ver actividades realizadas";
        menu += "\n2. Ver actividades por realizadas";
        menu += "\n3. Añadir actividad";
        menu += "\n4. Marcar una actividad como realizada";
        menu += "\n0. Salir";

        do {
            System.out.println(menu);
            option = scanner.nextByte();
            switch (option){
                case 1: agenda.verActividadesRealizadas();
                    break;
                case 2: verActividadesPorRealizar();
                    break;
                case 3: añadirActividad();
                    break;
                case 4: marcarActividadComoRealizada();
                    break;
                case 0:
                    System.out.println("Thanks for using Amazon Viewer");
                    break;
            }
        } while (option != 0);
    }

    private static void añadirActividad() {

    }

    private static void verActividadesPorRealizar() {

    }

    private static void verActividadesRealizadas() {

    }

    private static void marcarActividadComoRealizada(){

    }

}
