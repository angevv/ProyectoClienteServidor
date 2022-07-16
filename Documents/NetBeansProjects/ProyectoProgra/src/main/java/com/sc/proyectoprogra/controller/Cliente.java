/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Angelica
 */
public class Cliente {
    
    //Se crea una variable para llevar el conteo de los clientes ingresados
    private int cantClientes=0;
    
    public String cedula[];
    public String nombre[];
    public String primerApellido[];
    public String segundoApellido[];
    public String fechaNacimiento[];
    public String telefono[];
    public String direccion[];
    public String correoElectronico[];
    public String genero[];
    
    private String correo="";
    private String ced="";
    private String nom="";
    private String primerA="";
    private String segundoA="";
    
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
            //Se crea un for para mostrar todos los clientes registrados
            for(int i=0;i<cedula.length;i++){
                //Si ya se han agregado se muestran en pantalla;
                System.out.println("Cliente #"+(i+1));
                System.out.println("Cedula: "+cedula[i]);
                System.out.println( "Nombre Completo: "+nombre[i]+" "+primerApellido[i]+" "+segundoApellido[i]);
                int edad=obtenerEdad(fechaNacimiento[i]);
                System.out.println( "Edad: "+edad);
                System.out.println( "Genero: "+genero[i]);
                System.out.println( "Direccion: "+direccion[i]);
               System.out.println( "Telefono: "+telefono[i]);
                System.out.println( "Correo: "+correoElectronico[i]);
                System.out.println("");
            }
        }else{
            //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }       
    }
    
    public void agregarClientes(int cant){
        //Se crean los arreglos con la cantidad digitada por el usuario
        cedula = new String[cant];
        nombre = new String[cant];
        primerApellido = new String[cant];
        segundoApellido = new String[cant];
        fechaNacimiento = new String[cant];
        direccion = new String[cant];
        telefono = new String[cant];
        correoElectronico = new String[cant];
        genero = new String[cant];
        
        //Se crea un for para agregar la cantidad de clientes que el usuario desea
        for(int i=0;i<cant;i++){
            //Se solicitan los datos necesarios de los clientes y se guardan en el arreglo
            cedula[i] = JOptionPane.showInputDialog("Ingrese la cédula del cliente #"+(i+1)+": ");
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del cliente #"+(i+1)+": ");
            primerApellido[i] = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente #"+(i+1)+": ");
            segundoApellido[i] = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente #"+(i+1)+": ");
            fechaNacimiento[i]=JOptionPane.showInputDialog("Introduzca la fecha de nacimiento con el siguiente formato yyyy-mm-dd: ");
            String lectura = JOptionPane.showInputDialog("Seleccione el género: \n1- Femenino \n2- Masculino");
            int opcionGenero = Integer.parseInt(lectura);
            if (opcionGenero==1){
                tp=Genero.FEMENINO;
                genero[i]=tp.toString();
            }else if (opcionGenero==2){
                tp=Genero.MASCULINO;
                genero[i]=tp.toString();
            }else{
                JOptionPane.showMessageDialog(null, "No existe esa opción");
            }
            direccion[i] = JOptionPane.showInputDialog("Ingrese la dirección del cliente #"+(i+1)+": ");
            telefono[i] = JOptionPane.showInputDialog("Ingrese el teléfono del cliente #"+(i+1)+": ");
            correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");
            setCorreo(correo);
            correoElectronico[i]=getCorreo();
            //Se lleva un conteo de los clientes
            cantClientes = cantClientes+1;
            //Mostrar mensaje de verificacion
            JOptionPane.showMessageDialog(null, "El cliente ha sido agregado");
        }
    }
    public void editarClientes(){
        //Se crea variable para verificar si se ha encontrado la cedula
        int encontrado=0;
        //Se solicita la cedula del cliente que se desea modificar
        String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea editar: ");
        //Se crea un for para recorrer todo el arreglo y buscar la cedula
        for(int i=0;i<cedula.length;i++){
            if(buscarCedula.equals(cedula[i])){
                //Si la cedula existe, se solicitan los nuevos datos del cliente y se actualizan los anteriores
                String Nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente: ");
                nombre[i]=Nnombre;
                String NprimerApellido = JOptionPane.showInputDialog("Ingrese el nuevo primer apellido del cliente: ");
                primerApellido[i]=NprimerApellido;
                String NsegundoApellido = JOptionPane.showInputDialog("Ingrese el nuevo segundo apellido del cliente: ");
                segundoApellido[i]=NsegundoApellido;
                String Ndireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección del cliente: ");
                direccion[i]=Ndireccion;
                String Ntelefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
                telefono[i]=Ntelefono;
                String Ncorreo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente: ");
                correo=Ncorreo;
                setCorreo(correo);
                correoElectronico[i]=getCorreo();
                //Se muestra mensaje de verificacion
                JOptionPane.showMessageDialog(null, "El cliente ha sido modificado");
                //Se cambia el estado si ha sido encontrado el cliente
                encontrado=1;
            }
        }
            if(encontrado!=1){
            //Si no existe la cedula, mostrar mensaje
             JOptionPane.showMessageDialog(null, "El cliente con la cédula "+buscarCedula+ " no existe");
        }
        
    }
    public void borrarClientes(){
        //Se crea variable para verificar si se ha encontrado la cedula
        int encontrado=0;
        //Se solicita la cedula del cliente que se desea eliminar
        String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea eliminar: ");
        for(int i=0;i<cedula.length;i++){
            if(buscarCedula.equals(cedula[i])){
                //Se borra el cliente con la cedula buscada
                /*List<String> tempList = new ArrayList<String>(Arrays.asList(cedula));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(nombre));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(primerApellido));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(segundoApellido));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(fechaNacimiento));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(direccion));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(correoElectronico));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(telefono));
                tempList.remove(i);
                tempList.toArray(new String[0]);
                tempList = new ArrayList<String>(Arrays.asList(genero));
                tempList.remove(i);
                tempList.toArray(new String[0]);*/

                /*cedula[i] = " ";
                nombre[i] = " ";
                primerApellido[i] = " ";
                segundoApellido[i] = " ";
                fechaNacimiento[i]=" ";
                direccion[i] = " ";
                telefono[i] = " ";
                correoElectronico[i] = " ";
                genero[i]=" ";*/
               //Se muestra mensaje de verificacion
                JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
               //Se cambia el estado si ha sido encontrado el cliente
                encontrado=1;
            }
        }
        if(encontrado!=1){
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
    //Se crean el get y set para la cedula
  /* public String[] getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula[])
    {
       this.cedula=cedula;
    }   */
    
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
