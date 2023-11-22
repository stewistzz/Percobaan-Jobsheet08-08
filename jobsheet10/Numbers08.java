import java.util.Arrays;

public class Numbers08 {
    public static void main(String[] args) {
        
        int [][] myNumbers = new int[3][];
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];
        // System.out.println(Arrays.toString(myNumbers[0]));
        // System.out.println(Arrays.toString(myNumbers[1]));
        // System.out.println(Arrays.toString(myNumbers[2]));

        // code 1
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // code 2
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }

    }
}
