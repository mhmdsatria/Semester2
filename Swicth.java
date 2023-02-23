
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umum
 */
public class Swicth {
    
    static String prodi;
    
    
    public static void main(String[] args) {
        
        prodi = JOptionPane.showInputDialog("Isiskan Jurusan").toUpperCase();
        
        switch(prodi){
            case "TI":
                JOptionPane.showMessageDialog(null,"Teknik Informatika");
                break;
            case "TM":
                JOptionPane.showMessageDialog(null,"Teknik Mesin");
                break;
            case "TS":
                JOptionPane.showMessageDialog(null,"Teknik Sipil");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Input Anda Salah");
                break;
                    
        }
        
        
    }
}
