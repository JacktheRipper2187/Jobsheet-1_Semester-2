import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Program selesai, Terimakasih!!");
                    break;
                default:
                    System.out.println("Menu tidak valid. Masukkan angka 1-4.");
            }
        } while (pilihan != 4);

        sc.close();
    }

    static void hitungKecepatan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (s): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = sc.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");
    }

    static void hitungJarak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = sc.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = sc.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");
    }

    static void hitungWaktu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jarak (s): ");
        double jarak = sc.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = sc.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");
    }
}
