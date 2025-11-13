import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value,sum=0, i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        value= input.nextInt();

        while(i<value){
            if(value % i == 0){
                sum += i;
            }
            i++;
            if(i==value)
                break;
        }
        if(sum==value)
            System.out.print("girilen sayı mükemmel sayıdır");
        else
            System.out.print("girilen sayı mükemmel sayı değildir");
    }
}
