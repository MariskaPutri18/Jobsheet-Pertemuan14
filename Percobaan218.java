import java.util.Scanner;

public class Percobaan218 {
    public static int hitungPangkat(int x, int y) {
        if (y == 0){
            return (1);
        } else{
            return(x * hitungPangkat(x, y -1));
        }
        
    }
    public static void cetakPangkat(int x, int y) {
        System.out.print("hitungPangkat(" + x + "," + y + ") dicetak ");
        for (int i = 1; i <= y; i++) {
            System.out.print(x);
            if (i < y) {
                System.out.print("x");
            } else {
                System.out.print(" = " + hitungPangkat(x, y));
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;
        int cetakPangkat;
        System.out.print("Bilangan yang dihitung");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        cetakPangkat(bilangan,pangkat);
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
