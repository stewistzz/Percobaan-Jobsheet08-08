package jobsheet13;

public class varArgs08 {
    public static void main(String[] args) {
    tampilISi(10, 2, 3, 45, 5, 69);    
    tampilNama("Dinas", "Dani", "Dimas");
    }

    static void tampilISi(int ...a) {
        System.out.println("Jumlah parameter ada : " + a.length);
        System.out.println("isinya : ");

        for (int i = 0; i < a.length; i++) {
            System.out.println("Parameter ke-" + (i+1) + " : " + a[i]);
        }
    }
   
    static void tampilNama(String ...nama) {
        System.out.println("Jumlah nama dari guru ada : " + nama.length);
        System.out.println("isinya : ");

        for (int i = 0; i < nama.length; i++) {
            System.out.println("nama guru ke-" + (i+1) + " : " + nama[i]);
        }
    }
}
