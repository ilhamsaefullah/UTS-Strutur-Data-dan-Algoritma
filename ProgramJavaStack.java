//Import library
//Import Scanner Berfungsi untuk mengimpor class scaner yang berfungsi menerima input keyboard
//Import Stack digunakan untuk membuat struktur data Stack
import java.util.Scanner;
import java.util.Stack;

//Membuat class berfungsi untuk membuat claas bernama ProgramJavaStack
//Nama Class harus sama dengan nama file karena jika tidak akan eror
public class ProgramJavaStack {

    //Method Main Merupakan method utama yang pertama kali dijalankan saat program dieksekusi. 
    //Program Java selalu dimulai dari method main()
    public static void main(String[] args) {

        //Membuat Objek Scanner berfungsi membuat objek scanner bernama input 
        //yang diinput dari ketikan keyboard
        Scanner input = new Scanner(System.in);

        //Membuat 2 buah stack kosong 
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        //Digunakan untuk memasukan input stack 1
        System.out.print("Jumlah elemen Stack 1 : ");
        int n1 = input.nextInt();

        //Digunakan untuk mengisi elemen stack yang sebelumnya diinput
        //Semisal yang diinput 3 maka akan melakukan pengisian stack sebanyak 3 kali
        System.out.println("Masukkan elemen Stack 1");
        for(int i = 0; i < n1; i++) {
            stack1.push(input.nextInt());
        }

        //Digunakan untuk memasukan input stack 2
        System.out.print("\nJumlah elemen Stack 2 : ");
        int n2 = input.nextInt();

        //Digunakan untuk mengisi elemen stack yang sebelumnya diinput
        //Semisal yang diinput 3 maka akan melakukan pengisian stack sebanyak 3 kali
        System.out.println("Masukkan elemen Stack 2");
        for(int i = 0; i < n2; i++) {
            stack2.push(input.nextInt());
        }

        //Berfungsi untuk menampilkan isi kedua stack
        System.out.println("\nIsi Stack 1 : " + stack1);
        System.out.println("Isi Stack 2 : " + stack2);

        //Berfungsi untuk membandingkan kedua stack apakah ada persamaan atau perbedaan
        if(stack1.equals(stack2)) {
            System.out.println("\nKedua Stack SAMA");
        } else {
            System.out.println("\nKedua Stack BERBEDA");
        }

        input.close();
    }
}