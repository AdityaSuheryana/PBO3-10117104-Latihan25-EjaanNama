/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO310117104Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nama;    
        Scanner scn= new Scanner(System.in);
        
        System.out.printf("Masukkan Nama Depan Anda buat di eja : ");
        nama=scn.next();
        System.out.println("");
        System.out.println("Ejaan untuk '"+nama+"' adalah : ");
        for(int i=0; i<nama.length(); i++){
            String ambilHuruf;
            ambilHuruf = nama.substring(i,i+1);
            System.out.println("Huruf ke-"+(i+1)+" : "+(ambilHuruf));
        }
    }
    
}
