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
public class Examen {
    //Se crea una variable para llevar el conteo de examenes
    private int cantExamenes=0;
    
    public int codigo;
    public String nombre;
    public String descripcion;
    public String requisitos;
    
    //Se crea una instancia de la clase tipo examen
    TipoExamen tipoExamen = new TipoExamen();
    
    public void listarExamenes(){
        //Se verifica si ya se han agregado examenes
        if (cantExamenes>0){
            //Si ya se han agregado se muestran en pantalla;
            System.out.println( "Codigo: "+codigo);
            System.out.println( "Nombre: "+nombre);
            System.out.println( "Descripcion: "+descripcion);
            System.out.println( "Requisitos: "+requisitos);
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado exámenes");
        }
    }
    
    public void agregarExamenes(){
        //Se pide seleccionar el tipo de examen que se desea agregar
        String lectura = JOptionPane.showInputDialog("Seleccione el tipo de examen: \n1- Sangre \n2- Hisopado \n3- Heces \n4- Otro");
        int opcionExamen = Integer.parseInt(lectura);
        if(opcionExamen==1){
            //Se agregan los datos para el examen de sangre
            tipoExamen.tp = tipoExamen.tp.SANGRE;
            //Se genera un codigo random
            codigo = (int)(Math.random()*400)+100;
            nombre = "Sangre";
            descripcion = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
            requisitos = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
        }else if(opcionExamen==2){
            //Se agregan los datos para el examen de hisopados
            tipoExamen.tp = tipoExamen.tp.HISOPADOS;
            //Se genera un codigo random
            codigo = (int)(Math.random()*400)+100;
            nombre = "Hisopados";
            descripcion = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
            requisitos = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
        }else if(opcionExamen==3){
            //Se agregan los datos para el examen de heces
            tipoExamen.tp = tipoExamen.tp.HECES;
            //Se genera un codigo random
            codigo = (int)(Math.random()*400)+100;
            nombre = "Heces";
            descripcion = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
            requisitos = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
        }else{
            //En caso de ser otro tipo de examen, solicitar los datos y el nombre del examen
            //Se genera un codigo random
            codigo = (int)(Math.random()*400)+100;
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del examen: ");
            descripcion = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
            requisitos = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
        }
        //Se lleva un conteo de la cantidad de examenes 
        cantExamenes= cantExamenes+1;
    }
    public void editarExamenes(){
        //Se solicita el codigo del examen que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea editar: ");
        int buscarCodigo=Integer.parseInt(lectura);
        if(buscarCodigo==codigo){
            //Si el código existe, se solicitan los nuevos datos del examen y se actualizan los anteriores
            String Ndescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del examen: ");
            descripcion=Ndescripcion;
            String Nrequisitos = JOptionPane.showInputDialog("Ingrese los nuevos requisitos del examen: ");
            requisitos=Nrequisitos;
            //Se muestra mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El examen ha sido modificado");
        }else{
            //Si no existe el codigo, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El examen con el código "+buscarCodigo+ " no existe");
        }
    }
    public void eliminarExamenes(){
        //Se solicita el codigo del examen que se desea eliminar
        String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea eliminar: ");
        int buscarCodigo=Integer.parseInt(lectura);
        if(buscarCodigo==codigo){
            //Se borra el examen con el codigo buscado
            codigo = 0;
            nombre = "";
            descripcion = "";
            requisitos = "";
            cantExamenes=0;
            JOptionPane.showMessageDialog(null, "El examen ha sido eliminado");
        }
        else{
            //Si no existe el codigo, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El examen con el código "+buscarCodigo+ " no existe");
        }
    }
}
