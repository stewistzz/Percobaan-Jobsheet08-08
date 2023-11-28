package Jobsheet9;
import java.util.Scanner;

public class arrayNilai08 {
    public static void main(String[] args) {
        
        // buat scannner
        Scanner inputNilai = new Scanner(System.in);

        // deklarasi array bertipe integer dengan nama nilaiAkhir dan berkapasitas 10 elemen
        int[] nilaiAkhir08 = new int[10];
        // //perulangan untuk menerima input dan mengisi elemen array nilaiAkhir
        // for (int i = 0; i < 10; i++) {
        //     System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        //     nilaiAkhir08[i] = inputNilai.nextInt();
        // }


        // menggantikan perulangan pertama
        for (int i = 0; i < nilaiAkhir08.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i+1) + " : ");
            nilaiAkhir08[i] = inputNilai.nextInt();
        }


        // 3.	Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai> 70):
        for (int i = 0; i < nilaiAkhir08.length; i++) {
            if (nilaiAkhir08[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " Tidak Lulus !");
            }
        }

        // //perulangan, tampilkan semua isi elemen dari array nilaiAkhir
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Nilai akhir ke-"+ i + " adalah " + nilaiAkhir08[i]);
        // }

    }
}
