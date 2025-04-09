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
public class Patient {
    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(int id, Team team, Ward ward) {
        this.id = id;
        this.team = team;
        this.team.addPatient(this);
        this.ward = ward;
        this.ward.addPatient(this);
        this.appoiments = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor){
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
        }
    }
    
    public void addAppoiment(Appoiment appoiment) {
        if (!this.appoiments.contains(appoiment)) {
            this.appoiments.add(appoiment);
        }
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appoiment> getAppoiments() {
        return appoiments;
    }

    public Team getTeam() {
        return team;
    }

    public Ward getWard() {
        return ward;
    }

    public int getId() {
        return id;
    }
}
