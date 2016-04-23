/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Muhammad 'Aizul F
 */
public class Gerbong {
    private int maxPenumpang;
    private String Kelas;
    private ArrayList<Tiket> tickets;

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    public String getKelas() {
        return Kelas;
    }

    public ArrayList<Tiket> getTickets() {
        return tickets;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public void setTickets(ArrayList<Tiket> tickets) {
        this.tickets = tickets;
    }
    
    public void setKelas (String Kelas){
        this.Kelas = Kelas;
    }
    
}
