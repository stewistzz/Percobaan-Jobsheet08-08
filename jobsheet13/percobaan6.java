package jobsheet13;

import java.util.Scanner;

public class percobaan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan penjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        // L = p *l;
        L = hitungLuas(p, l);
        System.out.println("Luas dari balok adalah : " + L);

        //vol = p*l*t;
        vol = hitungVolume(p, l, t);
        System.out.println("Volume dari balok adalah : " + vol);
    }

    // mengubah kode menjadi beberapa fungsi untuk luas dan volume
    static int hitungLuas(int pjg, int lbr) {
        int Luas = pjg*lbr;
        return Luas;
    }

    static int hitungVolume(int pjg, int lbr, int tg) {
        int Volume = pjg*lbr*tg;
        return Volume;
    }
}
