/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numero_mayor;
import javax.swing.JOptionPane;

/**
 *
 * @author thega
 */
public class Numero_mayor {

    public static void main(String[] args) {
        String numero1Str = JOptionPane.showInputDialog("Ingrese el primer número:");
        double numero1 = Double.parseDouble(numero1Str);

        String numero2Str = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(numero2Str);

        String numero3Str = JOptionPane.showInputDialog("Ingrese el tercer número:");
        double numero3 = Double.parseDouble(numero3Str);

        double mayor = Math.max(Math.max(numero1, numero2), numero3);

        JOptionPane.showMessageDialog(null, "El mayor número es: " + mayor, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}