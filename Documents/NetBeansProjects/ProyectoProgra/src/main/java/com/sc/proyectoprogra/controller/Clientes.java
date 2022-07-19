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
public class Clientes {

    //Se crea una variable para llevar el conteo de los clientes ingresados
    public static int cantClientes;
   
    public String cedulas;
    public String nombres;
    public String primerApellidos;
    public String segundoApellidos;
    public String fechaNacimientos;
    public String telefonos;
    public String direccions;
    public String correoElectronicos;
    public String generos;
    
    public String getCedulas() {
        return cedulas;
    }

    public void setCedulas(String cedulas) {
        this.cedulas = cedulas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellidos() {
        return primerApellidos;
    }

    public void setPrimerApellidos(String primerApellidos) {
        this.primerApellidos = primerApellidos;
    }

    public String getSegundoApellidos() {
        return segundoApellidos;
    }

    public void setSegundoApellidos(String segundoApellidos) {
        this.segundoApellidos = segundoApellidos;
    }

    public String getFechaNacimientos() {
        return fechaNacimientos;
    }

    public void setFechaNacimientos(String fechaNacimientos) {
        this.fechaNacimientos = fechaNacimientos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getDireccions() {
        return direccions;
    }

    public void setDireccions(String direccions) {
        this.direccions = direccions;
    }

    public String getCorreoElectronicos() {
        return correoElectronicos;
    }

    public void setCorreoElectronicos(String correoElectronicos) {
        
        int arroba = correoElectronicos.indexOf("@");
        
        if (arroba > 0)
        {
            int punto = correoElectronicos.indexOf(".", arroba);
            if (punto >= arroba + 2)
            {
                String dominio = correoElectronicos.substring(punto + 1);
                if (dominio != null && dominio.length() > 0)
                {
                    this.correoElectronicos= correoElectronicos;
                    return;
                }
            }
        }
        
    }
    
    public int correocorrecto (String correoElectronicos){
    
        int arroba = correoElectronicos.indexOf("@");
        
        if (arroba > 0)
        {
            int punto = correoElectronicos.indexOf(".", arroba);
            if (punto >= arroba + 2)
            {
                String dominio = correoElectronicos.substring(punto + 1);
                if (dominio != null && dominio.length() > 0)
                {
                    this.correoElectronicos= correoElectronicos;
                    return 1;
                }
            }
        }
        return 0;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    
     
    public Clientes(){

    }
    
    public Clientes ( String prcedulas,
    String prnombres,
    String prprimerApellidos,
    String prsegundoApellidos,
    String prfechaNacimientos,
    String prtelefonos,
    String prdireccions,
    String prcorreoElectronicos,
    String prgeneros){
        
         this.cedulas= prcedulas;
    this.nombres=prnombres;
    this.primerApellidos=prprimerApellidos;
    this.segundoApellidos=prsegundoApellidos;
    this.fechaNacimientos=prfechaNacimientos;
    this.telefonos=prtelefonos;
    this.direccions=prdireccions;
    this.correoElectronicos=prcorreoElectronicos;
    this.generos=prgeneros;
        
    }
    
    static Clientes[] ArregloCli = new Clientes[100];
    
    public void borracliente(){
    
    int index = -1;
    Clientes[] ArregloCliCP = new Clientes[100];
    int cantidadnuevaclientes=0;
    
     if (Cantidadclientes>0){
            
         String buscarCedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente que desea eliminar: ");
            for(int i=0;i<Cantidadclientes;i++){
                if(ArregloCli[i].getCedulas().equals(buscarCedula)){
                    
                    index = i;
                    break;
                }
             }
            
            for(int i=0;i<Cantidadclientes;i++){
                
                if (i!=index){
                ArregloCliCP[cantidadnuevaclientes]= ArregloCli[i];
                cantidadnuevaclientes+=1;
                    }               
            }
            
            ArregloCli = null;
            
            
            ArregloCli = ArregloCliCP.clone();
            
            Cantidadclientes = cantidadnuevaclientes;
           }
    }
    
    
    static int Cantidadclientes=0;
    
        public void agregarClientes(int cant){
          
        String getcedulas;
        String getnombres;
        String getprimerApellidos;
        String getsegundoApellidos;
        String getfechaNacimientos;
        String gettelefonos;
        String getdireccions;
        String getcorreoElectronicos;
        String getgeneros;
        Clientes cliente = new Clientes();
        //Se crea un for para agregar la cantidad de clientes que el usuario desea
       for(int i=0;i<cant;i++){
            //Se solicitan los datos necesarios de los clientes y se guardan en el arreglo
            getcedulas = JOptionPane.showInputDialog("Ingrese la cédula del cliente #"+(i+1)+": ");
            getnombres = JOptionPane.showInputDialog("Ingrese el nombre del cliente #"+(i+1)+": ");
            getprimerApellidos = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente #"+(i+1)+": ");
            getsegundoApellidos = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente #"+(i+1)+": ");
            getfechaNacimientos=JOptionPane.showInputDialog("Introduzca la fecha de nacimiento con el siguiente formato yyyy-mm-dd: ");
            getgeneros = JOptionPane.showInputDialog("Seleccione el género: \n1- Femenino \n2- Masculino");
            getdireccions = JOptionPane.showInputDialog("Ingrese la dirección del cliente #"+(i+1)+": ");
            gettelefonos = JOptionPane.showInputDialog("Ingrese el teléfono del cliente #"+(i+1)+": ");
            getcorreoElectronicos = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");
          
           // ArregloCli[cant] = new Clientes(getcedulas,getnombres,getprimerApellidos,getsegundoApellidos,getfechaNacimientos,getgeneros,
           // getdireccions,gettelefonos,getcorreoElectronicos);
            
           
           cliente.setCedulas(getcedulas);
           
           while (cliente.correocorrecto(getcorreoElectronicos)==0){
               
               getcorreoElectronicos = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente #"+(i+1)+": ");     
               cliente.setCorreoElectronicos(getcorreoElectronicos);
       
           }
           
           cliente.setCorreoElectronicos(getcorreoElectronicos);
           cliente.setDireccions(getdireccions);
           cliente.setFechaNacimientos(getfechaNacimientos);
           cliente.setGeneros(getgeneros);
           cliente.setNombres(getnombres);
           cliente.setPrimerApellidos(getprimerApellidos);
           cliente.setSegundoApellidos(getsegundoApellidos);
           cliente.setTelefonos(gettelefonos);
           
           ArregloCli[Cantidadclientes]= cliente;
           
           Cantidadclientes+=1;
           
            JOptionPane.showMessageDialog(null, "El cliente ha sido agregado");
       }
    }
    
    public void listarClientes(){
        //Se verifica si ya se han agregado clientes
        if (Cantidadclientes>0){
            System.out.println("");
             System.out.println("********** Clientes **********");
            //Se crea un for para mostrar todos los clientes registrados
            for(int i=0;i<Cantidadclientes;i++){
                //Si ya se han agregado se muestran en pantalla;
                System.out.println("Cliente " + ArregloCli[i].getCedulas() );
                System.out.println("Cliente " + ArregloCli[i].getCorreoElectronicos() ); 
                System.out.println("");
            }
        }else{
            //Si no se han agregado clientes, mostrar mensaje
             JOptionPane.showMessageDialog(null, "No se han agregado clientes");
        }       
    }
    
}
