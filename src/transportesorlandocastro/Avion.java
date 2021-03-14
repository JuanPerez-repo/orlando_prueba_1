/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportesorlandocastro;


public class Avion extends MedioTransporte{
    
    private int modelo;

    public Avion(int modelo, String placa) {
        super(placa);
        this.modelo=modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String acelera(){
        return "El avion "+super.toString()+" acelera con palancas.";
    }
    
    
    @Override
    public String toString() {
        return "El avion "+super.toString()+" es de modelo "+ modelo + '.';
    }
}
