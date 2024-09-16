package com.grafos.grafos.controller;

import java.util.ArrayList;

/**
 * NodosResponse
 */
public class Nodos {
    ArrayList<Nodo> nodos = new ArrayList<>();
    ArrayList<Arista> aristas = new ArrayList<>();

    public Nodos() {
    }
    public ArrayList<Nodo> getNodos() {
        return nodos;
    }
    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }
    public ArrayList<Arista> getAristas() {
        return aristas;
    }
    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }
    @Override
    public String toString() {
        return nodos.toString()+" "+aristas.toString();
    }
    public void agregarNodo(Nodo nodo){
        nodos.add(nodo);
    }
    public void agregarArista(Arista arista) {
        aristas.add(arista);
    }    
}