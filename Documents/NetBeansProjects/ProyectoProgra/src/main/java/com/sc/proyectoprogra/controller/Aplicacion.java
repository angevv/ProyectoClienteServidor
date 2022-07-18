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
    
    //Se crea una instancia de la clase doctor, cliente y examen
    Doctor doctores = new Doctor();
    Cliente clientes = new Cliente();
    Examen examenes = new Examen();
    
    //Se crea una matriz para guardar los datos de las aplicaciones
    public String aplicaciones[][];
        
    SimpleDateFormat sdf;
             
    //Se crea un constructor de aplicacion
    public Aplicacion(){
        //Se crea un formato para la fecha
        sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
    }
    
    public void listarAplicaciones(){
        //Se verifica si ya se han agregado aplicaciones
        if (cantAplicaciones>0){
            for(int i=0;i<cantAplicaciones;i++){
                for(int j=0;j<5;j++){
                //Si ya se han agregado se muestran en pantalla;
                System.out.println( "Numero de Aplicacion: "+aplicaciones[i][0]);
                int codExamen = Integer.parseInt(aplicaciones[i][1]);
                for (int idExamen=0;idExamen < examenes.codigo.length;idExamen++){
                    if(codExamen==examenes.codigo[idExamen]){
                        System.out.println( "Examen: "+examenes.nombre[idExamen]);
                    }
                }
                int codDoct = Integer.parseInt(aplicaciones[i][2]);
                for (int idDoct=0;idDoct < doctores.carnet.length;idDoct++){
                    if(codDoct==doctores.carnet[idDoct]){
                        System.out.println( "Doctor a cargo: "+doctores.nombre[idDoct]+" "+doctores.primerApellido[idDoct]+" "+doctores.segundoApellido[idDoct]);
                    }
                }
                for (int idCli=0;idCli < clientes.cedula.length;idCli++){
                    if(aplicaciones[i][3].equals(clientes.cedula[idCli])){
                        System.out.println( "Cliente: "+clientes.nombre[idCli]+" "+clientes.primerApellido[idCli]+" "+clientes.segundoApellido[idCli]);
                    }
                }
                System.out.println( "Fecha: "+aplicaciones[i][4]);
                }
                System.out.println("");
            }
        }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado aplicaciones");
        }
    }
    
    public void agregarAplicaciones(int cant) {
        //Se crea el tamano de la matriz
        aplicaciones = new String[cant][5];
        for (int i = 0; i < cant; i++) {
            String lectura = JOptionPane.showInputDialog("Ingrese la cédula del cliente al que desea agendarle la aplicación de un examen: ");
    
            System.out.println(clientes.CantCliente());
            for (int buscarC = 0; buscarC < clientes.CantCliente(); buscarC++) {
                if (clientes.cedula[buscarC].equals(lectura)) {
                    lectura = JOptionPane.showInputDialog("Ingrese el código del examen: ");
                    int codigo = Integer.parseInt(lectura);
                    for (int buscarCo = 0; buscarCo < examenes.codigo.length; buscarCo++) {
                        if (codigo == examenes.codigo[buscarCo]) {
                            lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor asignado: ");
                            int carnet = Integer.parseInt(lectura);
                            for (int buscarCar = 0; buscarCar < doctores.carnet.length; buscarCar++) {
                                if (carnet == doctores.carnet[buscarCar]) {
                                    //Se crea un numero random de aplicacion
                                    numAplicacion = (int) (Math.random() * 500) + 50;
                                    Random aleatorio;
                                    aleatorio = new Random();
                                    fechaAplicacion = Calendar.getInstance();
                                    //Se crea una fecha random para la aplicacion del examen
                                    fechaAplicacion.set(aleatorio.nextInt(1) + 2023, aleatorio.nextInt(12) + 1, aleatorio.nextInt(30) + 1);
                                    //Se imprime el numero y la fecha
                                    System.out.println("La aplicacion del examen #" + numAplicacion + " tiene fecha para " + sdf.format(fechaAplicacion.getTime()));
                                    cantAplicaciones = cantAplicaciones + 1;
                                    //Se llena la matriz con los datos generados y los datos del cliente, doctor y examen
                                    aplicaciones[i][0]=Integer.toString(numAplicacion);
                                    aplicaciones[i][1]=Integer.toString(examenes.codigo[buscarCo]);
                                    aplicaciones[i][2]=Integer.toString(doctores.carnet[buscarCar]);
                                    aplicaciones[i][3]=clientes.cedula[buscarC];
                                    aplicaciones[i][4]=sdf.format(fechaAplicacion.getTime());
                                } else {
                                    JOptionPane.showMessageDialog(null, "El doctor con el carnet " + carnet + " no existe");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El examen con el código " + codigo + " no existe");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente con la cédula " + lectura + " no existe");
                }
            }

        }

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
