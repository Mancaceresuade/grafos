package com.grafos.grafos.controller;

/**
 * Arista
 */
public class Arista {

    private Nodo desdeNodo;
    private Nodo hastaNodo;
    private int peso;

    public Nodo getDesdeNodo() {
        return desdeNodo;
    }
    public Nodo getHastaNodo() {
        return hastaNodo;
    }
    public int getPeso() {
        return peso;
    }
    public void setDesdeNodo(Nodo desdeNodo) {
        this.desdeNodo = desdeNodo;
    }
    public void setHastaNodo(Nodo hastaNodo) {
        this.hastaNodo = hastaNodo;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return this.desdeNodo + " " + this.hastaNodo + " " + this.peso;
    }
}