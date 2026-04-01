package minggu5;

public class Faktorial {

    // Metode Brute Force: menggunakan perulangan for
    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    // Metode Divide and Conquer: menggunakan rekursi
    public int faktorialDC(int n) {
        if (n == 0 || n == 1) {
            // Base case: 0! = 1 dan 1! = 1
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * faktorialDC(n - 1);
        }
    }
}