package minggu5;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang akan dihitung pangkatnya: ");
        int jumlah = sc.nextInt();

        // Instansiasi Array of Object
        Pangkat[] arrPangkat = new Pangkat[jumlah];

        // Input nilai dan pangkat untuk setiap elemen
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan pangkat ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            arrPangkat[i] = new Pangkat(nilai, pangkat);
        }

        // Tampilkan hasil
        System.out.println("\n--- Hasil Perhitungan Pangkat ---");
        for (int i = 0; i < jumlah; i++) {
            double hasilBF = arrPangkat[i].pangkatBF(arrPangkat[i].nilai, arrPangkat[i].pangkat);
            double hasilDC = arrPangkat[i].pangkatDC(arrPangkat[i].nilai, arrPangkat[i].pangkat);
            System.out.println(arrPangkat[i].nilai + "^" + arrPangkat[i].pangkat
                    + " (Brute Force)      = " + (long) hasilBF);
            System.out.println(arrPangkat[i].nilai + "^" + arrPangkat[i].pangkat
                    + " (Divide & Conquer) = " + (long) hasilDC);
        }

        sc.close();
    }
}