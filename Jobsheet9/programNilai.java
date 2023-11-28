package Jobsheet9;
import java.util.Scanner;

public class programNilai {

        public static void main(String[] args) {
            // scanner input user
            Scanner inputUser = new Scanner(System.in);

            //Buat program untuk menghasilkan nilai tertinggi, nilai terendah, dan rata-rata dari suatu array berisi bilangan bertipe integer.
            //Input: Banyaknya elemen, nilai tiap elemen
            int jumlahlElemen;
            System.out.print("Masukkan jumlah elemen array anda : ");
            jumlahlElemen = inputUser.nextInt();

            //array
            int arrayNilai[] = new int[jumlahlElemen];

            for (int i = 0; i < jumlahlElemen; i++) {
                System.out.print("Masukkan nilai dari elemen array ke-" + i + " : ");
                arrayNilai[i] = inputUser.nextInt();
            }

            //Program menentukan nilai tertinggi
            int nilaiTinggi = arrayNilai[0];

            for (int i = 0; i < jumlahlElemen; i++) {
                if (arrayNilai[i] > nilaiTinggi) {
                    nilaiTinggi = arrayNilai[i];
                }
            }

            //Program menentukan nilai terendah
            int nilaiRendah = arrayNilai[0];

            for (int i = 0; i < jumlahlElemen; i++) {
                if (arrayNilai[i] < nilaiRendah) {
                    nilaiRendah = arrayNilai[i];
                }
            }


            //rata-rata nilai array dengan bungkus kepada variabel array
            int total = 0;
            for (int i = 0; i < jumlahlElemen; i++) {
                total += arrayNilai[i];
            }

            int rata2 = total / jumlahlElemen;


            // Output: Nilai tertinggi, nilai terendah, nilai rata-rata
            System.out.println("Nilai tertinggi : " + nilaiTinggi);
            System.out.println("Nilai terendah : " + nilaiRendah);
            System.out.println("NIlai rata-rata : " + rata2);
        }


}

