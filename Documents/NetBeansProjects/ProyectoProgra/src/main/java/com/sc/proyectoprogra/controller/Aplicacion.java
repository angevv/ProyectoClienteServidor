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
            System.out.println("");
             System.out.println("****** Aplicaciones de Examenes ******");
            for(int i=0;i<cantAplicaciones;i++){
                if(aplicaciones[i][0]==null){
                    
                }else{
                //Si ya se han agregado se muestran en pantalla;
                System.out.println("");
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
            }
        }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado aplicaciones");
        }
    }
    
    public void agregarAplicaciones(int cant) {
        //Se declaran variables de encontrado
        int encontradoCli=0;
        int encontradoDoc=0;
        int encontradoExam=0;
        //Se crea el tamano de la matriz
        aplicaciones = new String[cant][5];
        for (int i = 0; i < cant; i++) {
            String lectura = JOptionPane.showInputDialog("Ingrese la cédula del cliente al que desea agendarle la aplicación de un examen: ");
    
           // System.out.println(clientes.CantCliente());
            //System.out.println(clientes.cedula[0]);
            for (int buscarC = 0; buscarC < clientes.CantCliente(); buscarC++) {
                if (clientes.cedula[buscarC].equals(lectura)) {
                    encontradoCli=1;
                    lectura = JOptionPane.showInputDialog("Ingrese el código del examen: ");
                    int codigo = Integer.parseInt(lectura);
                    for (int buscarCo = 0; buscarCo < examenes.CantExamenes(); buscarCo++) {
                        if (codigo == examenes.codigo[buscarCo]) {
                            encontradoExam=1;
                            lectura = JOptionPane.showInputDialog("Ingrese el carnet del doctor asignado: ");
                            int carnet = Integer.parseInt(lectura);
                            for (int buscarCar = 0; buscarCar < doctores.CantDoctores(); buscarCar++) {
                                if (carnet == doctores.carnet[buscarCar]) {
                                    encontradoDoc=1;
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
                                } 
                            }
                        } 
                    }
                } 
            }
            if(encontradoCli!=1){
                JOptionPane.showMessageDialog(null, "El cliente con esa cédula no existe");
            }
            else if(encontradoExam!=1){
                JOptionPane.showMessageDialog(null, "El examen con ese código no existe");
            }
            else if(encontradoDoc!=1){
                JOptionPane.showMessageDialog(null, "El doctor con ese carnet no existe");
            }

        }

    }

    
    public void editarrAplicaciones(){
        if (cantAplicaciones>0){
            int encontradoCod=0;
            int encontradoCarn=0;
            //Se solicita el numero de aplicacion que se desea modificar
            String lectura = JOptionPane.showInputDialog("Ingrese el número de la aplicación examen que desea editar: ");
             for(int i=0;i<cantAplicaciones;i++){
                 if(lectura.equals(aplicaciones[i][0])){
                 //Si el numero existe, se solicitan los nuevos datos de la aplicacion del examen y se actualizan los anteriores
                 String codN = JOptionPane.showInputDialog("Ingrese el código del nuevo examen: ");
                 int Ncodigo=Integer.parseInt(codN);
                 for(int buscarExam=0;buscarExam<examenes.CantExamenes();buscarExam++){
                     if(Ncodigo==examenes.codigo[buscarExam]){
                         encontradoCod=1;
                     }
                 }
                 if(encontradoCod==1){
                     aplicaciones[i][1]=codN;
                 }else{
                     JOptionPane.showMessageDialog(null, "El código del nuevo examen no existe");
                 }
                 String carN = JOptionPane.showInputDialog("Ingrese el carnet del nuevo doctor: ");
                 int Ncarnet=Integer.parseInt(carN);
                 for(int buscarDoc=0;buscarDoc<doctores.CantDoctores();buscarDoc++){
                     if(Ncarnet==doctores.carnet[buscarDoc]){
                         encontradoCarn=1;
                     }
                 }
                 if(encontradoCarn==1){
                     aplicaciones[i][2]=carN;
                 }else{
                     JOptionPane.showMessageDialog(null, "El código del nuevo examen no existe");
                 }
                 String fechaN = JOptionPane.showInputDialog("Desea cambiar la fecha de la aplicación del examen: \n1- Si \n2- No");
                 int opcion=Integer.parseInt(fechaN);
                 if(opcion==1){
                     Random aleatorio;
                     aleatorio = new Random();
                     fechaAplicacion = Calendar.getInstance();
                     //Se crea una fecha random para la aplicacion del examen
                     fechaAplicacion.set (aleatorio.nextInt(1)+2023, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
                     //Se imprime el numero y la fecha
                     System.out.println("La aplicacion del examen #"+numAplicacion+" tiene una nueva fecha para "+sdf.format(fechaAplicacion.getTime()));
                     aplicaciones[i][4]=sdf.format(fechaAplicacion.getTime());
                 }
                 //Se muestra mensaje de verificacion
                 JOptionPane.showMessageDialog(null, "La aplicación del examen ha sido modificado");
             }else{
                 //Si no existe el numero, mostrar mensaje
                  JOptionPane.showMessageDialog(null, "La aplicación con el #"+lectura+ " no existe");
             }
             }
         
       }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado aplicaciones");
        }
    }
    
    public void eliminarAplicaciones(){
        int encontrado=0;
        if (cantAplicaciones>0){
        //Se solicita el numero de aplicacion que se desea modificar
        String lectura = JOptionPane.showInputDialog("Ingrese el número de la aplicación examen que desea eliminar: ");
        for(int filas=0;filas<cantAplicaciones;filas++){
            //for(int columnas=0;columnas<5;columnas++){
                if(lectura.equals(aplicaciones[filas][0])){
                    aplicaciones[filas][0]=null;
                    aplicaciones[filas][1]=null;
                    aplicaciones[filas][2]=null;
                    aplicaciones[filas][3]=null;
                    aplicaciones[filas][4]=null;
                   /* int f = Integer.parseInt(lectura);
                    f=f-1;
                    String[][] destino = new String[aplicaciones.length - 1][];
                    int j=0;
                    for(int i=0;i<aplicaciones.length;i++){
                        if(i!=f){
                            System.arraycopy(aplicaciones, i, destino, j, 1);
                            j++;
                        }
                    }
                    for(int x=0;x<cantAplicaciones;x++){
                       for(int o=0;o<5;o++){
                           System.out.println(destino[x][o] );
                       }
                   }*/
                  /*  int[][] destino = new int[aplicaciones.length - 1][];

                    System.out.println("Origen [Original]: ");
                    for(int x=0;x<cantAplicaciones;x++){
                       for(int o=0;o<5;o++){
                           System.out.println(aplicaciones[x][o] );
                       }
                   }

                    System.arraycopy(aplicaciones, 0, destino, 0, 1); // copia la primera a la
                                                                                                            // primera
                    System.arraycopy(aplicaciones, 2, destino, 1, 1); // copia la tercera y la en
                                                                                                            // la segunda
                    System.out.println("Destino: ");
                    for(int x=0;x<cantAplicaciones;x++){
                       for(int o=0;o<5;o++){
                           System.out.println(destino[x][o] );
                       }
                   }

                    System.arraycopy(destino, 0, aplicaciones, 0, destino.length);
                    System.out.println("Origen: ");
                    for(int x=0;x<cantAplicaciones;x++){
                       for(int o=0;o<5;o++){
                           System.out.println(aplicaciones[x][o] );
                       }
                   }*/
                    //Si se encuentra se borra la aplicacion
                   /* String[][] nuevaMatriz = new String[aplicaciones.length-1][aplicaciones[0].length];
                    for(int i=0; i < aplicaciones.length; i++){             
                    if(i != filas){
                       for(int j=0; j<aplicaciones[i].length; j++){                
                            nuevaMatriz[i][j] = aplicaciones[filas][j];                    
                       }
                     filas++;               
                    }              
                }*/
                    encontrado=1;
                   JOptionPane.showMessageDialog(null, "La aplicación del examen ha sido eliminado");
                   //cantAplicaciones=cantAplicaciones-1;
                   break;
            }
       // }
        }
        if(encontrado!=1){
            //Si no existe el carnet, mostrar mensaje
              JOptionPane.showMessageDialog(null, "La aplicación con el #"+lectura+ " no existe");
        }
       }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado aplicaciones");
        }
}
    public void GenerarReportes(){
        System.out.println("********** Reportes **********");
        //Se verifica si ya se han agregado aplicaciones
        if (cantAplicaciones>0){
            for(int i=0;i<cantAplicaciones;i++){
                //Si ya se han agregado se muestran en pantalla;
                System.out.println("");
                System.out.println("Aplicacion de examen #"+(i+1));
                System.out.println( "Numero de Aplicacion: "+aplicaciones[i][0]);
                int codExamen = Integer.parseInt(aplicaciones[i][1]);
                for (int idExamen=0;idExamen < examenes.codigo.length;idExamen++){
                    if(codExamen==examenes.codigo[idExamen]){
                        System.out.println( "Nombre del examen: "+examenes.nombre[idExamen]);
                    }
                }
                System.out.println( "Fecha: "+aplicaciones[i][4]);

            }
        }else{
            //Si no se han agregado aplicaciones, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se puede generar un reporte porque no se han agregado aplicaciones de examenes");
        }
    }
}
