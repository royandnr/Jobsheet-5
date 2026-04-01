package minggu5;

public class Sum {

    int[] keuntungan;

    // Konstruktor berparameter
    public Sum(int[] keuntungan) {
        this.keuntungan = keuntungan;
    }

    // Metode Brute Force: penjumlahan iteratif
    public int totalBF() {
        int total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    // Metode Divide and Conquer: penjumlahan rekursif
    public int totalDC(int[] arr, int low, int high) {
        // Base case: hanya 1 elemen
        if (low == high) {
            return arr[low];
        }

        // Divide: cari titik tengah
        int mid = (low + high) / 2;

        // Conquer: hitung jumlah kiri dan kanan secara rekursif
        int lsum = totalDC(arr, low, mid);
        int rsum = totalDC(arr, mid + 1, high);

        // Combine: gabungkan hasil kiri dan kanan
        return lsum + rsum;
    }
}