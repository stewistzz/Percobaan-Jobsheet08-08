package jobsheet13;

import java.util.Scanner;

public class ucapanTerimakasih_08 {
    public static void main(String[] args) {
        //penerimaanUcapan();
        //ucapanTerimakasih();
        ucapanTambahan();
    }   

     static String penerimaanUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan");
        String namaOrang = sc.next();
        sc.close();
        return namaOrang;
    }

    static String ucapanTerimakasih() {
        String nama = penerimaanUcapan();
        System.out.println("Thank you" + nama + "for being the best texaher in the wolrd\n" + "You inspired in me a love for learning and made me feel like i could ask you anything");
        return nama;
    }

    static String ucapanTambahan() {
        String tambahan = ucapanTerimakasih();
        System.out.println("Semoga harimu menyenangkan dan sehat selalu");
        return tambahan;
    }

}
