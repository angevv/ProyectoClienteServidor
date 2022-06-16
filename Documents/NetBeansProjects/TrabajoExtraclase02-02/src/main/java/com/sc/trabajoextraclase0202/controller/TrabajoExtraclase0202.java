/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc.trabajoextraclase0202.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class TrabajoExtraclase0202 {

    public static void main(String[] args) {
        //Se solicitan los datos requeridos al usuario
        String lectura=JOptionPane.showInputDialog("Ingrese los años de antigüedad: ");
        int antiguedad=Integer.parseInt(lectura);
        lectura=JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas por semana: ");
        int horas=Integer.parseInt(lectura);
        lectura=JOptionPane.showInputDialog("Ingrese el precio que se le paga por hora: ");
        double precio=Double.parseDouble(lectura);
        
        //Se calcula el salario bruto
        double salarioBruto=horas*precio;
        
        //Se inicializa la variable del salario neto
        double salarioNeto;
        
        if (antiguedad>10){
            //Si el usuario tiene más de 10 años de trabajar en la empresa, se le hace un bono del 20%
            double bono = salarioBruto*0.2;
            double nuevoSalario=salarioBruto+bono;
            if (nuevoSalario>1000 && nuevoSalario<2000){
                //Si el salario esta entre 1000 y 2000, se aplica una deduccion del 10%
                double deduccion = nuevoSalario*0.1;
                salarioNeto=nuevoSalario-deduccion;
                //Se imprime el salario neto
                JOptionPane.showMessageDialog(null,"El salario neto es de $ "+ salarioNeto);
            }else if(nuevoSalario>2000){
                //Si el salario esta entre 1000 y 2000, se aplica una deduccion del 15%
                double deduccion = nuevoSalario*0.15;
                salarioNeto=nuevoSalario-deduccion;
                //Se imprime el salario neto
                JOptionPane.showMessageDialog(null,"El salario neto es de $ "+ salarioNeto);
            }
        } else{
                salarioNeto=salarioBruto;
                //Se imprime el salario neto
                JOptionPane.showMessageDialog(null,"El salario neto es de $ "+ salarioNeto);
            }
        
    }
}
