import java.util.Scanner;

public class Praktikum_Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        System.out.println("=====================");
    
        n = (n < 10) ? n + 10 : n;
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                System.out.print((i % 2 == 1) ? "* " : i + " ");
            }
        }

        scanner.close();
    }
}