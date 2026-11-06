/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.dao;

import com.mycompany.seblakibulina1.model.Topping;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ToppingDao {

    List<Topping> getAllTopping();

    boolean ubahStatusTopping(int id, boolean statusTersedia);
}
