import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke: ");
        int bulanKe = sc.nextInt();
        int jumlahPasangan = hitungPasanganMarmut(bulanKe);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulanKe + " adalah: " + jumlahPasangan);
    }

    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1; 
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }


}
