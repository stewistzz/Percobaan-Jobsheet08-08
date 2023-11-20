import java.util.Arrays;

public class coba {
        public static void main(String[] args) {
        //   String[][] prices = {{"1", "2", "3"}, {"1", "2"}, {"3", "4", "5"}};
        //   System.out.println(prices[3][2]);
        //   System.out.println();

          boolean[][] result = new boolean[7][3];
          System.out.println(result[1].length);

          String mobil[]={"Honda","Mitsubishi'","Tesla","Daihatsu","Nissan","Audy"};
System.out.println(mobil[2]);

            String[][] nilaiAkhir = {
                {"B+", "C", "B+", "A", "B+"},
                {"A", "A", "C+", "B", "B", "C+"},
                {"D+", "C"},
                {"C+", "B+", "B"}
            };
            System.out.println(nilaiAkhir[2][1]);
            System.out.println();
            int[][] pri = new int[5][3];
            System.out.println(pri[3][2]);

            System.out.println();
            int[] aray = {34, 18, 26, 48, 72, 20, 56, 63};
            int key = 20;
            int hasil = -1;
            for (int i = 0; i < aray.length; i++) {
                if (aray[i] == key) {
                    hasil = i;
                    break;
                }
            }
            System.out.println(hasil);

            String[][] student = {{ "eko","rahmi" }};
            System.out.println(Arrays.toString(student[0]));
            System.out.println();

            // result = 0;
            // for (int i = 0; i < 1; i++) {
            //     for (int j = 0; j <= 2; j++) {
            //     result = i + result;
            //     }   
            // }
            // System.out.println(result);

            System.out.println();
            int array[] ={1, 2, 2};
            System.out.println(array[0]);
        }
      
}
