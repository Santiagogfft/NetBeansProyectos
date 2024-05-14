/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.clientesapp.modelo;

/**
 *
 * @author Usuario
 */
public class Clientes {
    
    private String idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Clientes (){
        this.idCliente = "N/A";
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.edad = 0;
    }
    
    public Clientes(String id, String nom, String apell, int años){
        this.idCliente = id;
        this.nombre = nom;
        this.apellido = apell;
        this.edad = años;
    }
    
    public String getIdCliente(){
        return this.idCliente;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setIdCliente(String id){
        this.idCliente = id;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setApellido(String apell){
        this.apellido = apell;
    }
    public void setEdad(int años){
        this.edad = años;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "ID: "+this.idCliente+
               "\nNombre:"+this.nombre+
               "\nApellido:"+this.apellido+
               "\nEdad:"+this.edad;
    }
    
}
