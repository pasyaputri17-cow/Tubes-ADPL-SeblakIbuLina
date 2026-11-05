/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.model;

/**
 *
 * @author ASUS
 */
public class Topping {

    private int id;
    private String nama;
    private boolean statusTersedia;

    public Topping() {
    }

    public Topping(int id, String nama, boolean statusTersedia) {
        this.id = id;
        this.nama = nama;
        this.statusTersedia = statusTersedia;
    }

    public Topping(String nama, boolean ststusTersedia) {
        this.nama = nama;
        this.statusTersedia = statusTersedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean getStatusTersedia() {
        return statusTersedia;
    }

    public void setStatusTersedia(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }

}
