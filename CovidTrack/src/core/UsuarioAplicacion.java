/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Sebas
 */
public class UsuarioAplicacion extends Usuario{
    private String nombre;
    private String cedula;
    private String direccion;
    private String RegistroAplicacion;

    public UsuarioAplicacion(String celular, boolean covid, String nombre, String cedula, String direccion) {
        super(celular, covid);
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getRegistroAplicacion() {
        return RegistroAplicacion;
    }
    
}
