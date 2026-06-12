import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array menu dan harga
        String[] makanan = {"Es Teh", "Teh Tawar", "Pop Ice", "Cocacola", "Sprite"};
        int[] harga = {15000, 20000, 10000, 12500, 25000};

        System.out.print("Berapa jenis minuman yang dipesan? ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        String[] pesanan = new String[jumlahPesanan];
        int[] porsi = new int[jumlahPesanan];

        // Input pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama minuman ke-" + (i + 1) + " : ");
            pesanan[i] = input.nextLine();

            System.out.print("Masukkan jumlah porsi : ");
            porsi[i] = input.nextInt();
            input.nextLine();
        }

        int total = 0;

        System.out.println("\nTotal Harga :");

        // Proses perhitungan
        for (int i = 0; i < jumlahPesanan; i++) {
            for (int j = 0; j < makanan.length; j++) {
                if (pesanan[i].equalsIgnoreCase(makanan[j])) {
                    int subtotal = harga[j] * porsi[i];
                    total += subtotal;

                    System.out.println("✓ " + makanan[j] +
                            " @" + harga[j] +
                            " * " + porsi[i] +
                            " = " + subtotal);
                }
            }
        }

        System.out.println("Total = " + total);
    }
}