/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.penghitung.volume.bangun.ruang;
import java.util.Scanner;
/**
 *
 * @author siti maysaroh
 */
public class AplikasiPenghitungVolumeBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner abdur = new Scanner (System.in);    
    double B,K,T, L, P, V, R;
    System.out.println ("Aplikasi Menghitung Volume 5 Jenis Bangun Ruang") ;
    System.out.println ("1. BALOK");
    System.out.println ("2. KUBUS");
    System.out.println ("3. KERUCUT");
    System.out.println ("4. BOLA");
    System.out.println ("5. PRISMA");
    System.out.println ("");
    System.out.print ("Masukkan Jenis Bangun : ") ;
    B=abdur.nextDouble();
    System.out.print ("");
    if ( B== 2){
    System.out.println ("Bangun yang dimasukkan adalah Kubus") ;
    System.out.println ("");
    System.out.print ("Masukkan Nilai sisi 1 : ") ;
    T=abdur.nextDouble();
    System.out.print ("Masukkan Nilai sisi 2 : ") ;
    L=abdur.nextDouble();
    System.out.print ("Masukkan Nilai sisi 3 : ") ;
    P=abdur.nextDouble();
    V = P*L*T ; 
    System.out.println ("") ;
    System.out.println ("Volume Kubus ini adalah  :  "  + V) ;
    }   
    else if ( B== 1){
        System.out.println ("Bangun Ini adalah Balok") ;
        System.out.println ("") ;
        System.out.print ("Masukkan Nilai Panjang : ") ;
        T=abdur.nextDouble();
        System.out.print ("Masukkan Nilai Lebar  : ") ;
        L=abdur.nextDouble();
        System.out.print ("Masukkan Nilai sisi Tinggi : ") ;
        P=abdur.nextDouble();
        V = P*L*T ;
        System.out.println ("") ;
        System.out.println ("Volume Kubus ini adalah  :  "  + V) ;
    }
    else if ( B== 3){
        System.out.println ("Bangun Ini adalah Kerucut ") ;
        System.out.println ("") ;
            System.out.print ("Masukkan Nilai Jari - Jarinya : ") ;
            R=abdur.nextDouble();
            System.out.print ("Masukkan Nilai sisi Tinggi : ") ;
            P=abdur.nextDouble();
            V = (1/3)*3.14*R*R*P ;
            System.out.println ("") ;
            System.out.println ("Volume Kerucut ini adalah  :  "  + V) ;
    }
     else if ( B== 4){
        System.out.println ("Bangun Ini adalah Bola ") ;
        System.out.println ("") ;
            System.out.print ("Masukkan Nilai Jari - Jarinya : ") ;
            R=abdur.nextDouble();
            V = (4/3)*3.14*R*R*R ;
            System.out.println ("") ;
            System.out.println ("Volume Bola ini adalah  :  "  + V) ;
    }
    else if ( B== 5){
        System.out.println ("Bangun Ini adalah PRISMA") ;
        System.out.println ("") ;
            System.out.print ("Masukkan Nilai Panjang : ") ;
            T=abdur.nextDouble();
            System.out.print ("Masukkan Nilai Lebar  : ") ;
            L=abdur.nextDouble();
            System.out.print ("Masukkan Nilai sisi Tinggi : ") ;
            P=abdur.nextDouble();
            V = 0.5*P*L*T ;
            System.out.println ("") ;
            System.out.println ("Volume PRISMA ini adalah  :  "  + V) ;
    }
    }
    
}
