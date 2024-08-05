/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.registro.ventanaemergente;

import javax.swing.JOptionPane;

/**
 *
 * @author Luz Talavera Martinez
 */
public class VentanaEmergente {

    public static void main(String[] args) {
        String mensajeName = "ingrese su nombre";
        String nombre= JOptionPane.showInputDialog(mensajeName);
        JOptionPane.showMessageDialog(null, nombre);
    }
}
