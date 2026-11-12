
import java.util.Scanner;

public class SearchNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }

        int[] nilai = new int[jumlah];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Pencarian gagal!");
            System.out.println("Nilai yang dicari: " + key);
            System.out.println("Nilai " + key + " tidak ditemukan dalam array.");
            System.out.println("Jumlah elemen array yang diperiksa: " + nilai.length);
        }

        input.close();
    }
}
