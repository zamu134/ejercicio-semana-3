/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valor_pi;
import javax.swing.JOptionPane;

/**
 *
 * @author thega
 */
public class Valor_pi {

    public static void main(String[] args) {
        String radioStr = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia:");
        double radio = Double.parseDouble(radioStr);
        
        double area = Math.PI * radio * radio;

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "Área del círculo: " + area +
                "\nVolumen de la esfera: " + volumen, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
