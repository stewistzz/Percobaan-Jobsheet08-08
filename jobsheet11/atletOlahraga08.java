import java.util.Arrays;

public class atletOlahraga08 {
    public static void main(String[] args) {
        
        // String[] atletBadminton = {"atlet 1", "atlet 2", "atlet 3", "atlet 4", "atlet 5"};
        // String[] atletTenisMeja = {"atlet 6", "atlet 7", "atlet 8", "atlet 9", "atlet 10"};
        // String[] atletBasket = {"atlet 11", "atlet 12", "atlet 13", "atlet 14", "atlet 15"};
        // String[] atletVoli = {"atlet 16", "atlet 17", "atlet 18", "atlet 19", "atlet 20"};

        String[][] atletBadminton = {
            {"atlet 1", "atlet 2", "atlet 3", "atlet 4", "atlet 5"},
            {"atlet 6", "atlet 7", "atlet 8", "atlet 9", "atlet 10"},
            {"atlet 11", "atlet 12", "atlet 13", "atlet 14", "atlet 15"},
            {"atlet 16", "atlet 17", "atlet 18", "atlet 19", "atlet 20"}
            };

        System.out.println(atletBadminton[0][2]);
        System.out.println();

        // mengurutkan data atlet
        for (int i = 0; i < atletBadminton.length; i++) {
            for (int j = 0; j < atletBadminton.length; j++) {
                System.out.println(atletBadminton[i][j]);
            }
        }
    }
}
