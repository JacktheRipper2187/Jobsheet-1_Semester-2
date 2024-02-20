import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        // Inisialisasi array KODE dan KOTA
        String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};

        // Input kode plat nomor dari pengguna
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (satu huruf): ");
        String inputKode = sc.next();

        // Cari nama kota berdasarkan kode plat nomor
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(inputKode)) {
                index = i;
                break;
            }
        }

        // Menampilkan hasil
        if (index != -1) {
            System.out.println("Nama kota untuk kode plat " + inputKode + " adalah: " + KOTA[index]);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        sc.close();
    }
}
