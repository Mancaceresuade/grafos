package com.grafos.grafos.controller;

/**
 * Nodo
 */
public class Nodo {
    private int x;
    private int y;
    private int id;

    public Nodo(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        return Integer.toString(id) + " " + Integer.toString(x) + " " + Integer.toString(y);
    }    
}