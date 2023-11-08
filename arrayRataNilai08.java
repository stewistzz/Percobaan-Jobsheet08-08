import java.util.Scanner;

public class arrayRataNilai08 {
    public static void main(String[] args) {

        Scanner inputNilai08 = new Scanner(System.in);

        //Buat array nilaiMhs bertipe integer dengan kapasitas 10. Kemudian deklarasikan variable total dan rata2
        int[] nilaiMhs = new int[10];
        double total = 0, rata2;

        //Isi array nilaiMhs dengan nilai dari input pengguna
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = inputNilai08.nextInt();
        }

        //menghitung jumlah keseluruhan nilai dalam array nilaiMhs
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            // System.out.println(total);
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa = " + rata2);


    }
}
