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
public class Doctor {
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public String especialidad;
    public String cargo;
    public String telefono;
    
    public void listarDoctores(){
        
    }
    
    public void agregarDoctores(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del doctor: ");
        primerApellido = JOptionPane.showInputDialog("Ingrese el primer apellido del doctor: ");
        segundoApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido del doctor: ");
        especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del doctor: ");
        cargo = JOptionPane.showInputDialog("Ingrese el cargo del doctor: ");
        telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
    }
    public void editarDoctores(){
        
    }
    public void eliminarDoctores(){
        
    }
}
