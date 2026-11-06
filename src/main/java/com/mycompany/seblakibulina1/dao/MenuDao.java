/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.seblakibulina1.dao;

import com.mycompany.seblakibulina1.model.Menu;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface MenuDao {

    List<Menu> getAllMenu();

    boolean tambahMenu(Menu menu);

    boolean ubahMenu(Menu menu);

    boolean hapusMenu(int id);
}
