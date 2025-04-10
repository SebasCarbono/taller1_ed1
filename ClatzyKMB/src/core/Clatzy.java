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
public class Clatzy {
    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.clientes = new ArrayList<>();
        this.instructores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }
    
    public void addInstructor(String nombre, String cedula, String telefono, String email){
        Instructor instructor = new Instructor(nombre, cedula, telefono, email);
        this.instructores.add(instructor);
    }
    
    public void addCurso(int id, String nombre, LocalDate fechaInicio, int valor, Instructor instructor){
        Curso curso = new Curso(id, nombre, fechaInicio, valor, instructor);
        this.cursos.add(curso);
    }
    
    public void addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso){
        Plan plan = new Plan(nombre, fechaInicio, valor, valorMaximoCurso);
        this.planes.add(plan);
    }
    public void addCliente(String nombre, String cedula, String telefono, String email){
        Cliente cliente = new Cliente(nombre, cedula, telefono, email);
        this.clientes.add(cliente);
    }

    public Instructor getInstructor(int instructorIndex) {
        return instructores.get(instructorIndex);
    }
    
    public Cliente getCliente(int clienteIndex){
        return clientes.get(clienteIndex);
    }
    
    public Plan getPlan(int planIndex){
        return planes.get(planIndex);
    }
    
    public Curso getCurso(int cursoIndex){
        return cursos.get(cursoIndex);
    }
    
    public void comprarPlan(Cliente cliente, Plan plan, LocalDate fechaDeCompra){
        boolean tienePlan = false;
        for(PlanCliente planCliente : cliente.getPlanes()){
            if(planCliente.isEstadoActivo() == true){
                tienePlan = true;
                System.out.println("El cliente "+cliente.nombre+" ya tiene un plan activo");
                break;
            }
        }
        if (!tienePlan) {
            PlanCliente nuevoPlan = new PlanCliente(cliente, plan, fechaDeCompra, true); 
            cliente.añadirPlan(nuevoPlan);
            System.out.println("El cliente " + cliente.nombre + " compro exitosamente un plan " + plan.nombre);
        }
    }
    
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date){
        boolean tienePlan = false;
        PlanCliente planActual = null;
        for(PlanCliente planCliente : cliente.getPlanes()){
            if(planCliente.estadoActivo){
                tienePlan = true;
                planActual = planCliente;
                break;
            }
        }
        if (tienePlan & planActual.id == 0){
            cliente.añadirProducto(cliente, curso, date, 0, true);
            System.out.println("El cliente " + cliente.nombre + " registro exitosamente el curso " + curso.nombre);
        } else{
            float valorMaximo = planActual.getPlan().getValorMaximoCurso();
            if (valorMaximo >= curso.valor) {
                cliente.añadirProducto(cliente, curso, date, 0, true);
                valorMaximo = valorMaximo - curso.valor;
                planActual.getPlan().setValorMaximoCurso(valorMaximo);
            }else{
                System.out.println("El plan del cliente "+ cliente.nombre + " no cubre el curso " + curso.nombre);
            }
        }
    }
    
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor){
        if(!cliente.isCurso(curso)){
            if(curso.valor == valor){
                cliente.añadirProducto(cliente, curso, date, valor, true);
                System.out.println("El cliente " + cliente.nombre + " compro exitosamente el curso " + curso.nombre);
            }
            else{
                System.out.println("El cliente " + cliente.nombre + " no pago el valor correcto por el curso " + curso.nombre);
            }
        }else{
            System.out.println("El cliente " + cliente.nombre + " ya habia registrado el curso " + curso.nombre);
        }
    }
    
    public String getClienteMayorIngreso(){
        Cliente clienteMayorIngreso = null;
        float efectivoAnterior = 0;
        for(Cliente cliente : clientes){
            float efectivoTotal = 0;
            for(ProductoCliente producto : cliente.getProductos()){
                efectivoTotal = efectivoTotal + producto.valor;
            }
            if (efectivoTotal > efectivoAnterior){
                efectivoAnterior = efectivoTotal;
                clienteMayorIngreso = cliente;
            }
        }
        
        return clienteMayorIngreso.nombre;
    }
}
