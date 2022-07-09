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
        //Se crean clientes, doctores, aplicaciones, examenes y tipoExamenes de cada clase
        Cliente clientes = new Cliente();
        Doctor doctores = new Doctor();
        Aplicacion aplicaciones = new Aplicacion();
        Examen examenes = new Examen();
        TipoExamen tipoExamenes = new TipoExamen();
        
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
                        + "\n 1- Tipo de examen \n 2- Exámenes "
                        + "\n 3- Doctores \n 4- Clientes  \n 5- Aplicaciones Exámenes \n 6- Volver al menú principal \nElija una opción del menú: ");
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
                                        tipoExamenes.listarTipoExam();
                                        break;
                                    case 2:
                                        //Agregar 
                                        tipoExamenes.agregarTipoExam();
                                        break;
                                    case 3:
                                        //Editar
                                        tipoExamenes.editarTipoExam();
                                        break;
                                    case 4:
                                        //Borrar
                                        tipoExamenes.eliminarTipoExam();
                                        break;
                                    default:
                                        opcionMantenTipo=5;
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
                                        examenes.listarExamenes();
                                        break;
                                    case 2:
                                        //Agregar
                                        examenes.agregarExamenes();
                                        break;
                                    case 3:
                                        //Editar
                                        examenes.editarExamenes();
                                        break;
                                    case 4:
                                        //Borrar
                                        examenes.eliminarExamenes();
                                        break;
                                    default:
                                        opcionMantenExam=5;
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
                                       doctores.listarDoctores();
                                        break;
                                    case 2:
                                        //Agregar
                                        doctores.agregarDoctores();
                                        break;
                                    case 3:
                                        //Editar
                                        doctores.editarDoctores();                                      
                                        break;
                                    case 4:
                                        //Borrar
                                        doctores.eliminarDoctores();
                                        break;
                                    default:
                                        opcionMantenDoc=5;
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
                                        clientes.listarClientes();
                                        break;
                                    case 2:
                                        //Agregar
                                        clientes.agregarClientes();
                                        break;
                                    case 3:
                                        //Editar
                                        clientes.editarClientes();
                                        break;
                                    case 4:
                                        //Borrar
                                        clientes.borrarClientes();
                                        break;
                                    default:
                                        opcionMantenCli=5;
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
                                        aplicaciones.listarAplicaciones();
                                        break;
                                    case 2:
                                        //Agregar
                                        lectura = JOptionPane.showInputDialog("Ingrese la cédula del cliente al que desea agendarle la aplicación de un examen: ");
                                        if (lectura.equals(clientes.cedula)){
                                            lectura = JOptionPane.showInputDialog("Ingrese el código del examen: ");
                                            int codigo = Integer.parseInt(lectura);
                                            if(codigo==examenes.codigo){
                                                lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor asignado: ");
                                                int carnet = Integer.parseInt(lectura);
                                                if(carnet==doctores.carnet){
                                                    aplicaciones.agregarAplicaciones();
                                                    }else{
                                                        JOptionPane.showMessageDialog(null, "El doctor con el carnet "+carnet+ " no existe");
                                                    }
                                                }else{
                                                    JOptionPane.showMessageDialog(null, "El examen con el código "+codigo+ " no existe");
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(null, "El cliente con la cédula "+lectura+ " no existe");
                                            }
                                        break;
                                    case 3:
                                        //Editar
                                        aplicaciones.editarrAplicaciones();
                                        break;
                                    case 4:
                                        //Borrar
                                        aplicaciones.eliminarAplicaciones();
                                        break;
                                    default:
                                        opcionMantenAplicaciones=5;
                                        break;
                                }
                             break;
                            }while(opcionMantenAplicaciones!=5);
                    }
                    
                //Repetir hasta que el usuario digite el numero 6
                }while(opcionMantenimiento!=6);
                break;
                
            case 2:
                clientes.generarReportes();
                break;
            default:
                opcion=3;
                break;
            }   
          //Repetir hasta que el usuario digite el numero 3
        } while (opcion != 3);
    }
}
