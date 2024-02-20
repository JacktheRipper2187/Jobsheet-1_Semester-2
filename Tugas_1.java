import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
      
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (satu huruf): ");
        char inputKode = sc.next().toUpperCase().charAt(0); // jika pengguna menginput huruf kecil akan otomatis terbaca "uppercase"

        // Cari nama kota berdasarkan kode plat nomor
        int index = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Nama kota untuk kode plat " + inputKode + " adalah: ");
            for (int j = 0; j < KOTA[index].length; j++) {
                System.out.print(KOTA[index][j]);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        sc.close();
    }
}
