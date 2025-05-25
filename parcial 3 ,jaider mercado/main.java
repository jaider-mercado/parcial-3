/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import Formularios.FrmMatriz;
import javax.swing.SwingUtilities;

/**
 *
 * @author jaider mercado lopez
 */
public class main {
    
    
     
    public static void main(String[] args) {
    
    SwingUtilities.invokeLater(() -> {
        new FrmMatriz().setVisible(true);
    });
}
}
