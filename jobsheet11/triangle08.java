import java.util.Scanner;

public class triangle08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // user mengisi sebanyak N
        System.out.print("Masukkan nilai yang anda inginkan = ");
        int N = input.nextInt();

        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        int x = 0;
        while (x < N) {
            int j = N;
            while (j > x) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            x++;
        }

        // perulangan untuk cetak segitiga angka
        for (int y = 0; y <= N; y++) {
            for(int z = N; z > y; z--) {
                System.out.print(" ");
            }
            for(int a = 1; a <= y; a++) {
                System.out.print(a);
            }
            System.out.println();
        }

        

    }
}