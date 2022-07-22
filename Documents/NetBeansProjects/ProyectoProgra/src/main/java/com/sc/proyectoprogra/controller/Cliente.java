/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import javax.swing.JOptionPane;



/**
 *
 * @author Angelica
 */
public class Cliente {

    //Se crea una variable para llevar el conteo de los clientes ingresados
    public static int cantClientes;
    
   //Se crean los arreglos necesarios con las respectivas dimensiones
    public static String cedula[] = new String[100];
    public static String nombre[]= new String[100];
    public static String primerApellido[]= new String[100];
    public static String segundoApellido[]= new String[100];
    public static String fechaNacimiento[]= new String[100];
    public static String telefono[]= new String[100];
    public static String direccion[]= new String[100];
    public static String correoElectronico[]= new String[100];
    public static String genero[]= new String[100];
    
    //Se crean los datos para generar los sets y gets
    private String correo="";
    private String cedulas="";
    private String nombres="";
    private String primerA="";
    private String segundoA="";
    private String fechaN="";
    private String telefonos="";
    private String direcciones="";
    private String generos="";
    
    //Se crea la enumeracion para generos
    public enum Genero{
        FEMENINO,
        MASCULINO
    }
    
    //Se genera un tp de tipo genero
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
   
   //Se crea una funcion para determinar si el correo es correcto
   public int comprobarCorreo(String correo){
        int arroba = correo.indexOf("@");
        
        if (arroba > 0)
        {
            int punto = correo.indexOf(".", arroba);
            if (punto >= arroba + 2)
            {
                String dominio = correo.substring(punto + 1);
                if (dominio != null && dominio.length() > 0)
                {
                    //Si el correo es correcto, devuelve 1
                    return 1;
                }
            }
        }
        //Si el correo es incorrecto, devuelve 0
        return 0; 
   }
    
    public void listarClientes(){
        //Se verifica si ya se han agregado clientes
        if (cantClientes>0){
            System.out.println("");
             System.out.println("********** Clientes **********");
            //Se crea un for para mostrar todos los clientes registrados y se imprimen los valores que no sean null
            for(int i=0;i<cantClientes;i++){
                if(cedula[i]!=null){
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
            }
        }else{
            //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }       
    }
    
      
    public void agregarClientes(int cant){        
        //Se crea un for para agregar la cantidad de clientes que el usuario desea
       for(int c=0;c<cant;c++){
           //Se recorre todo el arreglo y se indica que en el campo null, agregar el nuevo valor
           for(int i=0;i<100;i++ ){
                if(cedula[i]==null){
                     //Se solicitan los datos necesarios de los clientes y se utlizan los sets y gets para guardarlos en los arreglos
                     cedulas = JOptionPane.showInputDialog("Ingrese la cédula del cliente #"+(i+1)+": ");
                     setCedulas(cedulas);
                     cedula[i]=getCedulas();
                     nombres = JOptionPane.showInputDialog("Ingrese el nombre del cliente #"+(i+1)+": ");
                     setNombres(nombres);
                     nombre[i]=getNombres();
                     primerA = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente #"+(i+1)+": ");
                     setPrimerA(primerA);
                     primerApellido[i]=getPrimerA();
                     segundoA = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente #"+(i+1)+": ");
                     setSegundoA(segundoA);
                     segundoApellido[i]=getSegundoA();
                     fechaN=JOptionPane.showInputDialog("Introduzca la fecha de nacimiento con el siguiente formato yyyy-mm-dd: ");
                     setFechaN(fechaN);
                     fechaNacimiento[i]=getFechaN();
                     //Se solicita que elija el genero
                     String lectura = JOptionPane.showInputDialog("Seleccione el género: \n1- Femenino \n2- Masculino");
                     int opcionGenero = Integer.parseInt(lectura);
                     if (opcionGenero==1){
                         //Si es 1, se le asigna femenino al tp
                         tp=Genero.FEMENINO;
                         generos=tp.toString();
                         setGeneros(generos);
                         genero[i]=getGeneros();
                     }else if (opcionGenero==2){
                         //Si es 2, se le asigna masculino al tp
                         tp=Genero.MASCULINO;
                         generos=tp.toString();
                         setGeneros(generos);
                         genero[i]=getGeneros();
                     }else{
                         //Si selecciona otra opcion, mostrar mensaje
                         JOptionPane.showMessageDialog(null, "No existe esa opción");
                     }
                     direcciones = JOptionPane.showInputDialog("Ingrese la dirección del cliente #"+(i+1)+": ");
                     setDirecciones(direcciones);
                     direccion[i]=getDirecciones();
                     telefonos = JOptionPane.showInputDialog("Ingrese el teléfono del cliente #"+(i+1)+": ");
                     setTelefonos(telefonos);
                     telefono[i]=getTelefonos();
                     correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");
                     int verificar = comprobarCorreo(correo);
                     //Solicitar el correo hasta que el usuario ingrese un formato valido
                     while(verificar==0){
                         System.out.println("El correo es invalido."); 
                         correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");
                         verificar = comprobarCorreo(correo);
                     }
                     setCorreo(correo);
                     correoElectronico[i]=getCorreo();
                     //Se lleva un conteo de los clientes
                     cantClientes = cantClientes+1;
                     //Mostrar mensaje de verificacion
                     JOptionPane.showMessageDialog(null, "El cliente ha sido agregado");
                     break;
                }
           }
       }
    }
    public void editarClientes(){
         //Se verifica si ya se han agregado clientes
        if (cantClientes>0){
            //Se crea variable para verificar si se ha encontrado la cedula
            int encontrado=0;
            //Se solicita la cedula del cliente que se desea modificar
            String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea editar: ");
            //Se crea un for para recorrer todo el arreglo y buscar la cedula
            for(int i=0;i<cedula.length;i++){
                if(buscarCedula.equals(cedula[i])){
                    //Si la cedula existe, se solicitan los nuevos datos del cliente y se actualizan los anteriores
                    String Nnombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente: ");
                    nombres=Nnombre;
                    setNombres(nombres);
                    nombre[i]=getNombres();
                    String NprimerApellido = JOptionPane.showInputDialog("Ingrese el nuevo primer apellido del cliente: ");
                    primerA=NprimerApellido;
                    setPrimerA(primerA);
                    primerApellido[i]=getPrimerA();
                    String NsegundoApellido = JOptionPane.showInputDialog("Ingrese el nuevo segundo apellido del cliente: ");
                    segundoA=NsegundoApellido;
                    setSegundoA(segundoA);
                    segundoApellido[i]=getSegundoA();
                    String Ndireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección del cliente: ");
                    direcciones=Ndireccion;
                    setDirecciones(direcciones);
                    direccion[i]=getDirecciones();
                    String Ntelefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
                    telefonos=Ntelefono;
                    setTelefonos(telefonos);
                    telefono[i]=getTelefonos();
                    String Ncorreo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente: ");
                    correo=Ncorreo;
                    int verificar = comprobarCorreo(correo);
                    //Solicitar el correo hasta que el usuario ingrese un formato correcto
                     while(verificar==0){
                         System.out.println("El correo es invalido."); 
                         correo = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");
                         verificar = comprobarCorreo(correo);
                     }
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
       }else{
             //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }
        
    }
    public void borrarClientes(){
         //Se verifica si ya se han agregado clientes
        if (cantClientes>0){
            //Se crea variable para verificar si se ha encontrado la cedula
            int encontrado=0;
            //Se solicita la cedula del cliente que se desea eliminar
            String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea eliminar: ");
            for(int i=0;i<cantClientes;i++){
                //Se verifica que la cedula exista en el arreglo
                if(cedula[i].equals(buscarCedula)){

                    //Si la cedula se encuentra, se crean arreglos con un campo menos que el arreglo original
                    String[] nuevaCedula = new String[cedula.length - 1];
                    String[] nuevosNombres = new String[nombre.length - 1];
                    String[] nuevoPrimerA = new String[primerApellido.length - 1];
                    String[] nuevoSegundoA = new String[segundoApellido.length - 1];
                    String[] nuevaFechN = new String[fechaNacimiento.length - 1];
                    String[] nuevoGen = new String[genero.length - 1];
                     String[] nuevoDir = new String[direccion.length - 1];
                    String[] nuevoTelef = new String[telefono.length - 1];
                     String[] nuevoCorreo = new String[correoElectronico.length - 1];

                      //Se copian los datos antes del dato especificado, del arreglo original al nuevo
                    System.arraycopy(cedula, 0, nuevaCedula, 0, i);
                    System.arraycopy(nombre, 0, nuevosNombres, 0, i);
                    System.arraycopy(primerApellido, 0, nuevoPrimerA, 0, i);
                    System.arraycopy(segundoApellido, 0, nuevoSegundoA, 0, i);
                    System.arraycopy(fechaNacimiento, 0, nuevaFechN, 0, i);
                    System.arraycopy(genero, 0, nuevoGen, 0, i);
                    System.arraycopy(direccion, 0, nuevoDir, 0, i);
                    System.arraycopy(telefono, 0, nuevoTelef, 0, i);
                    System.arraycopy(correoElectronico, 0, nuevoCorreo, 0, i);
                    
                    if (cedula.length != i) {
                        //Se terminan de copiar los datos, menos el dato especificado
                        System.arraycopy(cedula, i + 1, nuevaCedula, i, cedula.length - i - 1);
                        System.arraycopy(nombre, i + 1, nuevosNombres, i, nombre.length - i - 1);
                        System.arraycopy(primerApellido, i + 1, nuevoPrimerA, i, primerApellido.length - i - 1);
                        System.arraycopy(segundoApellido, i + 1, nuevoSegundoA, i, segundoApellido.length - i - 1);
                        System.arraycopy(fechaNacimiento, i + 1, nuevaFechN, i, fechaNacimiento.length - i - 1);
                        System.arraycopy(genero, i + 1, nuevoGen, i, genero.length - i - 1);
                        System.arraycopy(direccion, i + 1, nuevoDir, i, direccion.length - i - 1);
                        System.arraycopy(correoElectronico, i + 1, nuevoCorreo, i, correoElectronico.length - i - 1);
                        System.arraycopy(telefono, i + 1, nuevoTelef, i, telefono.length - i - 1);
                    }
  
                    //Se pasan los nuevos datos a los arreglos originales
                    cedula = Arrays.copyOf(nuevaCedula, nuevaCedula.length);
                    nombre = Arrays.copyOf(nuevosNombres, nuevosNombres.length);
                    primerApellido = Arrays.copyOf(nuevoPrimerA, nuevoPrimerA.length);
                    segundoApellido = Arrays.copyOf(nuevoSegundoA, nuevoSegundoA.length);
                     fechaNacimiento = Arrays.copyOf(nuevaFechN, nuevaFechN.length);
                    genero = Arrays.copyOf(nuevoGen, nuevoGen.length);
                    direccion = Arrays.copyOf(nuevoDir, nuevoDir.length);
                    correoElectronico = Arrays.copyOf(nuevoCorreo, nuevoCorreo.length);
                    telefono = Arrays.copyOf(nuevoTelef, nuevoTelef.length);
                    
                   //Se muestra mensaje de verificacion
                    JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
                   //Se cambia el estado si ha sido encontrado el cliente
                    encontrado=1;
                    //Se reduce la cantidad de clientes
                    cantClientes=cantClientes-1;
                    break;
                }
            }
            if(encontrado!=1){
                //Si no existe la cedula, mostrar mensaje
                 JOptionPane.showMessageDialog(null, "El cliente con la cédula "+buscarCedula+ " no existe");
            }
         }else{
             //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }
    }
    
    //Se crean el get y set para el correo
    public String getCorreo(){
        //Se devuelve solo un fragmento del correo
        return correo.substring(0, 3) + "..." + correo.substring(correo.indexOf("@"));
    }
            
    public void setCorreo(String correo)
    {
       this.correo=correo;
    }   
    
    //Se crean los set y get de cedula
    public String getCedulas() {
        return cedulas;
    }

    public void setCedulas(String cedulas) {
        this.cedulas = cedulas;
    }

    //Se crean los set y get de nombre
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //Se crean los set y get de primer apellido
    public String getPrimerA() {
        return primerA;
    }

    public void setPrimerA(String primerA) {
        this.primerA = primerA;
    }

    //Se crean los set y get de segundo apellido
    public String getSegundoA() {
        return segundoA;
    }

    public void setSegundoA(String segundoA) {
        this.segundoA = segundoA;
    }

    //Se crean los set y get de fechaNacimiento
    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    //Se crean los set y get de telefonos
    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    //Se crean los set y get de direcciones
    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    //Se crean los set y get de generos
    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }
    
    //Se crea una funcion para devolver la cantidad de clientes
     public int CantCliente(){
       
        return cantClientes;
    }
    
}
