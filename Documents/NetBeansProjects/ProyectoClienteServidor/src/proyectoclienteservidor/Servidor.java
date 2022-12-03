/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclienteservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Servidor {

    Facturacion f = new Facturacion();

    private static final String HOST = "localhost";
    private static final int PUERTO = 5000;
    private ServerSocket sc;
    private Socket cl;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private String mensajeRecibido = "";

    public void inicializarServidor() {
        Scanner lectura = new Scanner(System.in);
        try {
            sc = new ServerSocket(PUERTO);
            cl = new Socket();
            System.out.println("Estamos listos, esperando conexion...");
            cl = sc.accept();
            System.out.println("Se conecto un cliente");
            entrada = new DataInputStream(cl.getInputStream());
            salida = new DataOutputStream(cl.getOutputStream());
            salida.writeInt(f.tablaFactura.getRowCount());
            try {
                DataInputStream entradaArchivos = new DataInputStream(new FileInputStream(
                        "facturas.dat"));
                try {
                    Factura f = new Factura();
                    while (true) {
                        f.setNumeroFactura(entradaArchivos.readInt());
                        f.setFecha(entradaArchivos.readUTF());
                        f.setHora(entradaArchivos.readUTF());
                        f.setDescipcionServicios(entradaArchivos.readUTF());
                        f.setCliente(entradaArchivos.readUTF());
                        f.setCantidad(entradaArchivos.readInt());
                        f.setPrecio(entradaArchivos.readDouble());
                        f.setTotal(entradaArchivos.readDouble());
                        salida.writeDouble(f.getTotal());
                        salida.writeUTF(f.getDescipcionServicios());
                        
                    }
                } catch (EOFException eeof) {
                    entradaArchivos.close();
                }
            } catch (IOException eioe) {
                JOptionPane.showMessageDialog(null, "¡Error en el dispositivo de almacenamiento!",
                        "Error en el dispositivo", JOptionPane.ERROR_MESSAGE);
            }
            mensajeRecibido = entrada.readUTF();
            System.out.println(mensajeRecibido);
        } catch (IOException ex) {
            System.out.println("Error durante la conexion");
        }
    }
}
