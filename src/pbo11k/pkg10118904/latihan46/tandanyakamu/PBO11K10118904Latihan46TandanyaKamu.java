/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan46.tandanyakamu;
import java.util.*;
/**
 *
 * @author Firman Alfinas
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk menghitung umur
 */
public class PBO11K10118904Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Age a = new Age(2019);
        System.out.print("Masukan Tahun Lahir Anda : ");
        int i = input.nextInt();
        a.setYearBirth(i);
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Umur");
        System.out.println("Tahun lahir anda : "+ a.getYearBirth());
        System.out.println("Hari ini tahun : "+a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+a.hitungUmur()+" tahun");
        System.out.println("Tandanya kamu "+a.tandanyaKamu(a.hitungUmur()));
    }
    
}
