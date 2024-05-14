package es.medac.clientesapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Consultas {
    private Connection conexion;
    
    public Consultas(){
        this.conexion = new ConexionMySQL().getConnection();
    }
    
    
    public int insertClientes(){
        //Sintaxis INSERT INTO TABLA () VALUES ();
        Statement st1 = null;
        int filasAfectadas = 0;
        String consulta = "INSERT INTO clientes VALUES (2, 'Juan', 'Perez', 20);";
        try{
            st1 = conexion.createStatement();
            filasAfectadas = st1.executeUpdate(consulta);
            System.out.println(filasAfectadas + "Fila(s) insertada(s).");
        }catch (SQLException ex){
            System.err.println("Error al insertar" + ex.getMessage());   
        } finally {
            if(st1 != null){
                try{
                    st1.close();
                    System.out.println("Conexión cerrada con exito");
                }catch(SQLException e){
                    System.err.println("Error al cerrar PreparedStatement: "+e.getMessage());
                }
            }
        }
        return filasAfectadas;
    }
    public int deleteClientes(){
        //Sintaxis INSERT INTO TABLA () VALUES ();
        Statement st1 = null;
        int filasAfectadas = 0;
        String consulta = "DELETE FROM clientes WHERE id_cliente = 2";
        try{
            st1 = conexion.createStatement();
            filasAfectadas = st1.executeUpdate(consulta);
            System.out.println(filasAfectadas + " Fila(s) eliminada(s).");
        }catch (SQLException ex){
            System.err.println("Error al eliminar" + ex.getMessage());
            
        } finally {
            if(st1 != null){
                try{
                    st1.close();
                    System.out.println("Conexión cerrada con exito");
                }catch(SQLException e){
                    System.err.println("Error al cerrar: "+e.getMessage());
                }
            }
        }
        return filasAfectadas;
    }
    /**
     * 
     * @param id
     * @param nueNombre
     * @param nueApellido
     * @param Edad
     * @return
     * @throws SQLException 
     */
    public boolean updateCliente(int id, String nueNombre, String nueApellido, int Edad) throws SQLException{
        PreparedStatement st1 = null;
        boolean actualizacionExitosa = false;
        try{
            String sql = "UPDATE clientes SET nombre = ?, apellido = ?, edad = ? WHERE id_cliente = ?;";
            st1 = conexion.prepareStatement(sql);
            st1.setString(1, nueNombre);
            st1.setString(2, nueApellido);
            st1.setInt(3, Edad);
            st1.setInt(4, id);
            int filasActualizadas = st1.executeUpdate();
            if(filasActualizadas > 0){
                System.out.println("Actualizacion exitosa!");
                actualizacionExitosa = true;
            } else{
                System.out.println("No se encontro el cliente con id_cliente "+ id);
            }
        } catch(SQLException e){
            System.err.println("Error al actualizar el cliente: "+e.getMessage());
        } finally{
            if(st1 != null){
                try{
                    st1.close();
                    System.out.println("Conexión cerrada con exito");
                }catch(SQLException e){
                    System.err.println("Error al cerrar: "+e.getMessage());
                }
            }
        }
        return actualizacionExitosa;
    }
    public boolean insertCliente(String id, String nueNombre, String nueApellido, int Edad) throws SQLException{
        PreparedStatement st1 = null;
        boolean inserccionExitosa = false;
        try{
            String sql = "INSERT INTO clientes VALUES (?, ?, ?, ?);";
            st1 = conexion.prepareStatement(sql);
            st1.setString(1, id);
            st1.setString(2, nueNombre);
            st1.setString(3, nueApellido);
            st1.setInt(4, Edad);
            int filasInsertadas = st1.executeUpdate();
            if(filasInsertadas > 0){
                System.out.println("Inserccion exitosa!");
                inserccionExitosa = true;
            }
        } catch(SQLException e){
            System.err.println("Error al insertar el cliente: "+e.getMessage());
        } finally{
            if(st1 != null){
                try{
                    st1.close();
                    System.out.println("Conexión cerrada con exito");
                }catch(SQLException e){
                    System.err.println("Error al cerrar: "+e.getMessage());
                }
            }
        }
        return inserccionExitosa;
    }
    
}
