/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Karoll
 */
public class Appoiment {
    private Doctor doctor;
    private Patient patient;

    public Doctor getDoctor() {
        return doctor;
    }

    public Appoiment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        
        this.doctor.addAppoiment(this);
        this.patient.addAppoiment(this);
    }
}
