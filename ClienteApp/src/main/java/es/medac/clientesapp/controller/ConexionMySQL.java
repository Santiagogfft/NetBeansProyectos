package es.medac.clientesapp.controller;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
/**
 *
 * @author Usuario
 */
public class ConexionMySQL {
    protected Connection conexion;
    String url = "jdbc:mysql://localhost:3306/clientes";
    String usuario = "admin";
    String pwd = "1234";
    
    public Connection getConnection(){
        try {
            conexion = (Connection) DriverManager.getConnection(url, usuario, pwd);
            System.out.println("Conexion establecida");
        } catch (SQLException e){
            System.out.println("Conexion erronea "+ e.toString());
        }
        return conexion;
    }
    
    public void cerrarConexion(){
        try{
            this.conexion.close();
        }catch(SQLException ex){
            
        }
    }
}
