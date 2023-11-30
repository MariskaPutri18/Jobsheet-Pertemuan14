import java.util.Scanner;
public class Tugas1 {
    public static void DeretDescendingRekursif (int n) {
        if (n >= 0){
            System.out.print(n + " ");
            DeretDescendingRekursif(n -1);
        }
         
    }
    public static void DeretDescandingIteratif (int n){
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Masukkan jumlah n :");
        n = sc.nextInt();
        System.out.println("Fungsi Rekrusif");
        DeretDescendingRekursif(n);
        System.out.println("\nFungsi Iteratif");
        DeretDescandingIteratif(n);
    }
}
