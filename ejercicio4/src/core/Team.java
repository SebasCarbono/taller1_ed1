/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author Karoll
 */
public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int id){
        this.id = id;
        this.teamLeader = null;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void setTeamLeader(ConsultantDoctor teamLeader) {
        this.teamLeader = teamLeader;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }
}
