/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona{
    private int numSeguridadSocial;

    public Empleado(String nombre, String apellidos,int nunumSeguridadSocial) {
        super(nombre, apellidos);
        this.numSeguridadSocial = nunumSeguridadSocial;
    }

    public int getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }
    
    
    
    @Override
    public String imprimir(){
        return "La informacion del usuario es " + getNombre() + " " +  getApellidos() + " y el numero de la S Social es " + getNumSeguridadSocial();
    }

    @Override
    public String toString() {
        return "Empleado{" + "numSeguridadSocial= " + numSeguridadSocial + " Nombre " + super.getNombre()+ " Apellido " + super.getApellidos() +'}';
    }
    
    
}
