package br.unicesumar.adsis4s2021.guitarra;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guitarra {
    
    @Id
    private String id;
    private String marca;
    private String modelo;

    public Guitarra(){}

    public Guitarra(String id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getId() {
        return id;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
}
