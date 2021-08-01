/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author OLIVER
 */
public class Propietario extends Persona{
    public String nit;
    public String cui;

    public Propietario(String nit, String cui, String nombre, String apellido, String direccion, String telefono, String fecha_nacimiento, String edad) {
        super(nombre, apellido, direccion, telefono, fecha_nacimiento, edad);
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }
    
@Override 
public void agregar(){
    System.out.println("Nit: "+getNit());
    System.out.println("Cui: "+getCui());
        System.out.println("Nombres: " + getNombre());
        System.out.println("Apellidos: "+ getApellido());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha de nacimiento: "+ getFecha_nacimiento());
        System.out.println("_____________________");
}
@Override
    public void modificar()
    {
     System.out.println("Nit: "+getNit());
    System.out.println("Cui: "+getCui());
        System.out.println("Nombres: " + getNombre());
        System.out.println("Apellidos: "+ getApellido());
        System.out.println("Edad: "+ getEdad());
        System.out.println("Direccion: "+ getDireccion());
        System.out.println("Telefono: "+ getTelefono());
        System.out.println("Fecha de nacimiento: "+ getFecha_nacimiento());
        System.out.println("_____________________");   
    }
        
    
}
