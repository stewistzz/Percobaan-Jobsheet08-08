

import java.util.Scanner;

public class BioskopWithScanner08 {
    public static void main(String[] args) {
        
        Scanner input08 = new Scanner(System.in);

        // deklarasi array
        String penonton[][] = new String[4][2];

        


        // modidikasi menu input data penonton, tampilkan daftar penonton, exit
        while (true) {
            //menampilkan menu yang dapat dipilih
            System.out.println("Daftar Menu : ");
            System.out.println("1. Menu input data penonton");
            System.out.println("2. Menu tampilkan data penonton");
            System.out.println("3. Menu exit");
            System.out.print("Masukkan menu yang ingin dipilih(1,2,3) : ");
            int pilihan = input08.nextInt();
            System.out.println();

            // pengkondisian saat pemilihan dengan switch case
            switch (pilihan) {
                case 1:
                    // input data penonton
                    System.out.print("Masukkan nama : ");
                    String nama = input08.next();
                    int baris, kolom;

                    while (true) {
                        System.out.print("masukkan baris : ");
                        baris = input08.nextInt();
                        System.out.print("masukkan kolom : ");
                        kolom = input08.nextInt();

                        if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                           if (penonton[baris-1][kolom-1] == null) {
                             penonton[baris-1][kolom-1] = nama;
                             break;
                           } else {
                            System.out.println();
                            System.out.println("Kursi yang anda inginkan sudah terisi! masukkan nomor kursi yang lain!!");
                           }
                        } else {
                            System.out.println();
                            System.out.println("Baris dan kolom anda tidak tersedia! Coba masukkan lagi");
                        }
                    }
                break;
                   

                case 2:
                //menampilkan daftar penonton
                System.out.println("Daftar penonton");
                for (int i = 0; i < penonton.length; i++) {
                    // System.out.println(penonton.length);
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Penonton baris " + (i+1) + ", " + "kolom" + (j+1) + ": ***");
                        } else {
                            System.out.println("Penonton baris " + (i+1) + ", " + "kolom" + (j+1) + ": " + penonton[i][j]);
                        }
                    }
                }
                System.out.println();
                break;
                
                case 3:
                //exit program
                System.out.println("Terimakasih kami ucapkan");
                System.exit(0);
               break;

                default:
                System.out.println("Pilihan menu anda tidak sesuai, mohon input menu lagi");
                break;
            }

            // jika baris dan kolom kursi tidak tersedia maka kembali ke daftar menu
                System.out.println();
                System.out.println("kembali lagi ke daftar menu? (y/n) : ");
                String next = input08.next();
                System.out.println();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
