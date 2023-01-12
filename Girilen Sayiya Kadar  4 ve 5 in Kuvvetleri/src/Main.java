import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.println("4'ün kuvvetleri: ");
        for (b = 1; b <= a; b *= 4) {
            System.out.println(b);
        }
        System.out.println("5'in kuvvetleri: ");
        for (b = 1; b <= a; b *= 5) {
            System.out.println(b);
        }
    }
}