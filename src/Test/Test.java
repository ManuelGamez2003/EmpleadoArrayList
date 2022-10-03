/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Dominio.Empleado;
import Dominio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static int contador=0;
    public static void main(String[] args) {
        ArrayList< Empleado> empleados = new ArrayList< >();
        Persona persona1= new Persona("Manuel","Gamez");
        Persona persona2= new Persona("Alberto","Perez");
        Empleado persona3= new Empleado("Alberto","Perez",3);    
        empleados.add(new Empleado("Manuel", "Gamez", 2));
        System.out.println(persona1 + " " + persona2);
        System.out.println("Cantidad: " + contador);
        System.out.println(persona3.imprimir());
        for(int i=0; i < empleados.size();i++){
            System.out.println(empleados.get(i).toString());
        }
        
    }
}
