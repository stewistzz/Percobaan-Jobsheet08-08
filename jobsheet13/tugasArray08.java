package jobsheet13;

import java.util.Arrays;
import java.util.Scanner;

public class tugasArray08 {
    static String[] namaMahasiswa;
    static int[][] dataNilaiSiswa;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        namaMahasiswa = new String[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + " : ");
            namaMahasiswa[i] = input.next();
        }

        System.out.print("Masukkan jumlah baris array : ");
        int userBaris = input.nextInt();
        dataNilaiSiswa = new int[jumlahMahasiswa][userBaris];

        nilaiMhs(dataNilaiSiswa);
        cetakNilai(dataNilaiSiswa);
        nilaiTertinggi(dataNilaiSiswa);
        tampilNilai();
    }

    // fungsi input data nilai mahasiswa
    static void nilaiMhs(int[][] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa " + namaMahasiswa[i] + " adalah : ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai minggu ke-" + (j + 1) + "adalah : ");
                Scanner input = new Scanner(System.in);
                nilai[i][j] = input.nextInt();
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
    }

}
