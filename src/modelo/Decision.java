/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Decision {
    private String descripcion;
    private int impactoEmpatia;
    private int impactoEstres;

    public Decision(String descripcion, int impactoEmpatia, int impactoEstres) {
        this.descripcion = descripcion;
        this.impactoEmpatia = impactoEmpatia;
        this.impactoEstres = impactoEstres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void aplicar(Jugador jugador) {
        jugador.modificarEmpatia(impactoEmpatia);
        jugador.modificarEstres(impactoEstres);
    }
}