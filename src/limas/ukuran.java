/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package limas;

/**
 *
 * @author ASUS
 */
public class ukuran {int alas, tinggi;
    ukuran (int a, int t){
    alas = a;
    tinggi = t;
    }
    int hitungluas(){
        return alas * alas;
    }
    int hitungvolume (){
        return (hitungluas()*tinggi)/3;
    }
    void tampil(){
        System.out.println(" Alas = "+ alas);
        System.out.println(" Tinggi = "+ tinggi);
        System.out.println(" Luas Alas = " + hitungluas());
        System.out.println(" volume Limas = "+ hitungvolume());}
}
