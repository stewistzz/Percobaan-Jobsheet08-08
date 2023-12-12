package jobsheet13;

import java.util.Scanner;

public class Kubus08 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan sisi kubus anda : ");
    int angka = input.nextInt();

    luasPermukaan(angka);
    volumeKubus(angka);

 }  
 // fungsi untuk menghitung luas permukaan kubus
 static int luasPermukaan(int sisi) {
    int Lpermukaan = 6*sisi;
    System.out.println("Luas permukaan kubus adalah : "+Lpermukaan);
    return Lpermukaan;
 }
 // fungsi untuk menghitung volume kubus
 static int volumeKubus(int sisi) {
    int volKubus = sisi*sisi*sisi;
    System.out.println("Volume kubus anda adalah : " + volKubus);
    return volKubus;
 }
 
}
