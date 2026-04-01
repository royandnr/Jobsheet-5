package minggu5;

public class NilaiMahasiswa {

    String[] nama;
    int[] nilaiUTS;
    double[] nilaiUAS;

    // Konstruktor
    public NilaiMahasiswa(String[] nama, int[] nilaiUTS, double[] nilaiUAS) {
        this.nama = nama;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // a) Nilai UTS tertinggi menggunakan Divide and Conquer
    public int maxUTSDC(int[] arr, int low, int high) {
        // Base case: hanya 1 elemen
        if (low == high) {
            return arr[low];
        }
        // Divide
        int mid = (low + high) / 2;
        // Conquer
        int leftMax  = maxUTSDC(arr, low, mid);
        int rightMax = maxUTSDC(arr, mid + 1, high);
        // Combine
        return Math.max(leftMax, rightMax);
    }

    // b) Nilai UTS terendah menggunakan Divide and Conquer
    public int minUTSDC(int[] arr, int low, int high) {
        // Base case: hanya 1 elemen
        if (low == high) {
            return arr[low];
        }
        // Divide
        int mid = (low + high) / 2;
        // Conquer
        int leftMin  = minUTSDC(arr, low, mid);
        int rightMin = minUTSDC(arr, mid + 1, high);
        // Combine
        return Math.min(leftMin, rightMin);
    }

    // c) Rata-rata nilai UAS menggunakan Brute Force
    public double rataUASBF() {
        double total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total += nilaiUAS[i];
        }
        return total / nilaiUAS.length;
    }
}