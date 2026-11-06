/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1;

import com.mycompany.seblakibulina1.util.DBConnection;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class ResetTabel {

    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement()) {

            // Perintah sakti untuk menghapus semua data & mereset ID ke 1
            stmt.executeUpdate("TRUNCATE TABLE menu");

            System.out.println("SUKSES! Tabel menu sudah bersih dan ID kembali ke 1.");
        } catch (Exception e) {
            System.out.println("Gagal reset: " + e.getMessage());
        }
    }
}
