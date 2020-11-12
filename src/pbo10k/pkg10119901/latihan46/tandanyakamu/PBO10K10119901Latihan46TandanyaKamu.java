/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan46.tandanyakamu;

import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan perhitungan umur
 *
 */
public class PBO10K10119901Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age a = new Age();
        Scanner scanner = new Scanner(System.in);
        
        int yearBirth, yearNow, age;
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        yearBirth = scanner.nextInt();
        a.setYearBirth(yearBirth);
        
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        a.Age(yearNow);
        
        age = a.hitungUmur();
        
        System.out.println("\n ======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + a.getYearBirth());
        System.out.println("Hari Ini Tahun \t : " + a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age + " tahun");
        System.out.println(a.tandanyaKamu(age));
    }
    
}
