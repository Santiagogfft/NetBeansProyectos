/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.clientesapps;

import es.medac.clientesapp.controller.ConexionMySQL;
import java.util.logging.Logger;
import es.medac.clientesapp.controller.Consultas;
import java.sql.SQLException;
import es.medac.clientesapp.controller.ConsultaDMLClientes;
import es.medac.clientesapp.modelo.Clientes;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ClienteAppMain {
        
    public static void main(String[] args) throws SQLException{
        
        Logger log = Logger.getLogger(ClienteAppMain.class.getName());
        
        ConexionMySQL con = new ConexionMySQL();
        con.getConnection();
        
        log.info("Conexion establecida");
        
        Consultas c1 = new Consultas();
        //c1.deleteClientes();
        //c1.insertClientes();
        //c1.updateCliente(2, "Carlos", "Hernandez", 25);
        //c1.insertCliente("10", "Blas", "Gonzalo", 18);
        ConsultaDMLClientes c2 = new ConsultaDMLClientes();
        //System.out.println("Total tablas:"+c2.totalClientes());
        //c2.mayoresDeEdad(18);
        ArrayList<Clientes> c3 = new ArrayList<Clientes>();
        c3 = c2.listadoClientes();
        for (Clientes c0 : c3) {
            System.out.println(c0);
        }

    }
  
}
