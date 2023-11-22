import java.util.Scanner;

public class tulisCetak {
    static Scanner input = new Scanner(System.in);
    static int nilai;

    static int tulisData () {
        System.out.println("Input nilai");
        nilai = input.nextInt();
        return nilai;
    }

    static void keluar () {
        System.out.println("NIlai anda = ");
        System.out.print(nilai);
    }

    public static void main(String[] args) {
        tulisData();
        keluar();
    }
}
