/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc.trabajoextraclase0201.controller;
import javax.swing.JOptionPane;

/**
 *
 * @author Angelica
 */
public class TrabajoExtraclase0201 {

    public static void main(String[] args) {
        //Se solicita el ingreso de los 4 datos y se pasan a entero
        String lectura=JOptionPane.showInputDialog("Digite el primer número: ");
        int num1=Integer.parseInt(lectura);
        lectura=JOptionPane.showInputDialog("Digite el segundo número: ");
        int num2=Integer.parseInt(lectura);
        lectura=JOptionPane.showInputDialog("Digite el tercer número: ");
        int num3=Integer.parseInt(lectura);
        lectura=JOptionPane.showInputDialog("Digite el cuarto número: ");
        int num4=Integer.parseInt(lectura);
        
        //Se crea la variable de mayor y se hacen los respectivos calculos
        int mayor;
        if (num1>num2 && num1>num3 && num1>num4){
            mayor = num1;
        }
        else if (num2>num3 && num2>num4){
            mayor=num2;
        }
        else if(num3>num4){
            mayor=num3;
        }
        else{
            mayor=num4;
        }
        System.out.println("El número mayor es: "+mayor);
    }
}
