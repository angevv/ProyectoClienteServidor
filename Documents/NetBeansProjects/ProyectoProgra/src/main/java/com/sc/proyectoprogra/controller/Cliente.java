/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Cliente {
    
    //Se crea una variable para llevar el conteo de los clientes ingresados
    private int cantClientes=0;
    
    public String cedula;
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public String fechaNacimiento;
    public String telefono;
    public String direccion;
    
    private String correo="";
    
    //Se crea la enumeracion para generos
    public enum Genero{
        FEMENINO,
        MASCULINO
    }
    
    Genero tp;
    
    //Se crea una funcion para obtener la edad del cliente
   public int obtenerEdad(String fechaN){
        LocalDate fechaActual = LocalDate.parse("2022-07-09",DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate fnacimiento = LocalDate.parse(fechaN,DateTimeFormatter.ISO_LOCAL_DATE);
        
        //Se resta la fecha actual - fecha nacimiento
        long diferencia = ChronoUnit.YEARS.between(fnacimiento, fechaActual);
        
        //Se devuelve la edad del cliente
        int dif = (int)diferencia;  
        return dif;
    }
    
    public void listarClientes(){
        //Se verifica si ya se han agregado clientes
        if (cantClientes>0){
            //Si ya se han agregado se muestran en pantalla;
            System.out.println("Cedula: "+cedula);
            System.out.println( "Nombre Completo: "+nombre+" "+primerApellido+" "+segundoApellido);
            int edad=obtenerEdad(fechaNacimiento);
            System.out.println( "Edad: "+edad);
            System.out.println( "Genero: "+tp);
            System.out.println( "Direccion: "+direccion);
           System.out.println( "Telefono: "+telefono);
            System.out.println( "Correo: "+getCorreo());
        }else{
            //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }
    }
    
    public void agregarClientes(){
        //Se solicitan los datos necesarios de los clientes
        cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        primerApellido = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente: ");
        segundoApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente: ");
        fechaNacimiento=JOptionPane.showInputDialog("Introduzca la fecha de nacimiento con el siguiente formato yyyy-mm-dd: ");
        String lectura = JOptionPane.showInputDialog("Seleccione el género: \n1- Femenino \n2- Masculino");
        int opcionGenero = Integer.parseInt(lectura);
        if (opcionGenero==1){
            tp=Genero.FEMENINO;
        }else if (opcionGenero==2){
            tp=Genero.MASCULINO;
        }else{
            JOptionPane.showMessageDialog(null, "No existe esa opción");
        }
        direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
        correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente: ");
        setCorreo(correo);
        //Se lleva un conteo de los clientes
        cantClientes = cantClientes+1;
        //Mostrar mensaje de verificacion
        JOptionPane.showMessageDialog(null, "El cliente ha sido agregado");
    }
    public void editarClientes(){
        //Se solicita la cedula del cliente que se desea modificar
        String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea editar: ");
        if(buscarCedula.equals(cedula)){
            //Si la cedula existe, se solicitan los nuevos datos del cliente y se actualizan los anteriores
            String Nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente: ");
            nombre=Nnombre;
            String NprimerApellido = JOptionPane.showInputDialog("Ingrese el nuevo primer apellido del cliente: ");
            primerApellido=NprimerApellido;
            String NsegundoApellido = JOptionPane.showInputDialog("Ingrese el nuevo segundo apellido del cliente: ");
            segundoApellido=NsegundoApellido;
            String Ndireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección del cliente: ");
            direccion=Ndireccion;
            String Ntelefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
            telefono=Ntelefono;
            String Ncorreo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente: ");
            correo=Ncorreo;
            setCorreo(correo);
            //Se muestra mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El cliente ha sido modificado");
        }else{
            //Si no existe la cedula, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El cliente con la cédula "+buscarCedula+ " no existe");
        }
        
    }
    public void borrarClientes(){
        //Se solicita la cedula del cliente que se desea eliminar
        String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea eliminar: ");
        if(buscarCedula.equals(cedula)){
            //Se borra el cliente con la cedula buscada
            cedula = "";
            nombre = "";
            primerApellido = "";
            segundoApellido = "";
            fechaNacimiento="";
            direccion = "";
            telefono = "";
            correo = "";
            cantClientes=0;
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
        }
        else{
            //Si no existe la cedula, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El cliente con la cédula "+buscarCedula+ " no existe");
        }
    }
    
    //Se crean el get y set para el correo
    public String getCorreo(){
        //Se devuelve solo un fragmento del correo
        return correo.substring(0, 3) + "..." + correo.substring(correo.indexOf("@"));
    }
    
    //Se verifica que el correo tenga un formato correcto, si no mostrar un mensaje
    public void setCorreo(String correo)
    {
        int arroba = correo.indexOf("@");
        
        if (arroba > 0)
        {
            int punto = correo.indexOf(".", arroba);
            if (punto >= arroba + 2)
            {
                String dominio = correo.substring(punto + 1);
                if (dominio != null && dominio.length() > 0)
                {
                    this.correo = correo;
                    return;
                }
            }
        }
        
        System.out.println("El correo es inválido.");  
    }   
    public void generarReportes(){   
        //Se crean las instancias de las clases examen, doctor y aplicacion
       /* Examen examen = new Examen();
        Doctor doctor = new Doctor();
        Aplicacion aplicacion = new Aplicacion();
        //Se muestran los datos de las aplicaciones de los examenes
        System.out.println("Cedula Cliente: "+nombre);
        System.out.println("Examen: "+examen.nombre);
        System.out.println("Doctor a Cargo: "+doctor.nombre);
        System.out.println("Fecha Aplicacion: "+aplicacion.fechaAplicacion);*/
    }
}
