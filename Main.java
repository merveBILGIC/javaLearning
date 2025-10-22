import java.util.Scanner;
void main() {

   Scanner input = new Scanner(System.in);
    int km;
    double perKm = 2.20, total = 10.0;
   System.out.print("Mesafeyi Km cinsinden  giriniz: ");
   km = input.nextInt();

   total += (km * perKm);
   total = total < 20.0 ? 20.0: total;
   System.out.print("Toplam Tutar: " + total);
}
