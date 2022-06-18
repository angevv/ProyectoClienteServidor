/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc.proyectoprogra.controller;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class Cliente {
    public String cedula;
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public Date fechaNacimiento;
    //public genero;
    public String telefono;
    public String correoElectronico;
    public String direccion;
    
    public void obtenerEdad(){
        
    }
    
    public void listarClientes(){
        
    }
    
    public void agregarClientes(){
        cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        primerApellido = JOptionPane.showInputDialog("Ingrese el primer apellido del cliente: ");
        segundoApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido del cliente: ");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
        correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electrónico del cliente: ");
    }
    public void editarClientes(){
        
    }
    public void borrarClientes(){
        
    }
    public void generarReportes(){
        
    }
}
