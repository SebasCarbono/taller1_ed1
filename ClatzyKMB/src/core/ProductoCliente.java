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
public class ProductoCliente extends Producto{
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(Cliente cliente, Curso curso, LocalDate fechaDeCompra, float valor, boolean estadoActivo) {
        super(fechaDeCompra, valor, estadoActivo);
        this.cliente = cliente;
        this.curso = curso;
    }
    
}
