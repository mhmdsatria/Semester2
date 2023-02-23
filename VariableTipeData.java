
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umum
 */
public class VariableTipeData {
    
    static String nama;
    static int nilai;
    static Integer sks;
    static int biaya;
    static final int biaya_sks = 50000;
    
    public static void main (String[]args){
        
        Scanner tile = new Scanner(System.in);
        System.out.print("Isikan Nama:");
        nama=tile.nextLine();
        System.out.print("Masukan Nilai:");
        nilai=tile.nextInt();
        System.out.print("Jumlah SKS:");
        sks=tile.nextInt();
        
        double total_biaya = sks * biaya_sks;
        double biaya  = sks * biaya_sks;
        
        if(total_biaya>2000000){
            total_biaya = total_biaya - total_biaya * 0.2;
        }
        
        else if(total_biaya>1000000){
            total_biaya = total_biaya - (total_biaya * 0.1);
        }
        
        System.out.println("Nama Anda:" + nama);
        System.out.println("Nilai:" + nilai);
        System.out.println("Sks yang anda ambil sebanyak: "+ sks +" SKS");
        System.out.println("Total biaya sebesar Rp." + biaya);
        System.out.println("Total Biaya yang harus anda bayar sebesar:"+total_biaya);
        
    }
    
}
  
