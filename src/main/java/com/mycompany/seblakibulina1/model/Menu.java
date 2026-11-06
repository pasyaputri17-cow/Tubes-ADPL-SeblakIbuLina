/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.model;

/**
 *
 * @author ASUS
 */
public class Menu {

    private int id;
    private String nama;
    private int harga; // Berubah jadi int

    public Menu() {
    }

    public Menu(int id, String nama, int harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
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

    public int getHarga() {
        return harga;
    } // Berubah jadi int

    public void setHarga(int harga) {
        this.harga = harga;
    } // Berubah jadi int
}
