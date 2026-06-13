//Import library 
//Berfungsi untuk mengimpor class scaner yang berfungsi menerima input keyboard
//Karena tanpa source code ini program akan eror
import java.util.Scanner; 

//Membuat class berfungsi untuk membuat claas bernama MenuMakanan
//Nama Class harus sama dengan nama file karena jika tidak akan eror
public class MenuMakanan {

    //Method Main Merupakan method utama yang pertama kali dijalankan saat program dieksekusi. 
    //Program Java selalu dimulai dari method main()
    public static void main(String[] args) {

        //Membuat Objek Scanner berfungsi membuat objek scanner bernama input 
        //yang diinput dari ketikan keyboard
        Scanner input = new Scanner(System.in);

        //Array menu dan harga 
        //Array menu berfungsi untuk menyimpan data makanan
        //Array Harga berfungsi untuk menyimpan data harga
        String[] makanan = {"Soto", "Rawon", "Pecel", "Bakso", "Siomay"};
        int[] harga = {15000, 20000, 10000, 12500, 25000};

        //Input Jumlah Pesanan berfungsi untuk mengisi berapa pesanan yang akan di pesan
        //Contoh saya pesan 3 jenis makanan maka akan saya input 3
        System.out.print("Berapa jenis makanan yang dipesan? ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        //Membuat array pesanan yang dipesan oleh saya tadi
        //semisal saya memesan 3 maka akan masuk jumlah pesanan 3
        //Array ini berfungsi menyimpan data pesanan
        String[] pesanan = new String[jumlahPesanan];
        //Membuaut Array Porsi 
        //Sebelumnya saya sudah input untuk jumlah pesanan nya berapa
        //lalu nanti akan diperintahkan isi jumlah porsi array ini berfungi menyimpan data porsi
        int[] porsi = new int[jumlahPesanan];

        // Input pesanan looping
        //Berfungsi ketika saya sebelumnya memesan 3 maka input ini akan loop 3 kali
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan ke-" + (i + 1) + " : ");
            //Input makanan yang nanti akan looping sebanyak 3 kali
            //dan data nya akan disimpan di Array Makanan
            pesanan[i] = input.nextLine();

            System.out.print("Masukkan jumlah porsi : ");
            //Input porsi makanan yang nanti juga akan looping sebanyak 3 kali
            //dan data nya akan disimpan di Array Porsi
            porsi[i] = input.nextInt();
            input.nextLine();
        }
        //Menyimpan totoal seluruh pembayaran atau jumlah dari pesanan yang saya pesan
        int total = 0;

        System.out.println("\nTotal Harga :");

        // Proses perhitungan dai pesanan yang sedang saya pesan
        for (int i = 0; i < jumlahPesanan; i++) {
            for (int j = 0; j < makanan.length; j++) {
                if (pesanan[i].equalsIgnoreCase(makanan[j])) {
                    int subtotal = harga[j] * porsi[i];
                    total += subtotal;

                    //Menampilkan detail Dari makananan serta harga dan porsi yang di pesan
                    System.out.println("✓ " + makanan[j] +
                            " @" + harga[j] +
                            " * " + porsi[i] +
                            " = " + subtotal);
                }
            }
        }
        //Menampilkan total harga keseluruhan
        System.out.println("Total = " + total);
    }
}