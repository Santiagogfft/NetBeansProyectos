/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.convertidor;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private String idCliente;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Cliente (){
        this.idCliente = "N/A";
        this.nombre = "N/A";
        this.apellido = "N/A";
        this.edad = 0;
    }
    
    public Cliente(String id, String nom, String apell, int años){
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
    
    
}
