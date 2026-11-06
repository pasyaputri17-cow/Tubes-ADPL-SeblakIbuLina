/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.seblakibulina1;

import com.mycompany.seblakibulina1.view.MenuFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class SeblakIbuLina1 {

    public static void main(String[] args) {
        System.out.println("1. Program mulai berjalan...");

        SwingUtilities.invokeLater(() -> {
            System.out.println("2. Bersiap memanggil MenuFrame...");
            new MenuFrame().setVisible(true);
            System.out.println("3. Jendela GUI seharusnya sudah tampil di layar!");
        });
    }
}
