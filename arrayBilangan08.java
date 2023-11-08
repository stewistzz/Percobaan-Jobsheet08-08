public class arrayBilangan08 {
    public static void main(String[] args) {
        
        int[] bil = new int[4];
        //Isi masing-masing elemen array bil tadi dengan angka 5, 13, -7, 17.
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        //3. ubah menjadi perulangan for
        for(int i = 0; i < 4; i++ ) {
            System.out.println(bil[i]);
        }
        //4.menggantii <=4
        for(int i = 0; i <= 4; i++ ) {
            System.out.println(bil[i]);
        }

        // /Tampilkan ke layar semua isi elemennya
        // System.out.println(bil[0]);
        // System.out.println(bil[1]);
        // System.out.println(bil[2]);
        // System.out.println(bil[3]);

        // //masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. 
        // bil[0] = 5.0;
        // bil[1] = 12867;
        // bil[2] = 7.5;
        // bil[3] = 2000000;

        // //melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
        // int[] array = {5, 13, -7, 17};
        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);
        // System.out.println(array[3]);

    }
}