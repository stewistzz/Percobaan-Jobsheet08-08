package jobsheet13;

public class TerimaKasih_08 {
    public static void main(String[] args) {
        ucapanTerimakasih();

        String ucapan = "Terimakasih pak.. bu.. semomga sehat selalu";
        ucapanTambahan(ucapan);

        //
        int[] numbers = { 1, 2, 3 };
        increment(numbers);
        //System.out.println(numbers[1]); // Output: 2
    }

    static void ucapanTerimakasih() {
        System.out.println("thankyou fot being thw best teacher in the world. \n"
                + "You inspired in me a love for learning anf made me feel like i could ask you anything");
        System.out.println();
    }

    static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    static void increment(int[] nums) {
        System.out.println(nums[2]);
    }

}
