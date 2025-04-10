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
public class PuntoInteres {
    private String nombre;
    private String tipo;
    private double latitud;
    private double longitud;
    private double rango;
    private ArrayList<LocalDateTime> fechas;
    private ArrayList<ArrayList<Usuario>> usuarios;

    public PuntoInteres(String nombre, String tipo, double latitud, double longitud, double rango) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.rango = rango;
    }
    //updateUsuariosCercanos(covidTrack.getUsuarios(), LocalDateTime.of(2021, month, day, hour, 0))
    public void updateUsuariosCercanos(ArrayList<Usuario> usuarios, LocalDateTime fecha){
        CovidTrack covidTrack;
        //haversineDistance(double lat1, double lon1, double lat2, double lon2)
    }
    
}
