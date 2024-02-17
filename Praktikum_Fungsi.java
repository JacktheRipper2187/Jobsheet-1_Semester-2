import java.util.Arrays;
public class Praktikum_Fungsi {

    public static void main(String[] args) {
        // Data input
        int[][] stockData = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        // 1. Display income for each branch if all flowers are sold out
        PendapatanSetiapCabang(stockData, hargaBunga);

        // 2. Get the stock of each flower in RoyalGarden 4 after considering additional information
        int[] InfoTambahan = {-1, -2, 0, -5};
        int[] stokRoyalGarden4SetelahPengurangan = mendapatkanStokRoyalGarden4(stockData[3], InfoTambahan);
        System.out.println("Stok RoyalGarden 4 setelah pengurangan: " + Arrays.toString(stokRoyalGarden4SetelahPengurangan));
    }

    // 1. Function to display income for each branch if all flowers are sold out
    private static void PendapatanSetiapCabang(int[][] stockData, int[] hargaBunga) {
        int totalPendapatan = 0;

        for (int i = 0; i < stockData.length; i++) {
            int[] stok = stockData[i];
            String cabang = "RoyalGarden " + (i + 1);

            int pendapatancabang = 0;
            for (int j = 0; j < stok.length; j++) {
                pendapatancabang += stok[j] * hargaBunga[j];
            }

            totalPendapatan += pendapatancabang;

            System.out.println("Pendapatan cabang " + cabang + ": " + pendapatancabang);
        }

        System.out.println("Total pendapatan dari semua cabang: " + totalPendapatan);
    }

    // 2. Function to get the stock of each flower in RoyalGarden 4 after considering additional information
    private static int[] mendapatkanStokRoyalGarden4(int[] stokRoyalGarden4, int[] InfoTambahan) {
        int[] StokTerupdate = Arrays.copyOf(stokRoyalGarden4, stokRoyalGarden4.length);

        for (int i = 0; i < InfoTambahan.length; i++) {
            StokTerupdate[i] += InfoTambahan[i];
        }

        return StokTerupdate;
    }
}
