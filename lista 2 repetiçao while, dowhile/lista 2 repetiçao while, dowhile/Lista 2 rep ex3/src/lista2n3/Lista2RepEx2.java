/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2n3;
import javax.swing.JOptionPane;

/**
 *
 * @author erict
 */
public class Lista2RepEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int aux = numero;
        int ni = 0;
        while(aux!=0){
            ni = ni*10+aux%10;
            aux = aux/10;
        }
        if(numero==ni){
            String saida = "É CAPICUA " ;
            JOptionPane.showMessageDialog(null, saida);
        }
        else{
            String saida = "NÃO É CAPICUA "  ;
            JOptionPane.showMessageDialog(null, saida);
        }
        // TODO code application logic here
    }
    
}
