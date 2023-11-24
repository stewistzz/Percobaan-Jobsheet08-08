import java.util.Random;
import java.util.Scanner;

public class quizz08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // random untuk akses angka random
        Random rand = new Random();

        // pengkondisian
        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success= false;
            do {
                System.out.println("tebak angka (1-10)");
                int answer = input.nextInt();
                input.nextLine();

                // menampilkan informasi mengenai : input nilai tebakan yang dimasukan oleh pengguna, apakah lebih kecil atau lebih besar dari jawaban (angka) yang ditentukan secara acak oleh komputer
                if (answer == number) {
                    System.out.println("nilai anda sama benar dan sama");
                } else if (answer < number) {
                    System.out.println("Jawaban lebih kecil dari angka yang anda masukkan");
                } else {
                    System.out.println("Jawaban lebih besar dari angka yanng anda masukkan");
                }

                // success = (answer == number);
            } while (success);
            System.out.println("Apakah anda ingin mengulang permainan(y/t)");
            // String user = input.next();
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');



    }
}