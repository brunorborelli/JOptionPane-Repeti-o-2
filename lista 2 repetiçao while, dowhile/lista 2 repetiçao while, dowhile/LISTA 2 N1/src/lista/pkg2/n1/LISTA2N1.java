/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg2.n1;
import javax.swing.JOptionPane;
/**
 *
 * @author erict
 */
public class LISTA2N1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long pi = 4;
        int div = 3;
        int aux = -4/div;
        do{
            pi = pi + aux;
            aux = -aux;
            div = div+2;
        }while (aux >1);
        String saida = "O valor de pi é: " + pi ;
        JOptionPane.showMessageDialog(null, saida);
        // TODO code application logic here
    }
    
}
