import java.util.Scanner;
void main() {
   int n1, n2, select;
   Scanner input = new Scanner(System.in);
   System.out.print("ilk sayısı giriniz: ");
   n1= input.nextInt();
    System.out.print("ikinci sayısı giriniz: ");
    n2= input.nextInt();

    System.out.println("Lütfen işlemi seçiniz \n Toplama:1 \n Çıkarma:2\n Çarpma:3 \n Bölme:4 ");
    select=input.nextInt();

    switch (select){
        case 1:
            System.out.print("Seçilen işlem toplama:"+ n1+n2 );
            break;

        case 2:
            System.out.print("Seçilen işlem Çıkarma:" + (n1-n2 ));
            break;
        case 3:
            System.out.print("Seçilen işlem Çarpma:" + (n1*n2 ));
            break;
        case 4:
            if (n2==0){ System.out.print("Bir sayı sıfıra bölünemez." ); break; }

            System.out.print("Seçilen işlem Bölme:" + (n1/ n2 ));
            break;
        default:
            System.out.print("Yanlış seçim yapıldı!:");
    }
}
