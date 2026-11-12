
import java.util.Scanner;

public class CafeKampus28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice"
        };

        int[] harga = {
                15000, 13000, 10000, 12000, 8000, 18000, 20000
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu ditemukan: " + menu[i]);
                System.out.println("Harga: Rp" + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, menu " + cari + " tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        while (jumlah <= 0) {
            System.out.print("Jumlah harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
            input.nextLine();
        }

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];

                        total += harga[j];
                        valid = true;

                        System.out.println("Menu berhasil ditambahkan!");
                        break;
                    }
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia. Silakan pilih menu yang ada.");
                }
            }
        }
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("Total pembayaran: Rp" + total);

        input.close();
    }
}
