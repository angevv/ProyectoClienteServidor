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
    
    public int codigo[];
    public String nombre[];
    public String descripcion[];
    public String requisitos[];
    
    //Se crea una instancia de la clase tipo examen
    TipoExamen tipoExamen = new TipoExamen();
    
    public void listarExamenes(){
        //Se verifica si ya se han agregado examenes
        if (cantExamenes>0){
             for(int i=0;i<codigo.length;i++){
                //Si ya se han agregado se muestran en pantalla;
                System.out.println("Examen #"+(i+1));
                System.out.println( "Codigo: "+codigo[i]);
                System.out.println( "Nombre: "+nombre[i]);
                System.out.println( "Descripcion: "+descripcion[i]);
                System.out.println( "Requisitos: "+requisitos[i]);
             }
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado exámenes");
        }
    }
    
    public void agregarExamenes(int cant){
        //Se configura el tamano de los arreglos
        codigo = new int[cant];
        nombre = new String[cant];
        descripcion = new String[cant];
        requisitos = new String[cant];
         //Se crea un for para agregar la cantidad de examenes que el usuario desea
        for(int i=0;i<cant;i++){
            //Se pide seleccionar el tipo de examen que se desea agregar
            String lectura = JOptionPane.showInputDialog("Seleccione el tipo de examen: \n1- Sangre \n2- Hisopado \n3- Heces \n4- Otro");
            int opcionExamen = Integer.parseInt(lectura);
            if(opcionExamen==1 || opcionExamen==2 || opcionExamen==3){
                //Se genera un codigo random para el examen
                codigo[i] = (int)(Math.random()*400)+100;
                descripcion[i] = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
                requisitos[i] = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
                if(opcionExamen==1){
                    //Se agrega el nombre del examen para examen de sangre
                    tipoExamen.tp = tipoExamen.tp.SANGRE;   
                    nombre[i]=tipoExamen.tp.toString();
                    //nombre[i] = "Sangre";
                }else if(opcionExamen==2){
                    //Se agrega el nombre del examen para examen de hisopados
                    tipoExamen.tp = tipoExamen.tp.HISOPADOS; 
                    nombre[i]=tipoExamen.tp.toString();
                    //nombre[i] = "Sangre";
                }else{
                   //Se agrega el nombre del examen para examen de heces
                    tipoExamen.tp = tipoExamen.tp.SANGRE;           
                    nombre[i]=tipoExamen.tp.toString();
                    //nombre[i] = "Sangre";
                }
            }else{
                //En caso de ser otro tipo de examen, solicitar los datos y el nombre del examen
                //Se genera un codigo random
                codigo[i] = (int)(Math.random()*400)+100;
                nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del examen: ");
                descripcion[i] = JOptionPane.showInputDialog("Ingrese la descripción del examen: ");
                requisitos[i] = JOptionPane.showInputDialog("Ingrese los requisitos del examen: ");
            }
            //Se lleva un conteo de la cantidad de examenes 
            cantExamenes= cantExamenes+1;
            //Se muestra mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El examen ha sido agregado");
        }
    }
    public void editarExamenes(){
        //Se crea variable para verificar si se ha encontrado el codigo
        int encontrado=0;
        //Se solicita el codigo del examen que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea editar: ");
        int buscarCodigo=Integer.parseInt(lectura);
        for(int i =0; i < codigo.length;i++){
            if(buscarCodigo==codigo[i]){
                //Si el código existe, se solicitan los nuevos datos del examen y se actualizan los anteriores
                String Ndescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del examen: ");
                descripcion[i]=Ndescripcion;
                String Nrequisitos = JOptionPane.showInputDialog("Ingrese los nuevos requisitos del examen: ");
                requisitos[i]=Nrequisitos;
                //Se muestra mensaje de verificacion
                JOptionPane.showMessageDialog(null, "El examen ha sido modificado");
                //Se le asigna 1 a encontrado
                encontrado=1;
            }
        }
        if(encontrado!=1){
            //Si no existe el codigo, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El examen con el código "+buscarCodigo+ " no existe");
        }
    }
    public void eliminarExamenes(){
        //Se solicita el codigo del examen que se desea eliminar
       /* String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea eliminar: ");
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
        }*/
    }
}
