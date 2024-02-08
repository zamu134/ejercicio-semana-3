/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;
import javax.swing.JOptionPane;
/**
 *
 * @author thega
 */
public class Suma {

    public static void main(String[] args) 
    {
        String primerNumero; //primera cadena introducida por el 
                             //usuario
        String segundoNumero; //segunda cadena introducida por el 
                             //usuario
                             
            int numero1;        //primer numero a sumar
            int numero2;        //segundo numero a sumar
            int suma;        //suma de numero1 y numero2
            
            //leer el primer numero delm usuario como una cadena
            primerNumero = JOptionPane.showInputDialog("Escriba el primer entero");
            
            //leer el segundo numero del usuario como una cadena 
            segundoNumero = JOptionPane.showInputDialog("Escriba el segundo entero");
            
            //convertir los numeros de tipo string a tipo int
            numero1 = Integer.parseInt (primerNumero);
            numero2 = Integer.parseInt (segundoNumero);
            
            //sumar los numeros
            suma = numero1 + numero2;
            
            //moistrar resultado
            JOptionPane.showMessageDialog (null, "La suma es " + suma, "Resultados", JOptionPane.PLAIN_MESSAGE);
            
            System.exit (0);    //terminar aplicacion con la ventyana 
            
    }//fin del main
}//fin de la clase suma
