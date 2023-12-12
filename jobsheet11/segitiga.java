import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class segitiga {
    public static void main(String[] args) {
        int i=0;
        while (i<10) {
            int u=9;
            while (u>i) {
                System.out.print(" ");
                u--;
            }
            int e=0;
            while (e<u) {
                System.out.print("1");
                e++;
            }
            System.out.println();
        i++;
        }


        int[] angka = {1,5653,234,56,78,7,3,2};
        Arrays.sort(angka);

        for (int j : angka) {
            System.out.print(j + ", ");
        }

        // int[] nilai = {2,3,44,56,67,4,2,1};
        //  Arrays.sort(nilai, Collections.reverseOrder());
        // for (int reverse : nilai) {
        //     System.out.println(reverse);
        // }


    }
}
