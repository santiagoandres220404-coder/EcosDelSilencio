/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Escenario {
    private String descripcion;
    protected ArrayList<Decision> decisiones;

    public Escenario(String descripcion) {
        this.descripcion = descripcion;
        this.decisiones = new ArrayList<>();
    }

    public void agregarDecision(Decision decision) {
        decisiones.add(decision);
    }

    public void mostrar() {
        System.out.println("\n" + descripcion);

        for (int i = 0; i < decisiones.size(); i++) {
            System.out.println((i + 1) + ". " + decisiones.get(i).getDescripcion());
        }
    }

    public Decision obtenerDecision(int indice) {
        return decisiones.get(indice);
    }
}