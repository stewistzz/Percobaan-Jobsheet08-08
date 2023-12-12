import java.util.Scanner;

public class kotakAngka {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        // membuat perulangan angka untuk kotak
        for(int i = 0; i < angka; i++) {
            System.out.println();
            for (int j = 0; j < angka; j++) {
                if (i == 0 || i == angka -1 || j == 0 || j == angka-1) {
                System.out.print(angka);
                 } else {
                     System.out.print(" ");
                 }
            }
            System.out.print("");
        }

    }
}
