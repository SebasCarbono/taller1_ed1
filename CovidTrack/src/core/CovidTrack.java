/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class CovidTrack {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Registro> registros;
    private ArrayList<Antena> antenas;
    private ArrayList<PuntoInteres> puntosInteres;

    public CovidTrack() {
        this.usuarios = new ArrayList<>();
        this.registros = new ArrayList<>();
        this.antenas = new ArrayList<>();
        this.puntosInteres = new ArrayList<>();
    }
    
    public void addAntena(Antena antena){
        this.antenas.add(antena);
    }
    
    public void addPuntoInteres(String nombre, String tipo, double latitud, double longitud, double rango){
        PuntoInteres puntoInteres = new PuntoInteres(nombre, tipo, latitud, longitud, rango);
        this.puntosInteres.add(puntoInteres);
    }

    public void addUsuario(UsuarioOperador usuarioOperador){
        this.usuarios.add(usuarioOperador);
    }
    
    public void addUsuario(UsuarioAplicacion usuarioAplicacion){
        this.usuarios.add(usuarioAplicacion);
    }
    
    public void addRegistro(Usuario usario, Antena antena, LocalDateTime fecha){
        RegistroOperador registroOperador = new RegistroOperador(usario, antena, fecha);
        this.registros.add(registroOperador);
    }
    
    public void addRegistro(Usuario usario, double latitud, double longitud, LocalDateTime fecha){
        RegistroAplicacion registroAplicacion = new RegistroAplicacion(usario, latitud, longitud, fecha);
        this.registros.add(registroAplicacion);
    }
    
    public Usuario getUsuario(int usuarioIndex) {
        Usuario usuario = usuarios.get(usuarioIndex);
        return usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Antena getAntena(int antenaIndex) {
        Antena antena = antenas.get(antenaIndex);
        return antena;
    }

    public PuntoInteres getPuntoInteres(int puntoInteresIndex) {
        PuntoInteres puntoInteres = puntosInteres.get(puntoInteresIndex);
        return puntoInteres;
    }
    public void showResumenPuntosIntesesPorMes(){
        
    }
}
