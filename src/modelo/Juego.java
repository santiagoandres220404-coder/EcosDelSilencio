/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Juego {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ECOS DEL SILENCIO");

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        Jugador jugador = new Jugador(nombre);

        Escenario escenario = new Escenario(
                "Recibes un mensaje ofensivo en redes sociales"
        );

        escenario.agregarDecision(new Decision("Ignorar", 2, -2));
        escenario.agregarDecision(new Decision("Responder agresivamente", -3, 3));
        escenario.agregarDecision(new Decision("Bloquear al usuario", 3, -3));
        escenario.agregarDecision(new Decision("Hablar con alguien de confianza", 4, -4));

        escenario.mostrar();

        int opcion = -1;

        while (true) {
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    break;
                } else {
                    System.out.println("Opción fuera de rango. Intenta de nuevo.");
                }
            } else {
                System.out.println("Debes ingresar un número.");
                sc.next();
            }
        }

        Decision decision = escenario.obtenerDecision(opcion - 1);
        decision.aplicar(jugador);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Empatía: " + jugador.getEmpatia());
        System.out.println("Estrés: " + jugador.getEstres());
    }
}
