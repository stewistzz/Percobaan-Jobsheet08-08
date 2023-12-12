package coba_fungsi_02;

import java.util.Scanner;

public class rekursi01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("System hitung fibonacci");
        System.out.print("Masukkan nilai = ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(rumusFibonacci(i) + " ");
            

            sum += rumusFibonacci(i);
            System.out.print(sum);
        }
        System.out.println();

    }

    static int rumusFibonacci(int value) {

        if (value == 0 || value == 1) {
            return 1;
        } else {
            int f_n = 1, f_n_2 = 0, f_n_1 = 1;

            for (int i = 0; i < value; i++) {
                f_n = f_n_1 + f_n_2;
                f_n_2 = f_n_1;
                f_n_1 = f_n;         
            }
             return f_n;

        }
        // System.out.println();
    }

}
