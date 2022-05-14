/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.pkg2.n2;
import javax.swing.JOptionPane;

/**
 *
 * @author erict
 */
public class Lista2N2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;
		double divisor = 1.0;
		double serie = 0;
		double pi;
		
		while(contador <= 51){
			if(contador % 2 == 0)
				serie -= Math.pow((1.0 / divisor), 3.0);
			else
				serie += Math.pow((1.0 / divisor), 3.0);
			
			contador++;
			divisor += 2;
		}
		
		pi = Math.pow((serie * 32.0), (1.0/3.0));
                String saida = "O valor de pi é: " + pi ;
                JOptionPane.showMessageDialog(null, saida);
        // TODO code application logic here
    }
    
}
