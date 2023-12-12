package jobsheet13;

import java.util.Scanner;

public class Ucapan_08 {
    public static void main(String[] args) {
        // String nama = penerimaUcapan();
        // System.out.println();
        // System.out.println("Terimakasih " + nama + "\nmay the force ber with you");
        // System.out.println();

        penerimaUcapan();
    }

    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan nama orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        //melakukan sout didalam fungsi return
        System.out.println("Terimakasih " + namaOrang + "\nmay the force be with you");
        return namaOrang;
    }
}