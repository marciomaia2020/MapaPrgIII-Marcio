/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapaprgiii.marcio;
import mapaprgiii.marcio.entidades.Aluguel;

/**
 *
 * @author Márcio
 */
public class MapaPrgIIIMarcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluguel aluguel = new Aluguel();
        aluguel.iniciarAluguel();
        aluguel.fecharLocacao();
        aluguel.mostrarResumoLocacao();
    }
    
}
