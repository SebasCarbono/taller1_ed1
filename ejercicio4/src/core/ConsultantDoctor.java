/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author Karoll
 */
public class ConsultantDoctor extends Doctor{
    private Team leaderOf;

    public ConsultantDoctor(int id, Team team) {
        super(id, team);
        this.leaderOf = team;
        this.leaderOf.setTeamLeader(this);
    }
}
