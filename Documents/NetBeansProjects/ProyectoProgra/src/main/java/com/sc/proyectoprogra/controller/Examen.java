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
public class Examen {
    //Se crea una variable para llevar el conteo de examenes
    public static int cantExamenes=0;
    
    //Se crean los arreglos con las dimensiones especificas
    public static int codigo[] = new int[100];
    public static String nombre[]= new String[100];
    public static String descripcion[]= new String[100];
    public static String requisitos[]= new String[100];
    
    //Se crea una instancia de la clase tipo examen
    TipoExamen tipoExamen = new TipoExamen();
    
    public void listarExamenes(){
        //Se verifica si ya se han agregado examenes
        if (cantExamenes>0){
            System.out.println("");
             System.out.println("********** Examenes **********");
             //Se crea un for para recorrer todos los arreglos y se indica que los valores null no se imprimen
             for(int i=0;i<codigo.length;i++){
                if(nombre[i]!=null){
                    //Si ya se han agregado se muestran en pantalla;
                    System.out.println("");
                    System.out.println("Examen #"+(i+1));
                    System.out.println( "Codigo: "+codigo[i]);
                    System.out.println( "Nombre: "+nombre[i]);
                    System.out.println( "Descripcion: "+descripcion[i]);
                    System.out.println( "Requisitos: "+requisitos[i]);
                }
             }
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado exámenes");
        }
    }
    
    public void agregarExamenes(int cant){
         //Se crea un for para agregar la cantidad de examenes que el usuario desea
        for(int c=0;c<cant;c++){
          for(int i=0;i<100;i++ ){
              //Se indica que donde se encuentre un valor null, agregar el nuevo dato
               if(nombre[i]==null){
                    //Se pide seleccionar el tipo de examen que se desea agregar
                    String lectura = JOptionPane.showInputDialog("Seleccione el tipo de examen: \n1- Sangre \n2- Hisopado \n3- Heces \n4- Otro");
                    int opcionExamen = Integer.parseInt(lectura);
                    if(opcionExamen==1 || opcionExamen==2 || opcionExamen==3){
                        //Se genera un codigo random para el examen
                        codigo[i] = (int)(Math.random()*400)+100;
                        //Se solicita informacion adicional
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
                            tipoExamen.tp = tipoExamen.tp.HECES;           
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
                    break;
               }
          }
        }
    }
        
    public void editarExamenes(){
        //Se verifica si ya se han agregado examenes
        if (cantExamenes>0){
            //Se crea variable para verificar si se ha encontrado el codigo
            int encontrado=0;
            //Se solicita el codigo del examen que se desea modificar
            String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea editar: ");
            int buscarCodigo=Integer.parseInt(lectura);
            //Se compara el codigo con los codigos del arreglo
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
        }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado exámenes");
        }
    }
    public void eliminarExamenes(){
        int encontrado=0;
        //Se verifica si ya se han agregado examenes
        if (cantExamenes>0){
            //Se solicita el codigo del examen que se desea eliminar
           String lectura = JOptionPane.showInputDialog("Ingrese el código del examen que desea eliminar: ");
            int buscarCodigo=Integer.parseInt(lectura);
            //Se compara el codigo con los codigos del arreglo
            for(int i=0;i<cantExamenes;i++){
                if(buscarCodigo==codigo[i]){
                    //Si el codigo se encuentra, se crean arreglos con un campo menos que el arreglo original
                    int[] nuevosCodigos = new int[codigo.length - 1];
                    String[] nuevosNombres = new String[nombre.length - 1];
                    String[] nuevosDescrip = new String[descripcion.length - 1];
                    String[] nuevosRequi = new String[requisitos.length - 1];

                     //Se copian los datos antes del dato especificado, del arreglo original al nuevo
                    System.arraycopy(codigo, 0, nuevosCodigos, 0, i);
                    System.arraycopy(nombre, 0, nuevosNombres, 0, i);
                    System.arraycopy(descripcion, 0, nuevosDescrip, 0, i);
                    System.arraycopy(requisitos, 0, nuevosRequi, 0, i);
                    if (codigo.length != i) {
                        //Se terminan de copiar los datos, menos el dato especificado
                        System.arraycopy(codigo, i + 1, nuevosCodigos, i, codigo.length - i - 1);
                        System.arraycopy(nombre, i + 1, nuevosNombres, i, nombre.length - i - 1);
                        System.arraycopy(descripcion, i + 1, nuevosDescrip, i, descripcion.length - i - 1);
                        System.arraycopy(requisitos, i + 1, nuevosRequi, i, requisitos.length - i - 1);
                    }
  
                    //Se pasan los nuevos datos a los arreglos originales
                    codigo = Arrays.copyOf(nuevosCodigos, nuevosCodigos.length);
                    nombre = Arrays.copyOf(nuevosNombres, nuevosNombres.length);
                    descripcion = Arrays.copyOf(nuevosDescrip, nuevosDescrip.length);
                    requisitos = Arrays.copyOf(nuevosRequi, nuevosRequi.length);
                    
              
                    encontrado=1;
                    //Se muestra mensaje de verificacion
                     JOptionPane.showMessageDialog(null, "El examen se ha eliminado");
                     //Se reducen la cantidad de examenes
                     cantExamenes=cantExamenes-1;
                    break;
            }
            
            }
             if(encontrado!=1){
                //Si no existe el codigo, mostrar mensaje
                 JOptionPane.showMessageDialog(null, "El examen con el código "+buscarCodigo+ " no existe");
            }
       }else{
            //Si no se han agregado doctores, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado exámenes");
        }
    }
    
    //Se crea una funcion que devuelve la cantidad de examenes
    public int CantExamenes(){
       
        return cantExamenes;
    }
}
