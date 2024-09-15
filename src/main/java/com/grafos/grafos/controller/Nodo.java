package com.grafos.grafos.controller;

/**
 * Nodo
 */
public class Nodo {
    private int x;
    private int y;
    private int numero;

    public Nodo(int x, int y, int numero) {
        this.x = x;
        this.y = y;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return Integer.toString(numero) + " " + Integer.toString(x) + " " + Integer.toString(y);
    }    
}