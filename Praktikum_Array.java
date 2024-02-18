import java.util.Scanner;

public class Praktikum_Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // variabel global
        double totalBobotNilaiSks = 0, totalSks = 0;
        String[][] nilaiMhs = new String[8][5];
        String[] mataKuliah = {"Agama","KTI", "CTPS", "Daspro", "Prak Daspro", "Inggris", "Indonesia", "Matematika"};
        
        System.out.println("===================================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("===================================");

        // user input (inputan: nama MK, bobot SKS, serta nilai)
        for (int i = 0; i < nilaiMhs.length; i++) {
            nilaiMhs[i][0] = mataKuliah[i];
            System.out.print("Masukkan Nilai Angka untuk MK " + nilaiMhs[i][0] + ": ");
            nilaiMhs[i][1] = sc.next();
            System.out.print("Masukkan jumlah sks : ");
            nilaiMhs[i][4] = sc.next();
        }

        // tampilkan data array
        System.out.println("============================");
        System.out.printf("| %-15s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("============================");
        for(int i = 0; i < nilaiMhs.length; i++){
            System.out.printf("| %-15s | %-10s | %-10s | %-10s |\n", nilaiMhs[i][0], nilaiMhs[i][1], getNilaiHuruf(Integer.parseInt(nilaiMhs[i][1])), getBobotNilai(Double.parseDouble(nilaiMhs[i][1])));
            
            int sksMk = Integer.parseInt(nilaiMhs[i][4]);
            totalBobotNilaiSks += getBobotNilai(Double.parseDouble(nilaiMhs[i][1])) * sksMk;
            totalSks += sksMk;
        }

        System.out.println("============================");
        double IpSemester = totalBobotNilaiSks / totalSks;
        System.out.println("IP Semester Anda adalah: " + String.format("%.2f", IpSemester));
    }

    private static String getNilaiHuruf(int nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka > 73 && nilaiAngka <= 80) {
            return "B+";
        } else if (nilaiAngka > 65 && nilaiAngka <= 73) {
            return "B";
        } else if (nilaiAngka > 60 && nilaiAngka <= 65) {
            return "C+";
        } else if (nilaiAngka > 50 && nilaiAngka <= 60) {
            return "C";
        } else if (nilaiAngka > 39 && nilaiAngka <= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    private static double getBobotNilai(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.0;
        } else if (nilaiAngka > 73) {
            return 3.5;
        } else if (nilaiAngka > 65) {
            return 3.0;
        } else if (nilaiAngka > 60) {
            return 2.5;
        } else if (nilaiAngka > 50) {
            return 2.0;
        } else if (nilaiAngka > 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
