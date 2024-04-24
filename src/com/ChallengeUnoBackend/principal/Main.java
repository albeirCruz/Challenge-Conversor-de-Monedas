package com.ChallengeUnoBackend.principal;

import com.ChallengeUnoBackend.herramientas.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conversor conversor;
        int seleccion = 0;
        double cifraDinero = 0;

        while (seleccion != 7) {

            System.out.println("\nCONVERSOR DE DIVISAS");
            System.out.println("**************************************************");

            System.out.println("Opciones de cambio:");
            System.out.println("1.USD a COP\n2.COP a USD\n3.USD a ARS\n4.ARS a USD\n5.USD a BRL\n6.BRL a USD\n7.SALIR");
            seleccion = scan.nextInt();

            if (seleccion != 7) {
                System.out.println("\nCifra de dinero a convertir: ");
                cifraDinero = scan.nextDouble();
            }

            switch (seleccion) {
                case 1:
                    conversor = new Conversor("USD", "COP", cifraDinero);
                    System.out.println(cifraDinero + " USD = " + conversor.convertir() + " COP");
                    break;
                case 2:
                    conversor = new Conversor("COP", "USD", cifraDinero);
                    System.out.println(cifraDinero + " COP = " + conversor.convertir() + " USD");
                    break;
                case 3:
                    conversor = new Conversor("USD", "ARS", cifraDinero);
                    System.out.println(cifraDinero + " USD = " + conversor.convertir() + " ARS");
                    break;
                case 4:
                    conversor = new Conversor("ARS", "USD", cifraDinero);
                    System.out.println(cifraDinero + " ARS = " + conversor.convertir() + " USD");
                    break;
                case 5:
                    conversor = new Conversor("USD", "BRL", cifraDinero);
                    System.out.println(cifraDinero + " USD = " + conversor.convertir() + " BRL");
                    break;
                case 6:
                    conversor = new Conversor("BRL", "USD", cifraDinero);
                    System.out.println(cifraDinero + " BRL = " + conversor.convertir() + " USD");
                    break;
                case 7:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }
        }
    }
}

