import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        int total = 0, count = 0;

        System.out.print("Matematik notu: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            count++;
        }

        System.out.print("Fizik notu: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            count++;
        }

        System.out.print("Türkçe notu: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            count++;
        }

        System.out.print("Kimya notu: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            count++;
        }

        System.out.print("Müzik notu: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            count++;
        }

        if (count == 0) {
            System.out.println("Geçerli not girilmedi, ortalama hesaplanamıyor!");
            return;
        }

        double average = total / (double) count;

        System.out.println("Ortalamanız: " + average);

        if (average >= 55) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }
    }
}
