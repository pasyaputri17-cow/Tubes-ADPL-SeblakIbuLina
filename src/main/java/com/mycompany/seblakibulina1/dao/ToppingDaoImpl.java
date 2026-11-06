/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.dao;

import com.mycompany.seblakibulina1.model.Topping;
import com.mycompany.seblakibulina1.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ToppingDaoImpl implements ToppingDao {

    @Override
    public List<Topping> getAllTopping() {
        List<Topping> listTopping = new ArrayList<>();
        String query = "SELECT * FROM topping";
        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Topping topping = new Topping(
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getBoolean("status_tersedia")
                );
                listTopping.add(topping);
            }
        } catch (SQLException e) {
            System.out.println("Error getAllTopping: " + e.getMessage());
        }
        return listTopping;
    }

    @Override
    public boolean ubahStatusTopping(int id, boolean statusTersedia) {
        String query = "UPDATE topping SET status_tersedia = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setBoolean(1, statusTersedia);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error ubahStatusTopping: " + e.getMessage());
            return false;
        }
    }
}
