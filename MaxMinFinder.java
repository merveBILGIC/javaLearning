import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int count = 1;
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (count <= n) {
            System.out.print(count + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            count++;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}