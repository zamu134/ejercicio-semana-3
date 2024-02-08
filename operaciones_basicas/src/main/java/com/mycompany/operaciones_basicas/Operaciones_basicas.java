/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operaciones_basicas;
import javax.swing.JOptionPane;

/**
 *
 * @author thega
 */
public class Operaciones_basicas {

    public static void main(String[] args) {
        String valor1Str = JOptionPane.showInputDialog("Ingrese el primer valor:");
        double valor1 = Double.parseDouble(valor1Str);

        String valor2Str = JOptionPane.showInputDialog("Ingrese el segundo valor:");
        double valor2 = Double.parseDouble(valor2Str);

        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double multiplicacion = valor1 * valor2;

        double division = (valor2 != 0) ? (valor1 / valor2) : Double.NaN;

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Suma: ").append(suma).append("\n");
        mensaje.append("Resta: ").append(resta).append("\n");
        mensaje.append("Multiplicación: ").append(multiplicacion).append("\n");
        mensaje.append("División: ").append((Double.isNaN(division) ? "Indefinida (divisor es cero)" : division));

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
