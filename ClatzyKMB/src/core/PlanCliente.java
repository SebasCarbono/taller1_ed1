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
public class PlanCliente extends Producto{
    private Cliente cliente;
    private Plan plan;

    public Cliente getCliente() {
        return cliente;
    }

    public PlanCliente(Cliente cliente, Plan plan, LocalDate fechaInicio, boolean estadoActivo) {
        super(fechaInicio, estadoActivo);
        this.cliente = cliente;
        this.plan = plan;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public Plan getPlan() {
        return plan;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }
    
}
