/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Karoll
 */
public class Plan extends Producto{
    private float valorMaximoCurso;
    private ArrayList<PlanCliente> planes;

    public Plan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso) {
        super(nombre, fechaInicio, valor);
        this.valorMaximoCurso = valorMaximoCurso;
    }

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }

    public void setValorMaximoCurso(float valorMaximoCurso) {
        this.valorMaximoCurso = valorMaximoCurso;
    }
    
}
