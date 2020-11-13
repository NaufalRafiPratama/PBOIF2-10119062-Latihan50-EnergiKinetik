/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan50.energikinetik;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * energi kinetik
 */
public class EnergiKinetik {
    private double massa, kecepatan;
    
    public double getMassa() {
        return this.massa / 1000;
    }
    
    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double getKecepatan() {
        return this.kecepatan;
    }
    
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(double massa, double kecepatan) {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    public double hitungUsaha(double kecepatanAwal) {
        return 0.5 * massa * (Math.pow(kecepatan, 2) - Math.pow(kecepatanAwal, 2));
    }
}
