
package transportesorlandocastro;


public class Bus extends MedioTransporte{

    private int modelo;

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    public Bus(int modelo, String placa) {
        super(placa);
        this.modelo=modelo;
    }
    
    
    @Override
    public String acelera(){
        return "El bus "+super.toString()+" acelera con pedal.";
    }

    @Override
    public String toString() {
        return "El bus "+super.toString()+" es de modelo "+ modelo + '.';
    }
    
    
    
    
}
