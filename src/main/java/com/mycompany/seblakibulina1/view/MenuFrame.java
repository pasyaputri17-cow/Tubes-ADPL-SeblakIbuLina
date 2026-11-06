/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seblakibulina1.view;

import com.mycompany.seblakibulina1.controller.MenuController;
import com.mycompany.seblakibulina1.model.Menu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class MenuFrame extends JFrame {

    private MenuController controller = new MenuController();
    private JTextField txtNama = new JTextField(10);
    private JTextField txtHarga = new JTextField(10);
    private JTable tblMenu = new JTable();
    private DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama", "Harga"}, 0);
    private int selectedId = -1;

    public MenuFrame() {
        setTitle("Menu Seblak Ibu Lina");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Tambah Komponen Input & Tombol
        add(new JLabel("Nama:"));
        add(txtNama);
        add(new JLabel("Harga:"));
        add(txtHarga);

        JButton btnTambah = new JButton("Tambah");
        JButton btnUbah = new JButton("Ubah");
        JButton btnHapus = new JButton("Hapus");
        add(btnTambah);
        add(btnUbah);
        add(btnHapus);

        // Setting Tabel
        tblMenu.setModel(model);
        add(new JScrollPane(tblMenu));

        // Event Klik Tabel
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = tblMenu.getSelectedRow();
                selectedId = Integer.parseInt(model.getValueAt(row, 0).toString());
                txtNama.setText(model.getValueAt(row, 1).toString());
                txtHarga.setText(model.getValueAt(row, 2).toString());
            }
        });

        btnTambah.addActionListener(e -> {
            controller.tambahData(txtNama.getText(), Integer.parseInt(txtHarga.getText()));
            refreshTable();
        });

        btnUbah.addActionListener(e -> {
            if (selectedId != -1) {
                controller.ubahData(selectedId, txtNama.getText(), Integer.parseInt(txtHarga.getText()));
                refreshTable();
            }
        });

        btnHapus.addActionListener(e -> {
            if (selectedId != -1) {
                controller.hapusData(selectedId);
                refreshTable();
            }
        });

        refreshTable();
    }

    private void refreshTable() {
        model.setRowCount(0);
        for (Menu m : controller.getAllData()) {
            model.addRow(new Object[]{m.getId(), m.getNama(), m.getHarga()});
        }
        txtNama.setText("");
        txtHarga.setText("");
        selectedId = -1;
    }

}
