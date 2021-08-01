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
public class Tipo extends Vehiculo{
    public String tipo;

    public Tipo(String tipo, String placa, String chasis, String serie, String motor, String cilintros, String marca, String modelo, String linea, String asientos, String no_tarjeta, String uso) {
        super(placa, chasis, serie, motor, cilintros, marca, modelo, linea, asientos, no_tarjeta, uso);
        this.tipo = tipo;
    }

   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
 @Override
public void agregar(){
    System.out.println("Tipo: "+getTipo());
    System.out.println("Placa: "+getPlaca());
    System.out.println("Chasis: "+getChasis());
    System.out.println("Serie: "+getSerie());
    System.out.println("Motor: "+getMotor());
    System.out.println("Cilindros: "+getCilintros());
    System.out.println("Marca: "+getMarca());
    System.out.println("Modelo: "+getModelo());
    System.out.println("Linea: "+getLinea());
    System.out.println("Asisentos: "+getAsientos());
    System.out.println("No. targeta: "+getNo_tarjeta());
    System.out.println("Uso: "+getUso());
    
}

@Override
public void modificar(){
    System.out.println("Tipo: "+getTipo());
    System.out.println("Placa: "+getPlaca());
    System.out.println("Chasis: "+getChasis());
    System.out.println("Serie: "+getSerie());
    System.out.println("Motor: "+getMotor());
    System.out.println("Cilindros: "+getCilintros());
    System.out.println("Marca: "+getMarca());
    System.out.println("Modelo: "+getModelo());
    System.out.println("Linea: "+getLinea());
    System.out.println("Asisentos: "+getAsientos());
    System.out.println("No. targeta: "+getNo_tarjeta());
    System.out.println("Uso: "+getUso());
    
}


        
    
    
    
    
}
