package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String mensaje) {
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public void saludar(String nombre) {
        System.out.println(nombre);
    }
}
