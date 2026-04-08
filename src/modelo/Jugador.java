/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Jugador {
    private String nombre;
    protected int empatia;
    protected int estres;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.empatia = 50;
        this.estres = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEmpatia() {
        return empatia;
    }

    public int getEstres() {
        return estres;
    }

    public void modificarEmpatia(int valor) {
        empatia += valor;
    }

    public void modificarEstres(int valor) {
        estres += valor;
    }
}
