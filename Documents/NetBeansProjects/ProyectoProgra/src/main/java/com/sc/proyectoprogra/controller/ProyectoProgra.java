/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc.proyectoprogra.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class ProyectoProgra {

    public static void main(String[] args) {
        //Se desarrolla el menu principal 
        String lectura = JOptionPane.showInputDialog("********** Menú Principal **********"
                + "\n 1- Agendar aplicación de examen \n 2-Opciones de mantenimiento "
                + "\n 3-Reportes \n 4-Salir \nElija una opción del menú: ");
        //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
        int opcion = Integer.parseInt(lectura);
        
        //Se crea un do while para que el menu se repita hasta que el usuario decida salir
        do {
            //Se muestra el menu para que el usuario elija una opcion
            lectura = JOptionPane.showInputDialog("********** Menú Principal **********"
                    + "\n 1- Agendar aplicación de examen \n 2-Opciones de mantenimiento "
                    + "\n 3-Reportes \n 4-Salir \nElija una opción del menú: ");
            //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
            opcion = Integer.parseInt(lectura);
            //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion!=4) {
                JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
            }
          //Repetir hasta que el usuario digite el numero 4
        } while (opcion != 4);
    }
}
