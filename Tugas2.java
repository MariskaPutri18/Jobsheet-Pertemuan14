import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n= sc.nextInt();

        int total = PenjumlahanRekursif(n);

        System.out.println("Total secara rekursif: " + total);
    }

    static int PenjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + PenjumlahanRekursif(n - 1);
        }
    }


}
