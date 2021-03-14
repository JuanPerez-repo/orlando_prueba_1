
package transportesorlandocastro;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TransportesOrlandoCastro {

static ArrayList<MedioTransporte> medios = new ArrayList<MedioTransporte>();
    
    public static void main(String[] args) {

        String placa;
        int ano;
        int op=0;
        
        do{
            //comentario despues de agregar del primer push xdddddd
            //segundo comentario, aqui hago un pull
            //segundo comentario por parte del polaco
            //otro comentario mas
            op=Integer.parseInt(JOptionPane.showInputDialog("Menu: \n\n"
                    + "1. Añadir bus\n"
                    + "2. Añadir moto\n"
                    + "3. Añadir avión\n"
                    + "4. Añadir barco\n"
                    + "5. Mostrar las placas de los vehiculos y su modelo\n"
                    + "6. Mostrar las placas de los vehiculos y con que aceleran\n"
                    + "0. Salir de la aplicacion."));
            
            if (op==0){
                JOptionPane.showMessageDialog(null, "Saliste de la aplicacion.");
            } else if (op==1){
                
                placa = JOptionPane.showInputDialog("Placa del bus:");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Modelo del bus:"));
                
                medios.add(new Bus(ano, placa));
                
            } else if (op==2){
                
                placa = JOptionPane.showInputDialog("Placa de la moto:");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Modelo de la moto:"));
                
                medios.add(new Moto(ano, placa));
                
            } else if (op==3){
                
                
                placa = JOptionPane.showInputDialog("Placa del avion:");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Modelo del avion:"));
                
                medios.add(new Avion(ano, placa));
                
            } else if (op==4){
                
                placa = JOptionPane.showInputDialog("Placa del barco:");
                ano = Integer.parseInt(JOptionPane.showInputDialog("Modelo del barco:"));
                
                medios.add(new Barco(ano, placa));
                
            } else if (op==5){
                mostrarPlacas();
            } else if (op==6){
                mostrarAceleracion();
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
            
        } while (op!=0);
        
        
    }
    
    public static void mostrarPlacas (){
        for (MedioTransporte m : medios){
            System.out.println(m.toString());
        }
    }
    
    public static void mostrarAceleracion(){
        for (MedioTransporte n : medios){
            System.out.println(n.acelera());
        }
    }
    
}
