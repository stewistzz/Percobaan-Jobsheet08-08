package jobsheet13;

import java.util.Scanner;

public class tugasArray08_01 {
    static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static int[][] dataNilaiSiswa = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 30, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 10, 5, 45},
        {50, 0, 7, 8, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };

    public static void main(String[] args) {
        nilaiMhs(dataNilaiSiswa);
        cetakNilai(dataNilaiSiswa);
        tampilNilai();
        nilaiTertinggi(dataNilaiSiswa);
    }

    // fungsi input data nilai mahasiswa
    static void nilaiMhs(int[][] dataNilaiSiswa) {
        for (int i = 0; i < dataNilaiSiswa.length; i++) {
            System.out.println("Nilai mahasiswa " + namaMahasiswa[i] + " : ");
            for (int j = 0; j < dataNilaiSiswa[i].length; j++) {
                System.out.println("Nilai minggu ke-" + (j + 1) + " : " + dataNilaiSiswa[i][j]);
            }
        }
        System.out.println();
        return;
    }

     // perulangan cetak nilai mahasiswa
     static void cetakNilai(int[][] dataNilaiSiswa) {
        for (int i = 0; i < dataNilaiSiswa.length; i++) {
            System.out.println("Nilai Mahasiswa atas nama : " + namaMahasiswa[i]);
            for (int j = 0; j < dataNilaiSiswa[i].length; j++) {
                System.out.println("Nilai Mahasiswa Minggu ke- " + (j + 1) + " Adalah " + dataNilaiSiswa[i][j]);
            }
            System.out.println();
        }
    }

    // fungsi untuk menampilkan minggu dari nilai tertinggi
    static void tampilNilai() {
        int max = dataNilaiSiswa[0][0];
        int minggu = 1;

        for (int i = 0; i < dataNilaiSiswa.length; i++) {
            for (int j = 0; j < dataNilaiSiswa[i].length; j++) {
                if (dataNilaiSiswa[i][j] > max) {
                    max = dataNilaiSiswa[i][j];
                    minggu = j + 1;
                }
            }
        }
        System.out.println("Nilai tertinggi berada di minggu ke-" + minggu);
    }

     // mencari nilai tertinggi dari seluruh mahasiswa
     static void nilaiTertinggi(int[][] dataNilaiSiswa) {
        int max = dataNilaiSiswa[0][0];
        String nama = namaMahasiswa[0];

        for (int i = 0; i < dataNilaiSiswa.length; i++) {
            for (int j = 0; j < dataNilaiSiswa[i].length; j++) {
                if (dataNilaiSiswa[i][j] > max) {
                    max = dataNilaiSiswa[i][j];
                    nama = namaMahasiswa[i];
                }
            }
        }
        System.out.println("\nNilai maksimal adalah : " + max + "\noleh mahasiswa " + nama);
        return;
    }

}
