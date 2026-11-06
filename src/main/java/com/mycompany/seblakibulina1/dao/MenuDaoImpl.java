/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.dao;

import com.mycompany.seblakibulina1.model.Menu;
import com.mycompany.seblakibulina1.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MenuDaoImpl implements MenuDao {

    @Override
    public List<Menu> getAllMenu() {
        List<Menu> listMenu = new ArrayList<>();
        String query = "SELECT * FROM menu";
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Menu menu = new Menu(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getInt("harga")
                );
                listMenu.add(menu);
            }
        } catch (SQLException e) {
            System.out.println("Error getAllMenu: " + e.getMessage());
        }
        return listMenu;
    }

    @Override
    public boolean tambahMenu(Menu menu) {
        String query = "INSERT INTO menu (nama, harga) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, menu.getNama());
            ps.setDouble(2, menu.getHarga());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error tambahMenu: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean ubahMenu(Menu menu) {
        String query = "UPDATE menu SET nama = ?, harga = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, menu.getNama());
            ps.setDouble(2, menu.getHarga());
            ps.setInt(3, menu.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error ubahMenu: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean hapusMenu(int id) {
        String query = "DELETE FROM menu WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error hapusMenu: " + e.getMessage());
            return false;
        }
    }
}
