import java.util.Scanner;

public class menuGuru {
   // membuat array dengan isi daftar nama siswa
  static String[] murid = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
  // input array 2 dimensi
  static int[][] kelas = new int[murid.length][7];
  
  //fungsi untuk menginput data
  static void inputData(Scanner nilai){
     for (int i = 0; i < kelas.length; i++) {
        System.out.println("Masukkan keals untuk nama : " + murid[i]);
        for (int j = 0; j < kelas[i].length; j++) {
           System.out.print("Minggu ke-" + (j+1) + " : ");
           kelas[i][j] = nilai.nextInt();
         }
      }
   }
   
   // cetak data
   static void cetakData() {
      System.out.println("\nData dalam bentuk tabel: \n");
      System.out.print("Nama\t");
      for (int i = 0; i < 7; i++) {
         System.out.print("Minggu " + (i+1) + "\t");
      }
      System.out.println();
      for (int i = 0; i < kelas.length; i++) {
         System.out.print(murid[i]);
         for (int j = 0; j < kelas[i].length; j++) {
            System.out.print("\t" + kelas[i][j] + "\t");
         }
         System.out.println();
      }
   }   
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      inputData(input);
      cetakData();

    }
}
