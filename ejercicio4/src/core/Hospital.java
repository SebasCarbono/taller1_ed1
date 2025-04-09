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
public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
    
    public void addTeam(int team_id, int consultantDoctor_id){
        Team team = new Team(team_id);
        ConsultantDoctor consultantDoctor = new ConsultantDoctor(consultantDoctor_id, team);
        this.teams.add(team);
    }
    
    public void addJuniorDoctor(Team team, int JD_id){
        JuniorDoctor juniorDoctor = new JuniorDoctor(JD_id, team);
    } 
    
    public void addWard(int ward_id){
        Ward ward = new Ward(ward_id);
        this.wards.add(ward);
    }
    
    public void addPatient(Ward ward, Team team,int patient_id){
        Patient patient = new Patient(patient_id, team, ward);
    }
    
    public void assignPatientDoctor(Patient patient, int doctor_id){
        doctor_id = patient.getTeam().getId() + doctor_id;
        Doctor doctor = this.getDoctor(doctor_id);
        doctor.addPatient(patient);
        patient.addDoctor(doctor);
    }
    
    public void assignAppoiment(Patient patient, int doctor_id){
        doctor_id = patient.getTeam().getId() + doctor_id;
        Doctor doctor = this.getDoctor(doctor_id);
        Appoiment appoiment = new Appoiment(doctor, patient);
    }
    
    public void numberDoctorsPatient(){
        for(Ward ward : this.wards){
            for(Patient patient : ward.getPatients()){
                System.out.println("Patient " + patient.getId() + " has " + patient.getDoctors().size() + " doctors");
            }
        }
    }
    
    public void numberPatientsTeam(){
        for(Team team : this.teams){
            System.out.println("Team " + team.getId() + " has " + team.getPatients().size() + " patients");
        }
    }
    
    public void relationAppoiments(){
        for(Ward ward : this.wards){
            for(Patient patient : ward.getPatients()){
                System.out.println("Patient " + patient.getId() + " has " + patient.getAppoiments().size() + " appoiments");
                if(patient.getAppoiments().size() > 0 ){
                    for(Appoiment appoiment : patient.getAppoiments()){
                        System.out.println("Patient " + patient.getId() + " has an appoiment with doctor " + appoiment.getDoctor().getId());
                    }
                }
            }
        }
    }

    public Team getTeam(int team_id){
        for(Team team : this.teams){
            if(team.getId() == team_id){
                return team;
            }
        }
        return null;
    }
    
    public Ward getWard(int ward_id){
        for(Ward ward : this.wards){
            if(ward.getId() == ward_id){
                return ward;
            }
        }
        return null;
    }
    
    public Patient getPatient(int patient_id){
        for(Team team : this.teams){
            for(Patient patient : team.getPatients()){
                if(patient.getId() == patient_id){
                    return patient;
                }
            }
        }
        return null;
    }

    public Doctor getDoctor(int doctorId) {
        for(Team team : this.teams){
            for(Doctor doctor : team.getDoctors()){
                if(doctor.getId() == doctorId){
                    return doctor;
                }
            }
        }
        return null;
    }
}
