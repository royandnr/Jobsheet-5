package minggu5;

public class Pangkat {

    int nilai;   // angka yang akan dipangkatkan
    int pangkat; // nilai pemangkat

    // Konstruktor berparameter
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // Metode Brute Force: menggunakan perulangan
    public double pangkatBF(int nilai, int pangkat) {
        double hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    // Metode Divide and Conquer: menggunakan rekursi
    public double pangkatDC(int nilai, int pangkat) {
        // Base case
        if (pangkat == 0) {
            return 1;
        }
        // Divide: bagi setengah
        double half = pangkatDC(nilai, pangkat / 2);

        if (pangkat % 2 == 0) {
            // Combine: jika genap -> half * half
            return half * half;
        } else {
            // Combine: jika ganjil -> nilai * half * half
            return nilai * half * half;
        }
    }
}