
import java.util.Scanner;

public class NilaiMahasiswa28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = input.nextInt();

        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }
        int[] nilai = new int[jumlah];
        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;
        double rataRata;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
            if (nilai[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        rataRata = (double) total / nilai.length;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": "
                        + nilai[i] + " (LULUS)");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": "
                        + nilai[i] + " (TIDAK LULUS)");
            }
        }

        System.out.println("Total nilai       : " + total);
        System.out.println("Rata-rata         : " + rataRata);
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);
        System.out.println("Jumlah mahasiswa LULUS       : " + lulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS : " + tidakLulus);

        input.close();
    }
}
