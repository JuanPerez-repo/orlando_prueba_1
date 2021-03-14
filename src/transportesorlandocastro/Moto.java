/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportesorlandocastro;


public class Moto extends MedioTransporte{
    
    private int modelo;

    public Moto(int modelo, String placa) {
        super(placa);
        this.modelo = modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String acelera(){
        return "La moto "+super.toString()+" acelera con pedal para motos.";
    }
    
    @Override
    public String toString() {
        return "La moto "+super.toString()+" es de modelo "+ modelo + '.';
    }
    
    
}
