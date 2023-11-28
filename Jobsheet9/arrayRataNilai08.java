package Jobsheet9;
import java.util.Scanner;

public class arrayRataNilai08 {
    public static void main(String[] args) {

        Scanner inputNilai08 = new Scanner(System.in);



        //Buat array nilaiMhs bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata2
        int[] nilaiMhs = new int[10];

        double total = 0, rata2, rataLulus = 0, nilaiTidak=0, rataTidak;
        int jumlahMhsLulus = 0,jumlahMhsTidak= 0, nilaiLulus = 0;
        //input jumlah kahasiswa
        
        // proses agar output yang dihasilkan sama dengan jumlah mahasiswa yang dimasukkan 
        int x = 1;
        System.out.print("Masukkan jumlah mahasiswa yang ingin dimasukkan = ");
        int jumlahMhs = inputNilai08.nextInt();
        while (x < jumlahMhs) {
            //Isi array nilaiMhs dengan nilai dari input pengguna
            for (int i = 0; i < jumlahMhs; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
                nilaiMhs[i] = inputNilai08.nextInt();
            }
            
            //menghitung jumlah keseluruhan nilai dalam array nilaiMhs
            for (int i = 0; i < jumlahMhs; i++) {
                //menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70)
                if (nilaiMhs[i] > 70) {
                    System.out.println("Mahasiswsa ke-" + (i+1) + " lulus!");
                    jumlahMhsLulus++;
                    nilaiLulus += nilaiMhs[i];
                } else {
                    System.out.println("Mahasiswsa ke-" + (i+1) + " tidak lulus!!");
                    jumlahMhsTidak++;
                    nilaiTidak += nilaiMhs[i];
                }
                total += nilaiMhs[i];
                // System.out.println(total);
                x++;
            }
            rataLulus = (double)nilaiLulus / (double)jumlahMhsLulus;
            rataTidak = (double)nilaiTidak / (double)jumlahMhsTidak;

            System.out.println(jumlahMhsLulus);
            System.out.println(jumlahMhsTidak);

            System.out.printf("Rata-rata nilai mahasiswa lulus = %.2f\n", rataLulus);
            System.out.printf("Rata-rata nilai mahasiswa tidak lulus = %.2f\n", rataTidak);
            // rata2 = total/nilaiMhs.length;
            // System.out.println("Rata-rata nilai mahasiswa = " + rata2);
        }
        


    }
}
