/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2.n4;
import javax.swing.JOptionPane;

/**
 *
 * @author erict
 */
public class Lista2N4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        for (numero=1000; numero<=9999; numero= numero+1){
            if(numero == (((numero/100)+(numero%100))*((numero/100)+(numero%100)))){
                String saida = "numero: "+ numero;
                JOptionPane.showMessageDialog(null, saida);
                numero = numero +1;
            }
        }
        // TODO code application logic here
    }
    
}
