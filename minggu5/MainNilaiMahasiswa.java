package minggu5;

public class MainNilaiMahasiswa {

    public static void main(String[] args) {

        // Data mahasiswa sesuai tabel pada jobsheet
        String[] nama = {
            "Budi", "Siti", "Ahmad", "Dewi", "Eko",
            "Rina", "Hadi", "Putri", "Joko", "Maya"
        };

        int[] nilaiUTS = { 78, 85, 90, 72, 88, 95, 65, 80, 77, 92 };

        double[] nilaiUAS = { 80.0, 88.0, 85.0, 75.0, 90.0, 92.0, 70.0, 83.0, 78.0, 95.0 };

        NilaiMahasiswa nm = new NilaiMahasiswa(nama, nilaiUTS, nilaiUAS);

        // a) Nilai UTS tertinggi (Divide and Conquer)
        int maxUTS = nm.maxUTSDC(nilaiUTS, 0, nilaiUTS.length - 1);

        // b) Nilai UTS terendah (Divide and Conquer)
        int minUTS = nm.minUTSDC(nilaiUTS, 0, nilaiUTS.length - 1);

        // c) Rata-rata UAS (Brute Force)
        double rataUAS = nm.rataUASBF();

        System.out.println("========== Hasil Analisis Nilai Mahasiswa ==========");
        System.out.println("a) Nilai UTS Tertinggi (Divide & Conquer) : " + maxUTS);
        System.out.println("b) Nilai UTS Terendah  (Divide & Conquer) : " + minUTS);
        System.out.printf("c) Rata-rata Nilai UAS (Brute Force)      : %.2f%n", rataUAS);
        System.out.println("====================================================");
    }
}