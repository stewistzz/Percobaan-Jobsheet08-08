import java.util.Arrays;
import java.util.Scanner;

public class NestedLooop08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double [][]temps = new double[5][7];

        //perulangan pertama
        for (int i = 0; i < temps.length; i++) {
            System.out.println("city : " + (i+1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Day " + (j+1) + " : ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        // // perulangan kedua
        // for (int i = 0; i < temps.length; i++) {
        //     System.out.println("city : " + (i+1));
        //     for (int j = 0; j < temps[0].length; j++) {
        //         System.out.print("Day " + (j+1) + " ");
        //         temps[i][j] = input.nextDouble();
        //     }
        //     System.out.println();
        // }

        // modifikasi untuk menampilkan array menggunakan for-each java
        for (double[] ds : temps) {
            System.out.println(Arrays.toString(ds));
        }

        // menampilkan rata-rata
        /*  kota pertama = jumlah dari suhu yang diisikan dan kemudian dibagi dengan hari */
        for (int i = 0; i < temps.length; i++) {
            double week = 0;
            for (int j = 0; j < temps[i].length; j++) {
                week += temps[i][j];
            }
            double average = week / temps[i].length;
            System.out.printf( "Rata-rata tiap kota " + (i+1) + " adalah = %.2f\n",average);
        }


    }
}
