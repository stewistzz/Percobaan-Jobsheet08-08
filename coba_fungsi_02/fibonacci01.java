package coba_fungsi_02;

import java.util.Scanner;

public class fibonacci01 {
    public static void main(String[] args) {
        int f_n, f_n_1, f_n_2, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        n = input.nextInt();
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        for(int i = 0; i < n; i++) {
            System.out.println("Deret fibonacci ke - " + (i+1) + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }

}
