import java.util.Scanner;
public class Avarage {
    public static void main(String[] args) {
        int values,sum=0,count=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        values= input.nextInt();


        for (int i = 1; i<= values; i++){
            if(i % 3 ==0 && i % 4 == 0)
            {
                sum += i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Girilen sayı: "+ values);
            System.out.println("Bulunan sayı adedi: "+ count);
            System.out.println("Girilen sayıya kadar olan 3 ve 4'e bölünebilen sayıların ortalaması: " + (sum / count));
        } else {
            System.out.println("Girilen aralıkta 3 ve 4'e bölünebilen sayı yok.");
        }

    }
}
