/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;

/**
 *
 * @author Sebas
 */
public class RegistroAplicacion extends Registro{
    private double latitud;
    private double longitud;
    private Usuario usuario;

    public RegistroAplicacion(Usuario usuario, double latitud, double longitud, LocalDateTime fecha) {
        super(fecha);
        this.latitud = latitud;
        this.longitud = longitud;
        this.usuario = usuario;
    }
    
}
