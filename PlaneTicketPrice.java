import java.util.Scanner;
public class PlaneTicketPrice {
    public static void main(String[] args) {
        int km, direction, age;
        double normalPrice, ageDiscount = 0, roundTripDiscount = 0, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gidilecek mesafeyi Km cinsinden giriniz: ");
        km = input.nextInt();

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        direction = input.nextInt();

        // Geçerli veri kontrolü
        if (km <= 0 || age <= 0 || (direction != 1 && direction != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        // Normal fiyat
        normalPrice = km * 0.10;


        if (age < 12) {
            ageDiscount = normalPrice * 0.50;
        } else if (age >= 12 && age <= 24) {
            ageDiscount = normalPrice * 0.10;
        } else if (age > 65) {
            ageDiscount = normalPrice * 0.30;
        }

        double discountedPrice = normalPrice - ageDiscount;


        if (direction == 2) {
            roundTripDiscount = discountedPrice * 0.20;
            discountedPrice = (discountedPrice - roundTripDiscount) * 2;
        }

        totalPrice = discountedPrice;

        System.out.println("Toplam Tutar = " + totalPrice + " TL");

    }

}

