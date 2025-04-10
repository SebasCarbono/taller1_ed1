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
public class RegistroOperador extends Registro{
    private Usuario usuario;
    private Antena antena;

    public RegistroOperador(Usuario usuario, Antena antena, LocalDateTime fecha) {
        super(fecha);
        this.usuario = usuario;
        this.antena = antena;
    }
    
}
