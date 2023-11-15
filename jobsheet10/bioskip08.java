package jobsheet10;

public class bioskip08 {
    public static void main(String[] args) {
        // array 2 dimensi string
        String penonton[][] = new String[4][2];

        // isi penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Della";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";


        // print out
        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        System.out.println();

        //print out .length
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        System.out.println();
        // perulangan untuk mencetak banyaknya array
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("panjang baris ke-" + (i+1) + " : " + penonton[i].length);
        }
        System.out.println();

        // menampilkan panjang setiap baris pada array menggunakan foreach loop
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris : " + barisPenonton.length);
        }
        System.out.println();

        //menampilkan nama penonton pada baris ke-3 menggunakan for loop
        System.out.println("penonton pada baris ke-3 : ");
        
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
        System.out.println();

        // Mmenampilkan dengan foreach
        System.out.println("Manmpilkan banyak orang baris 3 foreach :");
        for (String i : penonton[2]) {
            System.out.println(i);
        }
        
    }
}
