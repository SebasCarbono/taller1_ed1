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
public abstract class Registro {
    protected LocalDateTime fecha;

    public Registro(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
}
