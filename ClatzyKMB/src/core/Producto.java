/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;

/**
 *
 * @author Karoll
 */
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, LocalDate fechaInicio, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
    }

    public Producto(String nombre, LocalDate fechaInicio, float valor) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
    }
    
    public Producto(LocalDate fechaInicio, boolean estadoActivo) {
        this.fechaInicio = fechaInicio;
        this.estadoActivo = estadoActivo;
    }

    public Producto(LocalDate fechaInicio, float valor, boolean estadoActivo) {
        this.fechaInicio = fechaInicio;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
    }
    
}
