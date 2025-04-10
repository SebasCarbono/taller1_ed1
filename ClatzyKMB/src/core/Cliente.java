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
public class Cliente extends Persona{
    private ArrayList<PlanCliente> planes = new ArrayList<>();
    private ArrayList<ProductoCliente> productos = new ArrayList<>();

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }
    
    public PlanCliente getPlan(int planIndex) {
        return planes.get(planIndex);
    }

    public ArrayList<ProductoCliente> getProductos() {
        return productos;
    }
    
    public void añadirPlan(PlanCliente plan) {
        this.planes.add(plan);
    }
    
    public void añadirProducto(Cliente cliente, Curso curso, LocalDate fechaDeCompra, float valor, boolean estadoActivo) {
        ProductoCliente cursoComprado = new ProductoCliente(cliente, curso, fechaDeCompra, valor, estadoActivo);
        this.productos.add(cursoComprado);
    }

    public boolean isCurso(Curso curso){
        for(ProductoCliente productoCliente : productos){
            if(productoCliente.getCurso() == curso){
                return true;
            }
        }
        return false;
    }
}
