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
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // int x = 0;
        // while (x <= N) {
        //     int j = 10;
        //     while (j > x) {
        //         System.out.print("*");
        //         j--;
        //     }
        //     System.out.println();
        //     x++;
        // }

    }
}