package depo;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //1- uygulamanin baslamasi icin bir method olusturalım
        start();
    }

    public static void start () {

        DepoIslemleri runner=new DepoIslemleri();
        Scanner scanner=new Scanner(System.in);


        while (true){
            System.out.println("1.Ürün Tanimlama ");
            System.out.println("2.Ürün Listeleme ");
            System.out.println("3.Ürün Girisi ");
            System.out.println("4.Ürünü Rafa Koyma ");
            System.out.println("5.Ürün Cikis ");
            System.out.println("Seciminiz");

            int choose=scanner.nextInt();
            scanner.nextLine(); // satir temizliyor....

            switch (choose){
                case 1:
                    runner.urunTanimlama();
                    break;
                case 2:
                    runner.urunListele();
                    break;
                case 3:
                    runner.urunGirisi();
                    break;
                case 4:
                    runner.urunuRafaKoy();
                    break;
                case 5:
                    runner.urunCikisi();
                    break;
                case 6:
                    System.out.println("Cikis yapiliyor...");
                default:
                    System.out.println("Gecersiz bir islem yaptiniz...Kontrol ediniz..");


            }




        }


    }
}