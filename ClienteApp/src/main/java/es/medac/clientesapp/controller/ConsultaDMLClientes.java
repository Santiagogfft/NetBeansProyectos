package es.medac.clientesapp.controller;

import es.medac.clientesapp.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ConsultaDMLClientes {
    
    private Connection conexion;
    
    public ConsultaDMLClientes(){
        this.conexion = new ConexionMySQL().getConnection();
    }
    
    public int totalClientes(){
        int total = 0;
        String sql = "SELECT COUNT(*) AS Total FROM clientes";
        try(PreparedStatement ps = conexion.prepareStatement(sql);){
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    total = rs.getInt("Total");
                }
            }
            ps.close();
            System.out.println("Conexion cerrada");
        }catch (SQLException e){
            System.out.println("Error al obtener total clientes"+ e.getMessage());
        }
        return total;
    }
    
    public void mayoresDeEdad(int años){
        String sql = "SELECT * FROM clientes WHERE EDAD >= ? ";
        try(PreparedStatement ps = conexion.prepareStatement(sql)){
            ps.setInt(1, años);
            try (ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    String idCliente = rs.getString("ID_CLIENTE");
                    String nombre = rs.getString("NOMBRE");
                    String apellido = rs.getString("APELLIDO");
                    int edad = rs.getInt("EDAD");
                    
                    Clientes cliente = new Clientes(idCliente, nombre, apellido, edad);
                    System.out.println(cliente.toString());
                }
            }
            ps.close();
            System.out.println("Conexion Cerrada");
        }catch (SQLException e){
            System.err.println("Error al obtener clientes mayores de edad "+e.getMessage());
        }
    }
    
    public ArrayList<Clientes>listadoClientes(){
        ArrayList<Clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes;";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    String idCliente = rs.getString("ID_CLIENTE");
                    String nombre = rs.getString("NOMBRE");
                    String apellido = rs.getString("APELLIDO");
                    int edad = rs.getInt("EDAD");
                
                    Clientes cliente = new Clientes(idCliente, nombre, apellido, edad);
                    clientes.add(cliente);
            }
            rs.close();   
            }
        ps.close();
        }catch (SQLException e){
        System.err.println("Error al obtener clientes mayores de edad "+e.getMessage());
        }
        System.out.println("Conexion Cerrada");
        return clientes;
    }
}
