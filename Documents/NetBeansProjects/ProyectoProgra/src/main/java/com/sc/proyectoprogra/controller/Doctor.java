/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Doctor {
    //Se crea variable para llevar el conteo de los doctores 
    public static int cantDoctores=0;
    
    //Se crean los arreglos con las respectivas dimensiones
    public static int carnet[] = new int[100];
    public static String nombre[]= new String[100];
    public static String primerApellido[]= new String[100];
    public static String segundoApellido[]= new String[100];
    public static String especialidad[]= new String[100];
    public static String cargo[]= new String[100];
    public static String telefono[]= new String[100];
 
    
    public void listarDoctores(){
        //Se verifica si ya se han agregado doctores
        if (cantDoctores>0){
            System.out.println("");
            System.out.println("********** Doctores **********");
            //Se crea un for para recorrer todos los arreglos
            for(int i=0;i<carnet.length;i++){
                //Se indica que los campos que tengan valor null no se impriman
                if(nombre[i]!=null){
                //Si muestran los datos en pantalla
                    System.out.println("");
                    System.out.println("Doctor #"+(i+1));
                    System.out.println( "Carnet: "+carnet[i]);
                    System.out.println( "Nombre Completo: "+nombre[i]+" "+primerApellido[i]+" "+segundoApellido[i]);
                    System.out.println( "Especialidad: "+especialidad[i]);
                    System.out.println( "Cargo: "+cargo[i]);
                    System.out.println( "Telefono: "+telefono[i]);
                }
            }
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }
    }
    
    public void agregarDoctores(int cant){
        //Se crea un for para agregar la cantidad de doctores que el usuario desea
        for(int c=0;c<cant;c++){
            //Se recorre todo el arreglo y se indica que en el campo que tenga valor null, agregar la informacion
           for(int i=0;i<100;i++ ){
                if(nombre[i]==null){
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
                    break;
                }
           }
        }
    }
    public void editarDoctores(){
        //Se verifica que se hayan registrado doctores
        if (cantDoctores>0){
            //Se crea variable para verificar si se ha encontrado el carnet
            int encontrado=0;
            //Se solicita el carnet del doctor que se desea modificar
            String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
            int buscarCarnet=Integer.parseInt(lectura);
            //Se compara el carnet con los carnet del arreglo
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
         }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }
    }
    public void eliminarDoctores(){
        //Se verifica que se hayan ingresado doctores
        int encontrado=0;
        if (cantDoctores>0){
            //Se solicita el carnet del doctor que se desea modificar
            String lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor que desea editar: ");
              int buscarCarnet=Integer.parseInt(lectura);
              //Se compara el carnet con los carnet del arreglo
              for(int i =0;i<cantDoctores;i++){
              if(buscarCarnet==carnet[i]){
                  //Si el carnet se encuentra, se crean arreglos con un campo menos que el arreglo original
                    int[] nuevosCarnet = new int[carnet.length - 1];
                    String[] nuevosNombres = new String[nombre.length - 1];
                    String[] nuevoPrimerA = new String[primerApellido.length - 1];
                    String[] nuevoSegundoA = new String[segundoApellido.length - 1];
                    String[] nuevoEspeci = new String[especialidad.length - 1];
                    String[] nuevoCargo = new String[cargo.length - 1];
                    String[] nuevoTelef = new String[telefono.length - 1];
                    
                    //Se copian los datos antes del dato especificado del arreglo original al nuevo
                    System.arraycopy(carnet, 0, nuevosCarnet, 0, i);
                    System.arraycopy(nombre, 0, nuevosNombres, 0, i);
                    System.arraycopy(primerApellido, 0, nuevoPrimerA, 0, i);
                    System.arraycopy(segundoApellido, 0, nuevoSegundoA, 0, i);
                    System.arraycopy(especialidad, 0, nuevoEspeci, 0, i);
                    System.arraycopy(cargo, 0, nuevoCargo, 0, i);
                    System.arraycopy(telefono, 0, nuevoTelef, 0, i);
                    
                    if (carnet.length != i) {
                        //Se terminan de copiar los datos, menos el dato especificado
                        System.arraycopy(carnet, i + 1, nuevosCarnet, i, carnet.length - i - 1);
                        System.arraycopy(nombre, i + 1, nuevosNombres, i, nombre.length - i - 1);
                        System.arraycopy(primerApellido, i + 1, nuevoPrimerA, i, primerApellido.length - i - 1);
                        System.arraycopy(segundoApellido, i + 1, nuevoSegundoA, i, segundoApellido.length - i - 1);
                        System.arraycopy(especialidad, i + 1, nuevoEspeci, i, especialidad.length - i - 1);
                        System.arraycopy(cargo, i + 1, nuevoCargo, i, cargo.length - i - 1);
                        System.arraycopy(telefono, i + 1, nuevoTelef, i, telefono.length - i - 1);
                    }
                    
                    //Se pasan los nuevos datos a los arreglos originales
                    carnet = Arrays.copyOf(nuevosCarnet, nuevosCarnet.length);
                    nombre = Arrays.copyOf(nuevosNombres, nuevosNombres.length);
                    primerApellido = Arrays.copyOf(nuevoPrimerA, nuevoPrimerA.length);
                    segundoApellido = Arrays.copyOf(nuevoSegundoA, nuevoSegundoA.length);
                     especialidad = Arrays.copyOf(nuevoEspeci, nuevoEspeci.length);
                    cargo = Arrays.copyOf(nuevoCargo, nuevoCargo.length);
                    telefono = Arrays.copyOf(nuevoTelef, nuevoTelef.length);
                    
              
                    encontrado=1;
                    //Se muestra mensaje de verificacion
                    JOptionPane.showMessageDialog(null, "El doctor ha sido eliminado");
                    //Se reduce la cantidad de doctores
                    cantDoctores=cantDoctores-1;
                    break;
                  
              }
              }
              if(encontrado!=1){
                  //Si no existe el carnet, mostrar mensaje
                   JOptionPane.showMessageDialog(null, "El doctor con el carnet "+buscarCarnet+ " no existe");
              }
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }
       
    }
    
    //Se crea una funcion para devolver la cantidad de doctores
    public int CantDoctores(){
       
        return cantDoctores;
    }
}
