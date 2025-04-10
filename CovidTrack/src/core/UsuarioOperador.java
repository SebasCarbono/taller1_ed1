/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Sebas
 */
public class UsuarioOperador extends Usuario {
    private RegistroOperador historial;

    public UsuarioOperador(String celular, boolean covid) {
        super(celular, covid);
    }

    public RegistroOperador getHistorial() {
        return historial;
    }
    
}
