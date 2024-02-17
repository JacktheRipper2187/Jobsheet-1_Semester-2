import java.util.Scanner;

public class Praktikum_Pemilihan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("================================");
        System.out.println("================================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100){
            System.out.println("Nilai Tidak Valid ");
            System.out.println("================================");
            System.out.println("================================");
            return;
        }
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;

        String nilaiHuruf = "";
        String keterangan = "";

        if (nilaiAkhir > 80){
            nilaiHuruf = "A";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            keterangan = "LULUS"; 
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            keterangan = "LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            keterangan = "TIDAK LULUS";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            keterangan = "TIDAK LULUS";
        } 

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: "+ nilaiHuruf);
        System.out.println("================================");
        System.out.println("================================");
        if (keterangan.equals("LULUS")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }

         sc.close();
                
    
    }
}