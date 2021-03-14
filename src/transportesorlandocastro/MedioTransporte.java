
package transportesorlandocastro;


public abstract class MedioTransporte {
    
    private String placa;

    public MedioTransporte(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public abstract String acelera();
    
    @Override
    public String toString() {
        return " con la placa " + placa;
    }
    
    
}
