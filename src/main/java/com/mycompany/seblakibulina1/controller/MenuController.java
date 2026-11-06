/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.controller;

import com.mycompany.seblakibulina1.dao.MenuDao;
import com.mycompany.seblakibulina1.dao.MenuDaoImpl;
import com.mycompany.seblakibulina1.model.Menu;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MenuController {

    private MenuDao menuDao = new MenuDaoImpl();

    public List<Menu> getAllData() {
        return menuDao.getAllMenu();
    }

    public boolean tambahData(String nama, int harga) {
        return menuDao.tambahMenu(new Menu(nama, harga));
    }

    public boolean ubahData(int id, String nama, int harga) {
        return menuDao.ubahMenu(new Menu(id, nama, harga));
    }

    public boolean hapusData(int id) {
        return menuDao.hapusMenu(id);
    }
}
