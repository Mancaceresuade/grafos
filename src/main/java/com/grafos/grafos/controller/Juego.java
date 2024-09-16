package com.grafos.grafos.controller;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Juego
 */
@RestController
public class Juego {

    private ArrayList<DatosRequest> resultados = new ArrayList<>();
    
    @GetMapping("/getnodos")
    public Nodos getNodos() {
        Nodos nodos = new Nodos();
        nodos.agregarNodo(new Nodo(50,200,1));
        nodos.agregarNodo(new Nodo(100,300,2));
        nodos.agregarNodo(new Nodo(300,300,3));    
        nodos.agregarArista(new Arista(1,2,8));
        nodos.agregarArista(new Arista(1,3,5));
        nodos.agregarArista(new Arista(3,2,2));
        nodos.agregarArista(new Arista(2,1,3));
        return nodos;
    }

    @PostMapping("/enviarDatos")
    public String recibirDatos(@RequestBody DatosRequest datos) {
        this.resultados.add(datos);
        return "Datos recibidos correctamente";
        /*
        System.out.println("Usuario: " + datos.getUsuario());
        System.out.println("Nodo 1: " + datos.getNodo1());
        System.out.println("Nodo 2: " + datos.getNodo2());
        System.out.println("Peso: " + datos.getPeso());
        */
    }

    @GetMapping("/resultados")
    public ArrayList<DatosRequest> getResultdos() {
        return this.resultados;
    }    
}