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
public class Doctor {
    //Se crea variable para llevar el conteo de los doctores 
    private int cantDoctores=0;
    
    public int carnet;
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public String especialidad;
    public String cargo;
    public String telefono;
 
    
    public void listarDoctores(){
        //Se verifica si ya se han agregado doctores
        if (cantDoctores>0){
            //Si ya se han agregado se muestran en pantalla;
            System.out.println( "Carnet: "+carnet);
            System.out.println( "Nombre Completo: "+nombre+" "+primerApellido+" "+segundoApellido);
            System.out.println( "Especialidad: "+especialidad);
            System.out.println( "Cargo: "+cargo);
            System.out.println( "Telefono: "+telefono);
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }
    }
    
    public void agregarDoctores(){
        //Se solicita la informacion necesaria para agregar un doctor
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del doctor: ");
        primerApellido = JOptionPane.showInputDialog("Ingrese el primer apellido del doctor: ");
        segundoApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido del doctor: ");
        especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del doctor: ");
        cargo = JOptionPane.showInputDialog("Ingrese el cargo del doctor: ");
        telefono = JOptionPane.showInputDialog("Ingrese el teléfono del doctor: ");
        //Se lleva un conteo de los doctores
        cantDoctores = cantDoctores+1;
        //Se le asigna un carnet al doctor
        carnet = (int)(Math.random()*250)+100;
        //Mostrar mensaje de verificacion
        JOptionPane.showMessageDialog(null, "El doctor ha sido agregado");
    }
    public void editarDoctores(){
        //Se solicita el carnet del doctor que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
        int buscarCarnet=Integer.parseInt(lectura);
        if(buscarCarnet==carnet){
            //Si el carnet existe, se solicitan los nuevos datos del doctor y se actualizan los anteriores
            String Nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del doctor: ");
            nombre=Nnombre;
            String NprimerApellido = JOptionPane.showInputDialog("Ingrese el nuevo primer apellido del doctor: ");
            primerApellido=NprimerApellido;
            String NsegundoApellido = JOptionPane.showInputDialog("Ingrese el nuevo segundo apellido del doctor: ");
            segundoApellido=NsegundoApellido;
            String Nespecialidad = JOptionPane.showInputDialog("Ingrese la nueva especialidad del doctor: ");
            especialidad=Nespecialidad;
            String Ncargo = JOptionPane.showInputDialog("Ingrese el nuevo cargo del doctor: ");
            cargo = Ncargo;
            String Ntelefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono del doctor: ");
            telefono=Ntelefono;
            //Se muestra mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El doctor ha sido modificado");
        }else{
            //Si no existe la cedula, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El doctor con el carnet "+buscarCarnet+ " no existe");
        }
    }
    public void eliminarDoctores(){
        //Se solicita el carnet del doctor que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
        int buscarCarnet=Integer.parseInt(lectura);
        if(buscarCarnet==carnet){
            //Se borra el doctor con el carnet buscado
            carnet = 0;
            nombre = "";
            primerApellido = "";
            segundoApellido = "";
            especialidad="";
            cargo = "";
            telefono = "";
            cantDoctores=0;
            JOptionPane.showMessageDialog(null, "El doctor ha sido eliminado");
        }
        else{
            //Si no existe el carnet, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El doctor con el carnet "+buscarCarnet+ " no existe");
        }
    }
}
