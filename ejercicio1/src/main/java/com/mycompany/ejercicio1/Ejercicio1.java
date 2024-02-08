/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import javax.swing.JOptionPane;


/**
 *
 * @author thega
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        String numeroStr = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < numero; i++) {
            mensaje.append(palabra).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

