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
    
    public int carnet[];
    public String nombre[];
    public String primerApellido[];
    public String segundoApellido[];
    public String especialidad[];
    public String cargo[];
    public String telefono[];
 
    
    public void listarDoctores(){
        //Se verifica si ya se han agregado doctores
        if (cantDoctores>0){
            for(int i=0;i<carnet.length;i++){
            //Si ya se han agregado se muestran en pantalla
                System.out.println("Doctor #"+(i+1));
                System.out.println( "Carnet: "+carnet[i]);
                System.out.println( "Nombre Completo: "+nombre[i]+" "+primerApellido[i]+" "+segundoApellido[i]);
                System.out.println( "Especialidad: "+especialidad[i]);
                System.out.println( "Cargo: "+cargo[i]);
                System.out.println( "Telefono: "+telefono[i]);
                System.out.println("");
            }
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }
    }
    
    public void agregarDoctores(int cant){
        //Se configura el tamano de los arreglos
        nombre = new String[cant];
        primerApellido = new String[cant];
        segundoApellido = new String[cant];
        especialidad = new String[cant];
        cargo = new String[cant];
        telefono = new String[cant];
        carnet = new int[cant];
        //Se crea un for para agregar la cantidad de doctores que el usuario desea
        for(int i=0;i<cant;i++){
            //Se solicita la informacion necesaria para agregar un doctor
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del doctor #"+(i+1)+": ");
            primerApellido[i] = JOptionPane.showInputDialog("Ingrese el primer apellido del doctor #"+(i+1)+": ");
            segundoApellido[i] = JOptionPane.showInputDialog("Ingrese el segundo apellido del doctor #"+(i+1)+": ");
            especialidad[i] = JOptionPane.showInputDialog("Ingrese la especialidad del doctor #"+(i+1)+": ");
            cargo[i] = JOptionPane.showInputDialog("Ingrese el cargo del doctor #"+(i+1)+": ");
            telefono[i] = JOptionPane.showInputDialog("Ingrese el teléfono del doctor #"+(i+1)+": ");
            //Se lleva un conteo de los doctores
            cantDoctores = cantDoctores+1;
            //Se le asigna un carnet al doctor
            carnet[i] = (int)(Math.random()*250)+100;
            //Mostrar mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El doctor ha sido agregado");
        }
    }
    public void editarDoctores(){
        //Se crea variable para verificar si se ha encontrado el carnet
        int encontrado=0;
        //Se solicita el carnet del doctor que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
        int buscarCarnet=Integer.parseInt(lectura);
        for(int i =0; i < carnet.length;i++){
            if(buscarCarnet==carnet[i]){
                //Si el carnet existe, se solicitan los nuevos datos del doctor y se actualizan los anteriores
                String Nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del doctor: ");
                nombre[i]=Nnombre;
                String NprimerApellido = JOptionPane.showInputDialog("Ingrese el nuevo primer apellido del doctor: ");
                primerApellido[i]=NprimerApellido;
                String NsegundoApellido = JOptionPane.showInputDialog("Ingrese el nuevo segundo apellido del doctor: ");
                segundoApellido[i]=NsegundoApellido;
                String Nespecialidad = JOptionPane.showInputDialog("Ingrese la nueva especialidad del doctor: ");
                especialidad[i]=Nespecialidad;
                String Ncargo = JOptionPane.showInputDialog("Ingrese el nuevo cargo del doctor: ");
                cargo[i] = Ncargo;
                String Ntelefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono del doctor: ");
                telefono[i]=Ntelefono;
                //Se muestra mensaje de verificacion
                JOptionPane.showMessageDialog(null, "El doctor ha sido modificado");
                encontrado=1;
            }
        }
        if(encontrado!=1){
            //Si no existe el carnet, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El doctor con el carnet "+buscarCarnet+ " no existe");
        }
    }
    public void eliminarDoctores(){
        //Se solicita el carnet del doctor que se desea modificar
      /*  String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
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
        }*/
    }
}
