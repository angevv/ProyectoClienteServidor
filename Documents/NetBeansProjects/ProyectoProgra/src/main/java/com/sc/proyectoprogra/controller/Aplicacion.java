/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Aplicacion {
    
    //Se crea variable para llevar el conteo de las aplicaciones
    int cantAplicaciones=0;
    int numAplicacion=0;
    Calendar fechaAplicacion;
    
    public Cliente clientes;
    public Doctor doctores;
    public Examen examenes;
        
    SimpleDateFormat sdf;
             
    //Se crea un constructor de aplicacion
    public Aplicacion(){
        //Se crea un formato para la fecha
        sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
    }
    
    public void listarAplicaciones(){
        //Se verifica si ya se han agregado aplicaciones
       /* if (cantAplicaciones>0){
            //Si ya se han agregado se muestran en pantalla;
            System.out.println( "Numero de Aplicacion: "+numAplicacion);
            System.out.println( "Examen: "+examenes.nombre);
            System.out.println( "Doctor a cargo: "+doctores.nombre);
            System.out.println( "Cliente: "+clientes.nombre+" "+clientes.primerApellido+" "+clientes.segundoApellido);
            System.out.println( "Fecha: "+sdf.format(fechaAplicacion.getTime()));
        }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado doctores");
        }*/
    }
    
    public void agregarAplicaciones(){
        //Se crea un numero random de aplicacion
        numAplicacion=(int)(Math.random()*500)+50;
        Random aleatorio;
        aleatorio = new Random();
        fechaAplicacion = Calendar.getInstance();
        //Se crea una fecha random para la aplicacion del examen
        fechaAplicacion.set (aleatorio.nextInt(1)+2023, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        //Se imprime el numero y la fecha
        System.out.println("La aplicacion del examen #"+numAplicacion+" tiene fecha para "+sdf.format(fechaAplicacion.getTime()));
        cantAplicaciones=cantAplicaciones+1;

    }
    
    public void editarrAplicaciones(){
        //Se solicita el numero de aplicacion que se desea modificar
       /* String lectura = JOptionPane.showInputDialog("Ingrese el número de la aplicación examen que desea editar: ");
        int buscarAplicacion=Integer.parseInt(lectura);
        if(buscarAplicacion==numAplicacion){
            //Si el numero existe, se solicitan los nuevos datos de la aplicacion del examen y se actualizan los anteriores
            lectura = JOptionPane.showInputDialog("Ingrese el código del nuevo examen: ");
            int Ncodigo=Integer.parseInt(lectura);
            examenes.codigo=Ncodigo;
            lectura = JOptionPane.showInputDialog("Ingrese el carnet del nuevo doctor: ");
            int Ncarnet=Integer.parseInt(lectura);
            doctores.carnet=Ncarnet;
            lectura = JOptionPane.showInputDialog("Desea cambiar la fecha de la aplicación del examen: Si/No");
            if(lectura=="Si"){
                Random aleatorio;
                aleatorio = new Random();
                fechaAplicacion = Calendar.getInstance();
                //Se crea una fecha random para la aplicacion del examen
                fechaAplicacion.set (aleatorio.nextInt(1)+2023, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
                //Se imprime el numero y la fecha
                System.out.println("La aplicacion del examen #"+numAplicacion+" tiene una nueva fecha para "+sdf.format(fechaAplicacion.getTime()));
            }
            //Se muestra mensaje de verificacion
            JOptionPane.showMessageDialog(null, "La aplicación del examen ha sido modificado");
        }else{
            //Si no existe el numero, mostrar mensaje
             JOptionPane.showMessageDialog(null, "La aplicación con el #"+buscarAplicacion+ " no existe");
        }*/
    }
    
    public void eliminarAplicaciones(){
        //Se solicita el numero de aplicacion que se desea modificar
        /*String lectura = JOptionPane.showInputDialog("Ingrese el número de la aplicación examen que desea editar: ");
        int buscarAplicacion=Integer.parseInt(lectura);
        if(buscarAplicacion==numAplicacion){
            //Se borra la aplicacion
            numAplicacion = 0;
            examenes.codigo=0;
            doctores.carnet=0;
            cantAplicaciones=0;
            JOptionPane.showMessageDialog(null, "La aplicación del examen ha sido eliminado");
        }
        else{
            //Si no existe el carnet, mostrar mensaje
              JOptionPane.showMessageDialog(null, "La aplicación con el #"+buscarAplicacion+ " no existe");
        }*/
    }
}
