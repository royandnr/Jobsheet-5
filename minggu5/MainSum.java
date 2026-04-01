package minggu5;

import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan keuntungan yang akan dihitung: ");
        int bulan = sc.nextInt();

        int[] dataKeuntungan = new int[bulan];

        // Input keuntungan per bulan
        for (int i = 0; i < bulan; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            dataKeuntungan[i] = sc.nextInt();
        }

        // Buat objek Sum
        Sum objSum = new Sum(dataKeuntungan);

        // Tampilkan hasil
        System.out.println("\nTotal Keuntungan (Brute Force)      = " + objSum.totalBF());
        System.out.println("Total Keuntungan (Divide & Conquer) = "
                + objSum.totalDC(dataKeuntungan, 0, dataKeuntungan.length - 1));

        sc.close();
    }
}