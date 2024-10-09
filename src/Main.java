import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int sayi;
        int tahmin;
        int hak = 3;

        sayi = rand.nextInt(1,101);


        while(hak > 0) {
            System.out.println("0'dan 100'e kadar tahmin giriniz: ");
            tahmin = scan.nextInt();

                if(tahmin != sayi) {
                    hak--;
                    System.out.println("Yanlış tahmin, kalan hak: " + hak);

                }
                else {
                    System.out.println("Tebrikler Bildiniz.");
                    break;
                }

                if (hak == 0) {
                    System.out.println("Hakkınız Kalmadı.");
                    break;
            }

            }
        }
    }
