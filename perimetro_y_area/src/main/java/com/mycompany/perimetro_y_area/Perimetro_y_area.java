/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perimetro_y_area;
import javax.swing.JOptionPane;

/**
 *
 * @author thega
 */
public class Perimetro_y_area {

    public static void main(String[] args) {
        String ladoStr = JOptionPane.showInputDialog("Ingrese la longitud del lado del rectángulo:");
        double lado = Double.parseDouble(ladoStr);

        String anchoStr = JOptionPane.showInputDialog("Ingrese la anchura del lado del rectángulo:");
        double ancho = Double.parseDouble(anchoStr);

        double perimetro = 2 * (lado + ancho);
        double area = lado * ancho;

        JOptionPane.showMessageDialog(null, "Perímetro del rectángulo: " + perimetro +
                "\nÁrea del rectángulo: " + area, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
