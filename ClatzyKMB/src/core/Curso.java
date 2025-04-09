/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author Karoll
 */
public class Curso extends Producto{
    private ArrayList<Instructor> instructores = new ArrayList<>();
    private ArrayList<ProductoCliente> productosCliente = new ArrayList<>();

    public Curso(int id, String nombre, LocalDate fechaInicio, float valor, Instructor instructor){
        super(id, nombre, fechaInicio, valor);
        this.instructores.add(instructor);
    }
}
