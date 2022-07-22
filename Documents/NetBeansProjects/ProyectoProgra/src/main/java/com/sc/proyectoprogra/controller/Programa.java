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
        //Se crean clientes, doctores, aplicaciones, examenes y tipoExamenes de cada clase 
        Cliente clientes = new Cliente();
        Doctor doctores = new Doctor();
        Aplicacion aplicaciones = new Aplicacion();
        Examen examenes = new Examen();
        
    //Se crea el menu del programa
    public void menu(){
        
        //Se crea un try catch para evitar que el programa se caiga
        try {
        
            int opcion;
            //Se crea un do while para que el menú se repita hasta que el usuario decida salir
            do {
                //Se desarrolla el menu principal 
                String lectura = JOptionPane.showInputDialog("********** Menú Principal **********"
                        + "\n 1- Opciones de mantenimiento "
                        + "\n 2- Reportes \n 3- Salir \nElija una opción del menú: ");
                //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                opcion = Integer.parseInt(lectura);
                //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
                if (opcion != 1 && opcion != 2 && opcion != 3 ) {
                    JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                } 
                //Se crea un switch para las opciones del menú
                switch (opcion){
                case 1:
                    int opcionMantenimiento;
                    do{
                        //Se crea el menú de mantenimiento para las entidades
                        lectura = JOptionPane.showInputDialog("******** Menú de Mantenimiento ********"
                            + "\n 1- Exámenes "
                            + "\n 2- Doctores \n 3- Clientes  \n 4- Aplicaciones Exámenes \n 5- Volver al menú principal \nElija una opción del menú: ");
                        //Se convierte el valor lectura a entero para poder comparar la opcion con el menu
                        opcionMantenimiento = Integer.parseInt(lectura);
                        //Si la opcion no se encuentra en el menu, mostrar un mensaje de alerta
                        if (opcionMantenimiento != 1 && opcionMantenimiento != 2 && opcionMantenimiento != 3 && opcionMantenimiento != 4 && opcionMantenimiento != 5) {
                            JOptionPane.showMessageDialog(null, "No existe esa opción en el menú");
                        }
                        switch(opcionMantenimiento){
                            case 1:
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
                                            //Se llama a la funcion listar examenes
                                            examenes.listarExamenes();
                                            break;
                                        case 2:
                                            //Se solicita la cantidad de examenes que se desean agregar y se llama a la funcion
                                            lectura = JOptionPane.showInputDialog("Digite la cantidad de exámenes que desea ingresar: ");
                                            int cantExam=Integer.parseInt(lectura);
                                            examenes.agregarExamenes(cantExam);
                                            break;
                                        case 3:
                                            //Se llama a la funcion editar examenes
                                            examenes.editarExamenes();
                                            break;
                                        case 4:
                                            //Se llama a la funcion borrar examenes
                                            examenes.eliminarExamenes();
                                            break;
                                        default:
                                            opcionMantenExam=5;
                                            break;
                                    }
                                }while(opcionMantenExam!=5);
                                break;
                            case 2:
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
                                            //Se llama a la funcion listar doctores
                                           doctores.listarDoctores();
                                            break;
                                        case 2:
                                            //Se solicita la cantidad de doctores que se desea ingresar y se llama a la funcion
                                            lectura = JOptionPane.showInputDialog("Digite la cantidad de doctores que desea ingresar: ");
                                            int canDoc=Integer.parseInt(lectura);
                                            doctores.agregarDoctores(canDoc);
                                            break;
                                        case 3:
                                            //Se llama a la funcion editar doctores
                                            doctores.editarDoctores();                                      
                                            break;
                                        case 4:
                                            //Se llama a la funcion eliminar doctores
                                            doctores.eliminarDoctores();
                                            break;
                                        default:
                                            opcionMantenDoc=5;
                                            break;
                                    }
                                }while(opcionMantenDoc!=5);
                                break;
                            case 3:
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
                                            //Se llama a la funcion listar clientes
                                            clientes.listarClientes();
                                            break;
                                        case 2:
                                            //Se solicita la cantidad de clientes que desea agregar y se llama a la funcion
                                            lectura = JOptionPane.showInputDialog("Digite la cantidad de clientes que desea ingresar: ");
                                            int cantCli=Integer.parseInt(lectura);
                                            clientes.agregarClientes(cantCli);
                                            break;
                                        case 3:
                                            //Se llama a la funcion editar clientes
                                            clientes.editarClientes();
                                            break;
                                        case 4:
                                            //Se llama a la funcion borrar clientes
                                            clientes.borrarClientes();
                                            break;
                                        default:
                                            opcionMantenCli=5;
                                            break;               
                                    }
                                }while(opcionMantenCli!=5);
                                break;
                            case 4:
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
                                            //Se llama a la funcion listar aplicaciones
                                            aplicaciones.listarAplicaciones();
                                            break;
                                        case 2:
                                            //Se solicita la cantidad de aplicaciones que se desea agregar y se llama a la funcion
                                            lectura = JOptionPane.showInputDialog("Digite la cantidad de aplicaciones de exámenes que desea agregar: ");
                                            int cantApli=Integer.parseInt(lectura);
                                            aplicaciones.agregarAplicaciones(cantApli);
                                            break;
                                        case 3:
                                            //Se llama a la funcion editar aplicacionez
                                            aplicaciones.editarrAplicaciones();
                                            break;
                                        case 4:
                                            //Se llama a la funcion borrar aplicaciones
                                            aplicaciones.eliminarAplicaciones();
                                            break;
                                        default:
                                            opcionMantenAplicaciones=5;
                                            break;
                                    }                           
                                }while(opcionMantenAplicaciones!=5);
                                break;
                        }

                    //Repetir hasta que el usuario digite el numero 5
                    }while(opcionMantenimiento!=5);
                    break;

                case 2:
                    //Se llama a la funcion generar reportes
                    aplicaciones.GenerarReportes();
                    break;
                default:
                    opcion=3;
                    break;
                }   
              //Repetir hasta que el usuario digite el numero 3
            } while (opcion != 3);
    
            }  catch (Exception  e1) {

                
           } 
        
        }
        
        
}
