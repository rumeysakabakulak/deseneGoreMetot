import java.util.Scanner;

public class deseneGoreMetot {
    static void desen1(int n) {
        for (int i = n; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }
    static void desen2(int n) {
        for (int i = 0; i <= n; i += 5) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = inp.nextInt();
        desen1(n);
        desen2(n);

    }
}
