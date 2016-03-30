/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasgedepbo;

import java.util.ArrayList;

/**
 *
 * @author iwannadb
 */
public class Kereta {
    private ArrayList<Gerbong> gerbongs;
    private String nama;
    private int maxGerbong;
    private Rute rute;
    
    public Kereta(String nama,int maxGer){
        this.nama = nama;
        maxGerbong = maxGer;
    }
    
    public void addGerbong(Gerbong g){
        if (gerbongs.size()<getMaxGerbong()) 
            gerbongs.add(g);
        else
            System.out.print("penuh");
    }
    
    private ArrayList<Gerbong> getGerbongs(){
        return gerbongs;
    }
    public void setRoute(Rute ru){
        this.rute = ru;
    }
    public Rute getRoute(){
        return rute;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the maxGerbong
     */
    public int getMaxGerbong() {
        return maxGerbong;
    }

    /**
     * @param maxGerbong the maxGerbong to set
     */
    public void setMaxGerbong(int maxGerbong) {
        this.maxGerbong = maxGerbong;
    }
}
