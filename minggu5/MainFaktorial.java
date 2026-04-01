package minggu5;

import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan dicari faktorialnya: ");
        int n = sc.nextInt();

        Faktorial obj = new Faktorial();

        System.out.println(n + "! (Brute Force)     = " + obj.faktorialBF(n));
        System.out.println(n + "! (Divide & Conquer) = " + obj.faktorialDC(n));

        sc.close();
    }
}