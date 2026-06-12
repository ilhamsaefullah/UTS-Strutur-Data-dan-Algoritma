import java.util.Scanner;
import java.util.Stack;

public class Stack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        System.out.print("Jumlah elemen Stack 1 : ");
        int n1 = input.nextInt();

        System.out.println("Masukkan elemen Stack 1");
        for(int i = 0; i < n1; i++) {
            stack1.push(input.nextInt());
        }

        System.out.print("\nJumlah elemen Stack 2 : ");
        int n2 = input.nextInt();

        System.out.println("Masukkan elemen Stack 2");
        for(int i = 0; i < n2; i++) {
            stack2.push(input.nextInt());
        }

        System.out.println("\nIsi Stack 1 : " + stack1);
        System.out.println("Isi Stack 2 : " + stack2);

        if(stack1.equals(stack2)) {
            System.out.println("\nKedua Stack SAMA");
        } else {
            System.out.println("\nKedua Stack BERBEDA");
        }

        input.close();
    }
}