import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    int mat,fizik,kimya,turkce,tarih,muzik;

    System.out.print("Matematik Notunuzu giriniz: ");
    mat=input.nextInt();

    System.out.print("Fizik Notunuzu giriniz: ");
    fizik=input.nextInt();

    System.out.print("Kimya Notunuzu giriniz: ");
    kimya=input.nextInt();

    System.out.print("Türkçe Notunuzu giriniz: ");
    turkce=input.nextInt();

    System.out.print("Tarih Notunuzu giriniz: ");
    tarih=input.nextInt();

    System.out.print("Müzik Notunuzu giriniz: ");
    muzik=input.nextInt();

    int toplam = mat+fizik+kimya+turkce+tarih+muzik;
    double ort = toplam/6.0;
    String sonuc = ort>60? "Sınıfı Geçti":"Sınıfta Kaldı";
    System.out.print(sonuc);

}
