import java.util.Scanner;

public class LinearSearch08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int[] arrayInt = {34, 18,26, 48, 72, 20, 56,63};
        // int arrayInt[] = new int[n];
        // int key = 20, hasil = 0;
        
        // // pengkondisian for
        // for (int i = 0; i < arrayInt.length; i++) {
        //     if (arrayInt[i] == key) {
        //         hasil = i;
        //         break;
        //     }
        // }

        // input banyak elemen pada array
        System.out.print("Masukkan jumlah elemen array : ");
        int n = input.nextInt();

        // input isi array yang diinginkan
        int arrayInt[] = new int[n];
        // banyak elemen array yang dimasukkan
        // System.out.println("masukkan jumlah elemen array anda : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+" : ");
            arrayInt[i] = input.nextInt();
        }
        
        //input array yang ingin dicari
        System.out.print("Masukkan nilai array yang ingin dicari : ");
        int key = input.nextInt();

        // proses pencarian nilai array
        int hasil = 0;
        boolean nilaiDitemukan = false;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
            hasil = i;
            nilaiDitemukan = true;
            // System.out.println("nilai key ditemukan pada indeks ke : " + hasil);
            break;
            } 
        }

        // print nilai
        if (nilaiDitemukan) {
            System.out.println("Nilai key ditemukan pada indeks ke : " + hasil);
        } else {
            System.out.println("NIliai key tidak ditemukan");
        }


        // System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);

    }
}
