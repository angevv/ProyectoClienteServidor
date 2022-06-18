/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Programa {
    
    public void menu(){
        //Se crea clientes de la clase Cliente
        Cliente clientes = new Cliente();
        
        int opcion;
        //Se crea un do while para que el menú se repita hasta que el usuario decida salir
        do {
            //Se desarrolla el menu principal 
            String lectura = JOptionPane.showInputDialog("********** Menú Principal **********"
                    + "\n 1- Agendar aplicación de examen \n 2- Opciones de mantenimiento "
                    + "\n 3- Reportes \n 4- Salir \nElija una opción del menú: ");
            //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
            opcion = Integer.parseInt(lectura);
            //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion!=4) {
                JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
            } 
            //Se crea un switch para las opciones del menú
            switch (opcion){
            case 1:
                 clientes.agendarAplicacionExamen();
                break;
            case 2:
                int opcionMantenimiento;
                do{
                    //Se crea el menú de mantenimiento para las entidades
                    lectura = JOptionPane.showInputDialog("******** Menú de Mantenimiento ********"
                        + "\n 1- Tipo de examen \n 2- Exámenes "
                        + "\n 3- Doctores \n 4- Clientes  \n 5- Aplicaciones Examenes \n 6- Volver al menú principal \nElija una opción del menú: ");
                    //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                    opcionMantenimiento = Integer.parseInt(lectura);
                    //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
                    if (opcionMantenimiento != 1 && opcionMantenimiento != 2 && opcionMantenimiento != 3 && opcionMantenimiento != 4 && opcionMantenimiento != 5 && opcionMantenimiento != 6) {
                        JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                    }
                    switch(opcionMantenimiento){
                        case 1:
                            int opcionMantenTipo;
                            do{
                                //Se crea el menú de opciones de mantenimiento de tipo examen
                                lectura = JOptionPane.showInputDialog("****** Mantenimiento Tipo Examen ******"
                                    + "\n 1- Listar datos \n 2- Agregar datos "
                                    + "\n 3- Editar datos \n 4- Borrar datos \n 5- Volver al menú anterior \nElija una opción del menú: ");
                                //Se convierte el valor lectura a entero para poder comparar la opcion con el menú
                                opcionMantenTipo = Integer.parseInt(lectura);
                                //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
                                if (opcionMantenTipo != 1 && opcionMantenTipo != 2 && opcionMantenTipo != 3 && opcionMantenTipo != 4 && opcionMantenTipo != 5) {
                                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                                }
                                switch(opcionMantenTipo){
                                    case 1:
                                        //Listar
                                        break;
                                    case 2:
                                        //Agregar
                                        break;
                                    case 3:
                                        //Editar
                                        break;
                                    case 4:
                                        //Borrar
                                        break;
                                }
                            }while(opcionMantenTipo!=5);
                            break;
                        case 2:
                            int opcionMantenExam;
                            do{
                                //Se crea el menú de opciones de mantenimiento de exámenes
                                lectura = JOptionPane.showInputDialog("****** Mantenimiento Exámenes ******"
                                    + "\n 1- Listar datos \n 2- Agregar datos "
                                    + "\n 3- Editar datos \n 4- Borrar datos \n 5- Volver al menú anterior \nElija una opción del menú: ");
                                //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                                opcionMantenExam = Integer.parseInt(lectura);
                                if (opcionMantenExam != 1 && opcionMantenExam != 2 && opcionMantenExam != 3 && opcionMantenExam != 4 && opcionMantenExam != 5) {
                                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                                }
                                switch(opcionMantenExam){
                                    case 1:
                                        //Listar
                                        break;
                                    case 2:
                                        //Agregar
                                        break;
                                    case 3:
                                        //Editar
                                        break;
                                    case 4:
                                        //Borrar
                                        break;
                                }
                            }while(opcionMantenExam!=5);
                            break;
                        case 3:
                            int opcionMantenDoc;
                            do{
                                //Se crea el menú de opciones de mantenimiento de doctores
                                lectura = JOptionPane.showInputDialog("***** Mantenimiento Doctores *****"
                                    + "\n 1- Listar datos \n 2- Agregar datos "
                                    + "\n 3- Editar datos \n 4- Borrar datos \n 5- Volver al menú anterior \nElija una opción del menú: ");
                                //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                                opcionMantenDoc = Integer.parseInt(lectura);
                                if (opcionMantenDoc != 1 && opcionMantenDoc != 2 && opcionMantenDoc != 3 && opcionMantenDoc != 4 && opcionMantenDoc != 5) {
                                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                                }
                                switch(opcionMantenDoc){
                                    case 1:
                                        //Listar
                                        break;
                                    case 2:
                                        //Agregar
                                        break;
                                    case 3:
                                        //Editar
                                        break;
                                    case 4:
                                        //Borrar
                                        break;
                                }
                            }while(opcionMantenDoc!=5);
                            break;
                        case 4:
                            int opcionMantenCli;
                            do{
                                //Se crea el menú de opciones de mantenimiento de clientes
                                lectura = JOptionPane.showInputDialog("***** Mantenimiento Clientes *****"
                                    + "\n 1- Listar datos \n 2- Agregar datos "
                                    + "\n 3- Editar datos \n 4- Borrar datos \n 5- Volver al menú anterior \nElija una opción del menú: ");
                                //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                                opcionMantenCli = Integer.parseInt(lectura);
                                if (opcionMantenCli != 1 && opcionMantenCli != 2 && opcionMantenCli != 3 && opcionMantenCli != 4 && opcionMantenCli != 5) {
                                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                                }
                                switch(opcionMantenCli){
                                    case 1:
                                        //Listar
                                        break;
                                    case 2:
                                        //Agregar
                                        break;
                                    case 3:
                                        //Editar
                                        break;
                                    case 4:
                                        //Borrar
                                        break;
                                }
                            }while(opcionMantenCli!=5);
                            break;
                        case 5:
                            int opcionMantenAplicaciones;
                            do{
                                //Se crea el menú de opciones de mantenimiento de aplicaciones de exámenes
                                lectura = JOptionPane.showInputDialog("*** Mantenimiento Aplicaciones Exámenes ***"
                                    + "\n 1- Listar datos \n 2- Agregar datos "
                                    + "\n 3- Editar datos \n 4- Borrar datos \n 5- Volver al menú anterior \nElija una opción del menú: ");
                                //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                                opcionMantenAplicaciones = Integer.parseInt(lectura);
                                if (opcionMantenAplicaciones != 1 && opcionMantenAplicaciones != 2 && opcionMantenAplicaciones != 3 && opcionMantenAplicaciones != 4 && opcionMantenAplicaciones != 5) {
                                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                                }
                                switch(opcionMantenAplicaciones){
                                    case 1:
                                        //Listar
                                        break;
                                    case 2:
                                        //Agregar
                                        break;
                                    case 3:
                                        //Editar
                                        break;
                                    case 4:
                                        //Borrar
                                        break;
                                }
                             break;
                            }while(opcionMantenAplicaciones!=5);
                    }
                    
                //Repetir hasta que el usuario digite el numero 6
                }while(opcionMantenimiento!=6);
                break;
                
            case 3:
                clientes.generarReportes();
                break;
            }        
          //Repetir hasta que el usuario digite el numero 4
        } while (opcion != 4);
    }
}
