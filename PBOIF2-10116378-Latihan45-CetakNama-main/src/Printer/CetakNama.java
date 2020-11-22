/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printer;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Program cetak nama
 */
import java.util.Scanner;

public class CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.printf("=====Aplikasi Pencetak Nama=====\n");
        System.out.printf("Masukkan nama anda : "); printer.setNama(scan.nextLine());
        System.out.printf("Mau cetak nama berapa kali? : "); printer.setJmlCetak(scan.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(),printer.getNama());
    }
    
}
