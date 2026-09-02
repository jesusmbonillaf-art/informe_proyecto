/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Proyecto {

    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        System.out.print("Escriba una palabra: ");
        String hola = escribir.nextLine();
        System.out.println("Has escrito: " + hola);
        System.out.print("Y su cantidad de letras es: " + hola.length());
        escribir.close();
    }
}
