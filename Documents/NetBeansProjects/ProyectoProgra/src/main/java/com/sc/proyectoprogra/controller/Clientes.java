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
        this.correoElectronicos = correoElectronicos;
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
    
    
}
