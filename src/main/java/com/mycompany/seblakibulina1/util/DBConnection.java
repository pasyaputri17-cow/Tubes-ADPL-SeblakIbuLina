/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/seblak_ibulina";
    private static final String USER = "root";
    private static final String PASSWORD = "Sapi17$";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Berhasil");
        } catch (SQLException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
        return conn;
    }

}
