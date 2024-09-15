package com.grafos.grafos.controller;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Juego
 */
@RestController
public class Juego {
    
    @GetMapping("/getnodos")
    public ArrayList<Nodo> getNodos() {
        ArrayList<Nodo> nodos = new ArrayList<>();
        nodos.add(new Nodo(100,200,3));
        nodos.add(new Nodo(200,300,3));
        nodos.add(new Nodo(300,400,3));
        return nodos;
    }
    
}