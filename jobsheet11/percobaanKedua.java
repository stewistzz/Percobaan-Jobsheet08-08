import java.util.Scanner;

public class percobaanKedua {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("*");
        }
        System.out.println();


        //perulangna untuk membuat persegi
        for (int iOuter = 0; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
